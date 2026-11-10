package es.upm.etsisi.completo;
import java.util.ArrayList;
import java.util.Date;

public class Platform {

    private static Platform instance;

    private String name;
    private Date creationDate;

    private ArrayList<Song> songs;
    private ArrayList<Playlist> playlists;

    private Platform(){
        this.creationDate = new Date();
        this.songs = new ArrayList<>();
        this.playlists = new ArrayList<>();
    }

    public static Platform getInstance(){
        if(instance == null) instance = new Platform();
        return instance;
    }

    public void createSong(String id, String title, String artist, int length){
        Song song = new Song(id, title, artist, length);
        this.songs.add(song);
    }

    public void createPlaylist(String id){
        Playlist playlist = new Playlist(id);
        this.playlists.add(playlist);
    }
}
