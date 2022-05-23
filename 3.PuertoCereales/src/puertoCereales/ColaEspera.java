package puertoCereales;

import java.util.ArrayList;

public class ColaEspera {

    protected ArrayList<Elemento> elementos;

    public ColaEspera(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }

    public void addElemento(Elemento e) {
        boolean insertada = false;
        int i = 0;
        while (i < elementos.size() && !insertada) {
            if (e.esMayor(elementos.get(i))) {
                elementos.add(i, e);
                insertada = true;
            }
            i++;
        }
        if (!insertada) {
            elementos.add(e);
        }
        /*for (int i = 0; i < elementos.size(); i++) {      //VER LOGICA
            if (!elementos.get(i).esMayor(e)) {
                elementos.add(i, e);
            }
        }
        elementos.add(0,e);*/
    }

    public void addAll(ArrayList<Elemento> e) {
        for (int i = 0; i < e.size(); i++) {
            this.addElemento(e.get(i));
        }
    }
}
