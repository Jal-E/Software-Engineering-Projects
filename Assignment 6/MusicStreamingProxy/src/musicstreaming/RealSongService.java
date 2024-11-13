package musicstreaming;

import java.util.ArrayList;
import java.util.List;

public class RealSongService implements SongService {
    private List<Song> songs = new ArrayList<>();

    public RealSongService() {
        songs.add(new Song(1, "Gasolina", "Daddy Yankee", "Barrio Fino", 183));
        songs.add(new Song(2, "Dile", "Don Omar", "The Last Don", 222));
        songs.add(new Song(3, "Mayor Que Yo", "Wisin & Yandel, Daddy Yankee, Don Omar", "Los Vaqueros", 305));
        songs.add(new Song(4, "Lo Que Pasó, Pasó", "Daddy Yankee", "Barrio Fino", 197));
        songs.add(new Song(5, "Yo Voy", "Zion & Lennox ft. Daddy Yankee", "Motivando a la Yal", 213));
    }


    @Override
    public Song searchById(Integer songID) {
        delay();
        return songs.stream().filter(song -> song.getId().equals(songID)).findFirst().orElse(null);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        delay();
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        delay();
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                result.add(song);
            }
        }
        return result;
    }

    private void delay() {
        try {
            Thread.sleep(1000); // Simulate delay by a sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
