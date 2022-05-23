package puertoCereales;

public class Barco implements Elemento {

    protected int capacidad;
    protected String nombre;

    public Barco(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public boolean esMayor(Elemento e) {
        Barco bar = (Barco) e;
        return (this.getCapacidad() > bar.getCapacidad());
    }

    @Override
    public String toString() {
        return this.nombre + ". capacidad " + this.capacidad + ".";
    }

    @Override
    public boolean equals(Object o) {
        try {
            Barco pro = (Barco) o;
            return this.getNombre().equals(pro.getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}
