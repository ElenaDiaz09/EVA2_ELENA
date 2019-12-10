/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo<String> nodo = new Nodo<String>();
        nodo.setValor("HOLA MUNDO CRUEL!!");
    }
    
}

class Nodo<T>{
    T valor;
    Nodo siguiente;
    Nodo previo;
    
    public Nodo(){
    this.siguiente = siguiente;
    this.previo = previo;
}

    public Nodo(Nodo previo) {
        this.previo = previo;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
        
}