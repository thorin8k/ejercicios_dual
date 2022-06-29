public class Satelites extends Astros{

    int distancia;
    int orbita;
    String nombre_planeta;

    public Satelites(int masa, int diametro, int rotacion, int translacion, double distancia_media, double temperatura, double gravedad,
                     int distancia, int orbita, String nombre_planeta) {
        super(masa, diametro, rotacion, translacion, distancia_media, temperatura, gravedad);
        this.distancia = distancia;
        this.orbita = orbita;
        this.nombre_planeta = nombre_planeta;
    }

    @Override
    public String mostrar() {
        return "";
    }
}
