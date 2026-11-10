package es.upm.etsisi.herencia;

public abstract class DispositivoInteligente extends Dispositivo implements Conectable {
    boolean conectado;

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public boolean isConectado() {
        return conectado;
    }

    @Override
    public void conectar() {
        conectado = true;
    }

    @Override
    public void desconectar() {
        conectado = false;
    }
}
