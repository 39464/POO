package es.upm.etsisi.completo;

import java.util.ArrayList;

public class Playlist {
    private String title;
    private ArrayList<Song> songs;

    public Playlist(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(Song song){
        if(!songs.contains(song)) songs.add(song);
        return !songs.contains(song);
    }

    public boolean removeSong(Song song){
        if(songs.contains(song)) songs.remove(song);
        return songs.contains(song);
    }
}
