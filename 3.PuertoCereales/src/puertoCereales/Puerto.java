package puertoCereales;

import java.util.ArrayList;

public class Puerto {

    protected ArrayList<Barco> barcos;
    protected ArrayList<Camion> camiones;

    public Puerto() {
        this.barcos = new ArrayList();
        this.camiones = new ArrayList();
    }

    public void addBarco(Barco b) {
        barcos.add(b);
    }

    public void addCamion(Camion c) {
        camiones.add(c);
    }

    public ArrayList<Barco> listarBarcos() {
        ArrayList<Barco> aux = new ArrayList();
        for (int i = 0; i < barcos.size(); i++) {
            aux.add(barcos.get(i));
        }
        return aux;
    }

    public ArrayList<Camion> listarCamiones() {
        ArrayList<Camion> aux = new ArrayList();
        for (int i = 0; i < camiones.size(); i++) {
            aux.add(camiones.get(i));
        }
        return aux;
    }

    public static void main(String[] args) {
        Puerto p = new Puerto();
        Camion c1 = new Camion(2, "2");
        Camion c2 = new Camion(1, "1");
        Camion c3 = new Camion(4, "4");
        Camion c4 = new Camion(3, "3");
        p.addCamion(c4);
        p.addCamion(c3);
        p.addCamion(c2);
        p.addCamion(c1);
        System.out.println(p.listarCamiones());
    }
}
