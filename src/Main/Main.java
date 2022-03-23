
package Main;


import Pais.Pais;
import Servicio.Servicio;

import java.util.Scanner;
import java.util.TreeSet;


public class Main {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         TreeSet<Pais> listadepaises = new TreeSet();
         
         Servicio S1 = new Servicio();
         String res = "";
         do {            
            listadepaises.add(S1.Ingresarpaises());
             System.out.println("Desea agragar otro pais");
             res = leer.next();
        } while (res.equalsIgnoreCase("si"));
             System.out.println("====================");
             System.out.println("La lista de paises es :");
    S1.mostrarlista(listadepaises);
        System.out.println("====================");
    S1.eliminarpais(listadepaises);
        System.out.println("====================");
    S1.mostrarlista(listadepaises);
    }
    
    
}
