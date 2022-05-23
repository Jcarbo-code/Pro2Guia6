package puertoCereales;

public class Camion implements Elemento {

    protected int llegada;  //cuando se cargan se les asigna un numero, o hay que usar fecha?
    protected String patente;

    public Camion(int llegada, String patente) {
        this.llegada = llegada;
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getFechaCarga() {
        return llegada;
    }

    public void setLlegada(int llegada) {
        this.llegada = llegada;
    }

    @Override
    public boolean esMayor(Elemento e) {
        Camion cam = (Camion) e;
        return this.llegada > cam.getFechaCarga();
    }

    @Override
    public String toString() {
        return this.patente + ". Numero de carga; " + this.llegada + ".";
    }

    @Override
    public boolean equals(Object o) {
        try {
            Camion pro = (Camion) o;
            return this.getPatente().equals(pro.getPatente());
        } catch (Exception e) {
            return false;
        }
    }
}
