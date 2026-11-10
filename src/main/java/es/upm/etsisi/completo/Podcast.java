package es.upm.etsisi.completo;

public class Podcast extends Audio{

    private String host;
    private Integer numEps;

    public Podcast(String id, String title, String host, Integer numEps, Integer length){
        super(id, title, length);
        this.host = host;
        this.numEps = numEps;
    }
}
