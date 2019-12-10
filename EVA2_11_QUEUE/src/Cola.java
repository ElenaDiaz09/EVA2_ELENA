
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Elena Guadalupe Diaz Lopez #18550623
 */
public class Cola {
    private Nodo inicio;
    private Nodo fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }
    //DEVUELVE TRUE SI LA LISTA ESTA VACIA
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else 
            return false;
    }
   //AGREGAMOS NODO AL FINAL DE LA LISTA
    public void add(Nodo nuevo){
        //VERIFICAMOS SI LA LISTA ESTA VACIA 
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
            /*Nodo temp = inicio;
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            //SI NO ESTA VACIA LLEVAMOS EL NUEVO NODO AL FINAL DE LA LISTA
            temp.setSiguiente(nuevo);*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    public void addBegin(Nodo nuevo){
        //VERIFICAMOS SI TENEMOS NOSO EN LA LISTA 
        if(isEmpty()){
            inicio = nuevo;
            fin = nuevo;
        }else{
             nuevo.setSiguiente(inicio);
             inicio = nuevo;
         }
    }
    public void insertarAt(int pos, Nodo nuevo) throws Exception{
        //MOVERNOS HASTA pos-1
        //reconectar los nodos----->PRIMERO EL NUEVO Y DESPUES EL PREVIO
      int iTama = size();
      if((pos < 0) || (pos >= iTama)){
          throw new Exception("LA POSICION ES INVALIDA");
      }else{
          if(pos == 0){
              addBegin(nuevo);
          }else{
              int iCont = 0;
              Nodo temp = inicio;
              while(iCont < (pos-1)){
                  temp = temp.getSiguiente();
                  iCont++;
              }
              nuevo.setSiguiente(temp.getSiguiente());
              temp.setSiguiente(nuevo);
          }
      }
    }
    
    //IMPRIMIR LISTA
    public void print(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print(temp.getValor() + "-");
            temp = temp.getSiguiente();
        }
        System.out.println();
    }
   //CANTIDAD EN LA LISTA
    public int size(){
        int iCont =0;
        Nodo temp = inicio;
        while(temp != null){
           iCont++;
           temp = temp.getSiguiente();
        }
        return iCont;
    }
    //VACIAL LA LISTA
    public void clear(){
        inicio = null;
        fin = null;
    }
    //BORRAR UN NODO----SE BORRA SOLO DESCONECTANDO EL NODO ANTERIOR A EL QUE DESEAS BORRAR Y SALTEARTE EL BORRADO Y RECONECTARLO
    //CON EL SIG.
    public void deleteAt(int pos) throws Exception{
       //LISTA VACIA
       if(isEmpty())
               throw new Exception("LA LISTA ESTA VACIA");
              
      int iTama = size();
      if((pos < 0) || (pos >= iTama))
          throw new Exception("LA POSICION ES INVALIDA");
      
      if(iTama ==1){//SOLO HAY UN NODO
          clear();
      }else{//VARIOS NODOS
          
      if(pos == 0){//BORRAR EL PRIMER NODO
          inicio = inicio.getSiguiente();
          }else{
                  int iCont = 0;
                  Nodo temp = inicio;
                  while(iCont < (pos-1)){
                  temp = temp.getSiguiente();
                  iCont++;
              }
                  temp.setSiguiente(temp.getSiguiente().getSiguiente());
                  if(pos == (iTama - 1))
                      fin = temp;

                  }
      
      }
    }
    public int getAt(int pos){
        //VERIFICAR
                  int iCont = 0;
                  Nodo temp = inicio;
                  while(iCont < pos){
                  temp = temp.getSiguiente();
                  iCont++;
    }
    return temp.getValor();
    }
    //AGREGAR----Final
    
    //QUITAR-----Inicio
    //LEER-------Inicio
}
  