/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *Elena Guadalupe Diaz Lopez #18550623
 */
public class Nodo {
     private int valor;
    private Nodo derecha;
    private Nodo izquierdo;

    //CONSTRUCTORES PARA ASIRGANR VALORES
    public Nodo() {
        this.derecha = null;
         this.izquierdo = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.derecha = null;
        this.izquierdo = null;
    }

    //METODOS GET Y SET

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }
    
    
}
