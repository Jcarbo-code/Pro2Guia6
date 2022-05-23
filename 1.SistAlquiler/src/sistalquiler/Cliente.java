package sistalquiler;

import java.util.ArrayList;

public class Cliente {

    protected ArrayList<Item> alquilados;
    int id;


    public Cliente(ArrayList<Item> alquilados, int id) {
        this.alquilados = alquilados;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void addItem(Item i){
        alquilados.add(i);
    }
    
    public ArrayList<Item> getAlquilados(){
        ArrayList aux=new ArrayList();
        aux.addAll(alquilados);
        return aux;
    }
}
