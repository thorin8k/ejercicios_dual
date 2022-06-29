public abstract class Astros {

    int masa;
    int diametro;
    int rotacion;
    int translacion;
    double distancia_media;
    double temperatura;
    double gravedad;

    public Astros(int masa, int diametro, int rotacion, int translacion, double distancia_media, double temperatura, double gravedad) {
        this.masa = masa;
        this.diametro = diametro;
        this.rotacion = rotacion;
        this.translacion = translacion;
        this.distancia_media = distancia_media;
        this.temperatura = temperatura;
        this.gravedad = gravedad;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getRotacion() {
        return rotacion;
    }

    public void setRotacion(int rotacion) {
        this.rotacion = rotacion;
    }

    public int getTranslacion() {
        return translacion;
    }

    public void setTranslacion(int translacion) {
        this.translacion = translacion;
    }

    public double getDistancia_media() {
        return distancia_media;
    }

    public void setDistancia_media(double distancia_media) {
        this.distancia_media = distancia_media;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public String toString() {
        return "Astros{" +
                "masa=" + masa +
                ", diametro=" + diametro +
                ", rotacion=" + rotacion +
                ", translacion=" + translacion +
                ", distancia_media=" + distancia_media +
                ", temperatura=" + temperatura +
                ", gravedad=" + gravedad +
                '}';
    }

    abstract public String mostrar();
}
