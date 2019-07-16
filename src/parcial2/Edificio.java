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
public class Edificio extends Inmueble{
    private ArrayList<Piso>pisos; 
    private ArrayList<Local>locales;
    private Persona propietario;
    public Edificio(ArrayList<Piso>pisos,ArrayList<Local>locales,Persona propietario,String nombre, String nameBarrio,int estrato, double arriendo, double areaCons){
        this.pisos=pisos;
        this.locales=locales;
        this.propietario=propietario;
        this.nombre=nombre;
        this.nameBarrio=nameBarrio;
        this.areaCons=areaCons;
        this.estrato=estrato;
        this.arriendo=arriendo;
        
    }
    public ArrayList<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(ArrayList<Piso> pisos) {
        this.pisos = pisos;
    }

    public ArrayList<Local> getLocales() {
        return locales;
    }

    public void setLocales(ArrayList<Local> locales) {
        this.locales = locales;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
    
    
    @Override
    public void darInformacion() {
        System.out.println("El edificio se encuentra en el barrio "+this.nameBarrio);
        System.out.println("El edifico tiene un area construida de "+this.areaCons+" m2");
        System.out.println("El estrato del edificio es "+this.estrato);
        System.out.println("El edificio tiene "+this.pisos.size()+" pisos");
        for(int i=0;i<this.pisos.size();i++){
            
            System.out.println("El piso #"+i+" posee "+this.pisos.get(i).getOficinas().size()+" oficinas");
        }
    }
    
}
