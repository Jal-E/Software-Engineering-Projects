package test;

import musicstreaming.SongServiceProxy;
import musicstreaming.Song;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SongServiceProxyTest {
    private SongServiceProxy proxy;

    @BeforeEach
    public void setUp() {
        proxy = new SongServiceProxy();
    }

    @Test
    public void testCachingById() {
        // First access should not be cached (expected delay)
        Song firstAccess = proxy.searchById(1);
        assertNotNull(firstAccess, "Song should not be null on first access");

        // Second access should be cached
        Song secondAccess = proxy.searchById(1);
        assertNotNull(secondAccess, "Song should be retrieved from cache on second access");
        assertEquals(firstAccess, secondAccess, "Cached song should be the same instance");
    }

    @Test
    public void testCachingByTitle() {
        // First search by title (expected delay)
        List<Song> firstAccess = proxy.searchByTitle("Gasolina");
        assertFalse(firstAccess.isEmpty(), "List should not be empty on first access");

        // Second search by title should be cached
        List<Song> secondAccess = proxy.searchByTitle("Gasolina");
        assertFalse(secondAccess.isEmpty(), "List should not be empty on second access");
        assertEquals(firstAccess, secondAccess, "Cached result should be the same instance");
    }

    @Test
    public void testCachingByAlbum() {
        // First search by album (expected delay)
        List<Song> firstAccess = proxy.searchByAlbum("Barrio Fino");
        assertEquals(2, firstAccess.size(), "Album should contain two songs");

        // Second search by album should be cached
        List<Song> secondAccess = proxy.searchByAlbum("Barrio Fino");
        assertEquals(firstAccess, secondAccess, "Cached result should be the same instance");
    }

    @Test
    public void testSearchByNonExistentId() {
        Song nonExistent = proxy.searchById(999);  // Non-existent ID
        assertNull(nonExistent, "Non-existent ID should return null");
    }

    @Test
    public void testSearchByNonExistentTitle() {
        List<Song> nonExistent = proxy.searchByTitle("NonExistentTitle");
        assertTrue(nonExistent.isEmpty(), "Non-existent title should return empty list");
    }

    @Test
    public void testSearchByNonExistentAlbum() {
        List<Song> nonExistent = proxy.searchByAlbum("NonExistentAlbum");
        assertTrue(nonExistent.isEmpty(), "Non-existent album should return empty list");
    }
}
