/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;
import java.util.*;
/**
 *
 * @author Daniel
 */
public abstract class Inmueble {
    protected String nombre;

    
    protected String nameBarrio;
    protected int estrato;
    protected double arriendo;
    protected double areaCons;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNameBarrio() {
        return nameBarrio;
    }

    public void setNameBarrio(String nameBarrio) {
        this.nameBarrio = nameBarrio;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public double getArriendo() {
        return arriendo;
    }

    public void setArriendo(double arriendo) {
        this.arriendo = arriendo;
    }

    public double getAreaCons() {
        return areaCons;
    }

    public void setAreaCons(double areaCons) {
        this.areaCons = areaCons;
    }
    
    public abstract void darInformacion();
}
