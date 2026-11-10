package es.upm.etsisi.herencia;

public abstract class Dispositivo {

    public boolean encendido;

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void encender(){
        setEncendido(true);
    }

    public void apagar(){
        setEncendido(false);
    }
}
