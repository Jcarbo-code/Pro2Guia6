package sistalquiler;

public class Vehiculo extends Item {

    protected String marca;
    protected int km;
    protected String patente;
    protected String tipo;
    protected boolean disponibilidad;
    
    public Vehiculo(String marca, int km, String patente, String tipo, boolean disponibilidad){
        this.marca=marca;
        this.km=km;
        this.patente=patente;
        this.tipo=tipo;
        this.disponibilidad=disponibilidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDisponibilidad(boolean disp) {
        this.disponibilidad = disp;
    }
    
    @Override
    public boolean disponible() {
        return disponibilidad;
    }

    @Override
    public void alquiler() {
        if (disponible()){
            setDisponibilidad(false);
        }
    }
}