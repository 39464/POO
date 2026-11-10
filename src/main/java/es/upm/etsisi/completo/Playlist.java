package es.upm.etsisi.completo;

import java.util.ArrayList;

public class Playlist {
    private String title;
    private ArrayList<Audio> audios;

    public Playlist(String title) {
        this.title = title;
        this.audios = new ArrayList<>();
    }

    public boolean addAudio(Audio audio){ //relación de agregación, por lo que no se tiene que crear el objeto
        if(!audios.contains(audio)) audios.add(audio);
        return !audios.contains(audio);
    }

    public boolean removeSong(Audio audio){
        if(audios.contains(audio)) audios.remove(audio);
        return audios.contains(audio);
    }
}
