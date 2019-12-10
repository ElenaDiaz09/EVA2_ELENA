/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_stack;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;

/**
 *
 * Elena Guadalupe Diaz Lopez #18550623
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El ultio en llegar es el priemro en salir
        Pila miPila = new Pila();
        miPila.push(new Nodo(100));
        miPila.push(new Nodo(200));
        miPila.push(new Nodo(300));
        miPila.push(new Nodo(400));
        miPila.print();
        System.out.println("CIMA DE LA PILA  = " + miPila.peek());
       //Lanzamos y cachamos la excpsion del POP
           try {
               System.out.println("CIMA DE LA PILA  = " + miPila.pop());
           } catch (Exception ex) {
                java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        

        miPila.print();
}
}