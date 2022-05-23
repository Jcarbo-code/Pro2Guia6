package sistalquiler;


public class Pelicula extends Item {

    protected String info;
    protected String titulo;
    protected int copias;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Pelicula(String titulo, int copias,String info) {
        this.titulo = titulo;
        this.copias = copias;
        this.info = info;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean disponible() {
        return copias > 0;
    }

    @Override
    public void alquiler() {
        if (disponible()) {
            setCopias(getCopias() - 1);
        }
    }
}