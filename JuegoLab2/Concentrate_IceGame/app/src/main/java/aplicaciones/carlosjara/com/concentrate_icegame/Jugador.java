package aplicaciones.carlosjara.com.concentrate_icegame;

/**
 * Created by CarlosEnrique on 06/06/2016.
 */
public class Jugador {
    private String nombre;
    private int puntaje;

    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    public void sumarPuntaje(int Valor){
        this.puntaje += Valor;
    }
}
