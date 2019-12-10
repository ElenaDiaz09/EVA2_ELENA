
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
        // TODO code application logic here
        Scanner sInput = new Scanner(System.in);
        System.out.println("INSERTA UN NUMERO:");
        int iVal = sInput.nextInt();
        calculaFactorial(iVal);
        System.out.println("FACTIRAL DE  " + iVal + "  ES IGUAL A: " + calculaFactorial(iVal));
    }
public static int calculaFactorial(int iVal){
    //SI iVal == 0 DEBEMOS DETENR LA RECURSIVIDAD.
    if(iVal==0){
        return 1;
    }else{
        return iVal * calculaFactorial(iVal - 1); 
    }
    }    
}
