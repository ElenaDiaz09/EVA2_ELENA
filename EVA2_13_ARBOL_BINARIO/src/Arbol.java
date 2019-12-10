/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Elena Guadalupe Diaz Lopez #18550623
 */
public class Arbol {
    private Nodo root;
    
public Arbol(){
    root = null;
}
 public void agregarNodo (Nodo nuevo){
     agregarNodoRec(root, nuevo);
 }
 
 private void agregarNodoRec(Nodo actual, Nodo nuevo){
     if(root == null){//ARBOL VACIO
         root = nuevo;
     }else{
         if(nuevo.getValor() > actual.getValor()){//MAYOR----DERECHA
             if(actual.getDerecha()== null){//VACIO, HAY UN ESPACIO
                 actual.setDerecha(nuevo);
             }else{//YA HAY UN NODO
                 agregarNodoRec(actual.getDerecha(), nuevo);
             }
         }else if(nuevo.getValor() < actual.getValor()){//MENOR-----IZQUIERDA
              if(actual.getIzquierdo()== null){//VACIO, HAY UN ESPACIO
                 actual.setIzquierdo(nuevo);
             }else{//YA HAY UN NODO
                 agregarNodoRec(actual.getIzquierdo(), nuevo);
             }
         }else{//EL VALOR YA EXISTE
             System.out.println("UPS! YA EXISTE ESTE VALOR");
     }
 }
}
     public void imprimePostOrder(){
          postOrder(root);

}
      private void postOrder(Nodo actual){
          if(actual != null){
         //LEER IZQ
          postOrder(actual.getIzquierdo());
         //LEER DERECHA
          postOrder(actual.getDerecha());
         //IMRPIMIR
          System.out.print(actual.getValor() + " - ");
          }
}
      public void imprimeInOrder(){
          InOrder(root);
          System.out.println("IN  ORDER");
}
      private void InOrder(Nodo actual){
          if(actual != null){
         //LEER IZQ
          postOrder(actual.getIzquierdo());
          //IMRPIMIR
          System.out.print(actual.getValor() + " - ");
         //LEER DERECHA
          postOrder(actual.getDerecha());
         
          }
}
}
