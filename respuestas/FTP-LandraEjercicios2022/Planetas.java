import java.util.ArrayList;

public class Planetas extends Astros{

    String nombre;
    int distancia_sol;
    int orbita_sol;
    boolean satelites;

    ArrayList<Satelites> lunas = new ArrayList<>();

    public Planetas(String nombre, int masa, int diametro, int rotacion, int translacion, double distancia_media,
                    double temperatura, double gravedad, int distancia_sol, int orbita_sol, boolean satelites, ArrayList<Satelites> lunas) {
        super(masa, diametro, rotacion, translacion, distancia_media, temperatura, gravedad);
        this.nombre = nombre;
        this.distancia_sol = distancia_sol;
        this.orbita_sol = orbita_sol;
        this.satelites = satelites;
        this.lunas = lunas;
    }

    @Override
    public String mostrar() {
        return "";
    }
}
