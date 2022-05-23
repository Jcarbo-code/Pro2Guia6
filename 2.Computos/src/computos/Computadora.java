package computos;

public class Computadora implements Elemento {

    protected String nombre;
    protected float velocidad;
    protected float memory;

    public Computadora(String nombre, float velocidad, float memory) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.memory = memory;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return this.nombre + ". speed " + this.velocidad + ". memory " + this.memory + ".";
    }

    @Override
    public boolean esMayor(Elemento c) {
        Computadora pc = (Computadora) c;
        return this.getVelocidad() > pc.getVelocidad();
    }
    
    @Override
    public boolean equals(Object o) {
        try {
            Computadora pc = (Computadora) o;
            return this.getNombre().equals(pc.getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}
