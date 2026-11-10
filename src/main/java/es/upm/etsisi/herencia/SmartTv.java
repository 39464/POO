package es.upm.etsisi.herencia;

public class SmartTv extends DispositivoInteligente{

    public SmartTv() {
        super();
        setConectado(true);
    }

    @Override
    public void conectar() {
        conectado = true;
        System.out.println("TV conectada");
    }

    public void desconectar(){
        conectado = false;
        System.out.println("TV desconectada");
    }

    public String estadoConexion(boolean conectado){
        String result = "Estado de conexion: "+(conectado == isConectado());
        return result;
    }
}
