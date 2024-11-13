package test;

import musicstreaming.RealSongService;
import musicstreaming.Song;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RealSongServiceTest {
    private RealSongService realSongService;

    @BeforeEach
    public void setUp() {
        realSongService = new RealSongService();
    }

    @Test
    public void testSearchById() {
        Song song = realSongService.searchById(1);
        assertNotNull(song, "Song should not be null");
        assertEquals("Gasolina", song.getTitle(), "Title should be 'Gasolina'");
        assertEquals("Daddy Yankee", song.getArtist(), "Artist should be 'Daddy Yankee'");
    }

    @Test
    public void testSearchByNonExistentId() {
        Song song = realSongService.searchById(999);  // Non-existent ID
        assertNull(song, "Non-existent song ID should return null");
    }

    @Test
    public void testSearchByTitle() {
        var songs = realSongService.searchByTitle("Gasolina");
        assertFalse(songs.isEmpty(), "Songs list should not be empty");
        assertEquals(1, songs.size(), "Only one song should match 'Gasolina'");
        assertEquals("Daddy Yankee", songs.get(0).getArtist(), "Artist should be 'Daddy Yankee'");
    }

    @Test
    public void testSearchByAlbum() {
        var songs = realSongService.searchByAlbum("Barrio Fino");
        assertEquals(2, songs.size(), "There should be two songs in the 'Barrio Fino' album");
    }
}
