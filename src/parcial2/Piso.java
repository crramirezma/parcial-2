/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Piso extends Inmueble {
    private int numOficinas;
    private ArrayList<Oficina>oficinas;

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
    }
    
    
    @Override
    public void darInformacion() {
        System.out.println("El estrato de las oficinas en el piso es "+this.estrato);
        System.out.println("El area total del piso es de "+this.areaCons);
        System.out.println("El piso posee un total de "+this.oficinas.size()+" oficinas");
    }
    
}
