/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Elena Guadalupe Diaz Lopez #18550623
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista miLista = new Lista();
        miLista.add(new Nodo(4));//POSICION ---->1
        miLista.add(new Nodo(23));//POSICION ---->2
        miLista.add(new Nodo(2));//POSICION ---->3
        miLista.add(new Nodo(56));//POSICION ---->4
        miLista.add(new Nodo(465));//POSICION ---->5
        miLista.addBegin(new Nodo(999999)); //POSICION ---->0
        boolean vacia = miLista.isEmpty();
        if (vacia)
            System.out.println("**LISTA VACIA**");
        else 
            System.out.println("**LISTA CON NODOS**");
        miLista.print();
       //inserAt
       //deleteAt
       //get at
        System.out.println("El valos #3 es----> " + miLista.getAt(3));
       
        }
        
    }
    

