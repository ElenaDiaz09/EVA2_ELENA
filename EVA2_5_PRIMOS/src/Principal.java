
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
        Scanner input= new Scanner (System.in);
        System.out.println("INSERTA UN NUMERO:");
        int iVal = input.nextInt();
        System.out.println("*****************************************************************************");
        if(esPrimoIneficiente(iVal))
             System.out.println("ES PRIMO");
        else
             System.out.println("NO ES PRIMO");
        System.out.println("*****************************************************************************");
    }
    
    public static boolean esPrimoIneficiente(int valor){
        boolean bResu = true;
        for (int i = 2; i < valor; i++) {
            if((valor %i) == 0){
                bResu = false;
                break;
            }
        }
        return bResu;
    }
    
}
