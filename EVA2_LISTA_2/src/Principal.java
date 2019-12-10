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
        // CREAR TRES NODOS Y LLENARLOS CON UN VALOR
        Nodo nodo1, nodo2, nodo3;
        nodo1 = new Nodo(32);
        nodo2 = new Nodo(17);
        nodo3 = new Nodo(5);
        //CONECTAR LOS NODOS CON EL METODO SET
        nodo1.setSiguiente(nodo2);
        nodo2.setSiguiente(nodo3);
        //IMPRIMIR LOS VALORES DE LOS NODOS, supiniendo que no saemos cuantos nodos tenemos, USAMOS UN CICLO
        Nodo temp = nodo1; //CREAMOS ESTE NODO PARA QUE SEA EL QUE AVANCE CON EL CICLO.
        while(temp != null){
            System.out.print(temp.getValor() + "-");
            temp = temp.getSiguiente();
        }
        
    }
    
}
class Nodo{
    private int valor;
    private Nodo siguiente;

    //CONSTRUCTORES PARA ASIRGANR VALORES
    public Nodo() {
        this.siguiente = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    //METODOS GET Y SET
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}