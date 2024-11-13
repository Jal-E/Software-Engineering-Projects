package musicstreaming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongServiceProxy implements SongService {
    private RealSongService realSongService;
    private Map<Integer, Song> idCache = new HashMap<>();
    private Map<String, List<Song>> titleCache = new HashMap<>();
    private Map<String, List<Song>> albumCache = new HashMap<>();

    public SongServiceProxy() {
        this.realSongService = new RealSongService();
    }

    @Override
    public Song searchById(Integer songID) {
        if (idCache.containsKey(songID)) {
            System.out.println("Fetching from cache for ID: " + songID);
            return idCache.get(songID);
        }
        Song song = realSongService.searchById(songID);
        if (song != null) {
            idCache.put(songID, song);
        }
        return song;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        if (titleCache.containsKey(title)) {
            System.out.println("Fetching from cache for Title: " + title);
            return titleCache.get(title);
        }
        List<Song> songs = realSongService.searchByTitle(title);
        titleCache.put(title, songs);
        return songs;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        if (albumCache.containsKey(album)) {
            System.out.println("Fetching from cache for Album: " + album);
            return albumCache.get(album);
        }
        List<Song> songs = realSongService.searchByAlbum(album);
        albumCache.put(album, songs);
        return songs;
    }
}
