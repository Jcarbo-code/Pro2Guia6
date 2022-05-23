package computos;

import java.util.ArrayList;

public class ColaEspera {

    protected ArrayList<Elemento> elementos;

    public ColaEspera() {
        elementos = new ArrayList<>();
    }

    public void addElemento(Elemento elem) {
        boolean insertada = false;
        int i = 0;
        while (i < elementos.size() && !insertada) {
            if (elem.esMayor(elementos.get(i))) {
                elementos.add(i, elem);
                insertada = true;
            }
            i++;
        }
        if (!insertada) {
            elementos.add(elem);
        }
    }

    public int size() {
        return elementos.size();
    }

    public Elemento get(int i) {
        return elementos.get(i);
    }
}
