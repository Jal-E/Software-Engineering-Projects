package musicstreaming;

import java.util.List;

public class MusicApp {
    public static void main(String[] args) {
        SongService songService = new SongServiceProxy();

        // First search (expecting a delay)
        System.out.println("Searching for Song by ID (1):");
        System.out.println(songService.searchById(1));

        // Second search for the same song by ID (should be instant due to caching)
        System.out.println("\nSearching for Song by ID (1) again:");
        System.out.println(songService.searchById(1));

        // Search by title (first access with delay)
        System.out.println("\nSearching for Songs by Title 'Gasolina':");
        List<Song> songsByTitle = songService.searchByTitle("Gasolina");
        songsByTitle.forEach(System.out::println);

        System.out.println("\nSearching for Songs by Title 'Gasolina' again:");
        songsByTitle = songService.searchByTitle("Gasolina");
        songsByTitle.forEach(System.out::println);

        // Search by album (first access with delay)
        System.out.println("\nSearching for Songs by Album 'Barrio Fino':");
        List<Song> songsByAlbum = songService.searchByAlbum("Barrio Fino");
        songsByAlbum.forEach(System.out::println);

        System.out.println("\nSearching for Songs by Album 'Barrio Fino' again:");
        songsByAlbum = songService.searchByAlbum("Barrio Fino");
        songsByAlbum.forEach(System.out::println);
    }
}
