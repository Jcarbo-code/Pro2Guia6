package computos;

public class Proceso implements Elemento {

    protected String nombre;
    protected float requirMemory;

    public Proceso(String nombre, float requirMemory) {
        this.nombre = nombre;
        this.requirMemory = requirMemory;
    }

    public float getRequirMemory() {
        return requirMemory;
    }

    public void setRequirMemory(float requirMemory) {
        this.requirMemory = requirMemory;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean esMayor(Elemento p) {
        Proceso pro = (Proceso) p;
        return this.getRequirMemory() > pro.getRequirMemory();
    }

    @Override
    public String toString() {
        return this.nombre + ". memory require " + this.requirMemory + ".";
    }

    @Override
    public boolean equals(Object o) {
        try {
            Proceso pro = (Proceso) o;
            return this.getNombre().equals(pro.getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}
