package es.upm.etsisi.completo;

public abstract class Audio {
    private String id;
    private String title;
    private Integer length;

    public Audio(String id, String title, Integer length) {
        this.id = id;
        this.title = title;
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
