/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Pais.Pais;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author familia ginart
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pais Ingresarpaises() {
        Pais p1 = new Pais();

        System.out.println("Ingrese un pais a la Lista");
        p1.setPaises(leer.next());
        return p1;
    }

    public void mostrarlista(TreeSet<Pais> listadepaises) {
        for (Pais aux : listadepaises) {
            System.out.println(aux);
        }
    }

    public void eliminarpais(TreeSet<Pais> listadepaises) {

        Iterator<Pais> it = listadepaises.iterator();
        System.out.println("Ingrese el pais que desea eliminar : ");
        String eliminar = leer.next();
        int bandera = 0;
        while (it.hasNext()) {

           if(it.next().getPaises().equalsIgnoreCase(eliminar)){
           it.remove();
           bandera = 1;
           }}
            if (bandera == 0) {
                System.out.println("El pais no se encuentra");
            }

           
        }
      
        }
    

