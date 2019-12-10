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
        Nodo nObj1 = new Nodo();
        nObj1.valor = 100;
        nObj1.siguiente = new Nodo();
        nObj1.siguiente.valor = 200;
        nObj1.siguiente.siguiente = new Nodo();  //CREAMOS EL TERCER NODO
        nObj1.siguiente.siguiente.valor = 300;
        System.out.println("*******************NODO 1**********************************************");
        System.out.println(nObj1.valor);
        System.out.println("*******************NODO 2********************************************");
        System.out.println(nObj1.siguiente.valor);
        System.out.println("*******************NODO 3********************************************");
        System.out.println(nObj1.siguiente.siguiente.valor);
        System.out.println("**********************************************************************");
    }
    
}
//NODOS
// se compone del dato que almacena y la referencia para vincularse con otro nodo.
class Nodo{
    int valor; //DATO A ALMACENAR
    Nodo siguiente; //REFERENCIA PARA VINCULAR.
}
