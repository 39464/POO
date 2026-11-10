package es.upm.etsisi.completo;

public class Song extends Audio {

    private String artist;

    public Song(String id, String title, String artist, int length) {
        super(id, title, length);
        this.artist = artist;
    }

    @Override
    public boolean equals(Object obj) {
        boolean equals = false;
        if(obj.getClass() == Song.class) {
            Song newSong = (Song) obj;
            if((newSong.getId()).equals(this.getId())) equals = true;
        }
        return equals;
    }

    @Override
    public int hashCode() {
        return this.getId().hashCode();
    }
}
