public class Satelite extends Astro{
    private double distanciaPlaneta;
    private double orbitaPlanetaria;
    private Planeta planetaPertecen;

    public Satelite(double radioEcuatorial, double rotacionSobreEje, double masa, double temperaturaMedia, double gravedad, double distanciaPlaneta, double orbitaPlanetaria, Planeta planetaPertecen) {
        super(radioEcuatorial, rotacionSobreEje, masa, temperaturaMedia, gravedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaPertecen = planetaPertecen;
    }

    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public Planeta getPlanetaPertecen() {
        return planetaPertecen;
    }

    public void setPlanetaPertecen(Planeta planetaPertecen) {
        this.planetaPertecen = planetaPertecen;
    }

    @Override
    public String toString() {
        return "Satelite{" +
                "distanciaPlaneta=" + distanciaPlaneta +
                ", orbitaPlanetaria=" + orbitaPlanetaria +
                ", planetaPertecen=" + planetaPertecen +
                '}';
    }
}
