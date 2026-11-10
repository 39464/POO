package es.upm.etsisi.herencia;

public interface Conectable {
    static int MAX_CONEXIONES = 3;
    public void conectar();
    public void desconectar();
    static void info(){
        System.out.println("Max conexiones: "+MAX_CONEXIONES);
    }
    String estadoConexion(boolean conectado);

}
