/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pais;

import java.util.Objects;

/**
 *
 * @author familia ginart
 */
public class Pais implements Comparable<Pais> {
    private String paises;

    public Pais() {
    }

    public Pais(String paises) {
        this.paises = paises;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    @Override
    public int compareTo(Pais t) {
        return this.paises.compareToIgnoreCase(t.getPaises().toString());
        
    }

    @Override
    public String toString() {
        return  paises;
    }

    

   
    
}
