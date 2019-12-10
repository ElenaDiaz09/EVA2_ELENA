
import java.util.Scanner;

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
        //Pedir un numero 
        Scanner sInput = new Scanner(System.in);
      
        System.out.println("INTRODUCE UN NUMERO:  ");
        int iVal = sInput.nextInt();
          System.out.println("**********************************************");
        //Imprimir el numero de veces del numero solicitado
        for (int i = iVal; i >= 1 ; i--) {
            System.out.print(i + "--");
        }
        System.out.println("");
        System.out.println("RECURSIVIAD************************************");
        forFalso(iVal);
        System.out.println("");
        System.out.println("HASTA DONDE EL USUSARIO DESEE******************");
        forFalso(iVal);
        System.out.println("");
        
        forFalso2(inc);
    }
    //RECURSIVIDAD
    public static void forFalso(int iVal){
        System.out.print(iVal + "--");
        if (iVal > 1){ //DETUVIMOS LA RECURSIVIDAD
        forFalso(iVal - 1); //LLAMAMOS A LA FUNCION DENTRO DE LA FUNCION
        }
    }
    
   //IMPRIMIR NUMEROS HASTA QUE EL USUARIO DESEE
    public static void forFalso2(int iVal, int inc){
        System.out.print(inc + "--");
        if (inc == iVal)
            forFalso2(iVal, inc + 1);
    }
    
   
}
