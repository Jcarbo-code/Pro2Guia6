package computos;

import java.util.ArrayList;

public class CentroComputos {

    ColaEspera computadoras;
    ColaEspera procesos;

    public CentroComputos() {
        this.computadoras = new ColaEspera();
        this.procesos = new ColaEspera();
    }

    public void addComputadora(Computadora e) {
        computadoras.addElemento(e);
    }

    public void addProceso(Proceso e) {
        procesos.addElemento(e);
    }
    
    /*public void ejecutarProceso(Proceso p) {
        if (!computadoras.isEmpty()) {
            if (computadoras.get(0).getMemory() >= p.getRequirMemory()) {
                computadoras.remove(0);
            }
        } 
        this.addProceso(p);
    }*/

    public void imprimirPCs() {
        for (int i = 0; i < computadoras.size(); i++) {
            System.out.println(computadoras.get(i));
        }
    }

    public void imprimirProcs() {
        for (int i = 0; i < procesos.size(); i++) {
            System.out.println(procesos.get(i));
        }
    }

    public static void main(String[] args) {
        CentroComputos cc = new CentroComputos();
        Computadora pc1 = new Computadora("pc2", 120, 500);
        Computadora pc11 = new Computadora("pc3", 120, 500);
        Computadora pc2 = new Computadora("pc1", 160, 256);
        Computadora pc3 = new Computadora("pc4", 100, 1000);

        cc.addComputadora(pc1);
        cc.addComputadora(pc11);
        cc.addComputadora(pc2);
        cc.addComputadora(pc3);
        

        Proceso p3 = new Proceso("p3", 200);
        Proceso p1 = new Proceso("p1", 250);
        //cc.ejecutarProceso(p3);
        cc.imprimirPCs();
    }
}
