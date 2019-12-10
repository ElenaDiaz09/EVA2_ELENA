
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
        //FIBONACCI----> LA SUMA DE LAS POSICINES ANTERIORES
        //EJ.  0-1-1-2-3-5-8-13-21-34
        Scanner sCan = new Scanner(System.in);
        System.out.println(fibonacci(45));
    }
    public static int fibonacci(int iPos){
        if(iPos == 0){
            return 0;
        }else if(iPos == 1){
            return 1;
        }else{
            return fibonacci(iPos - 1) + fibonacci(iPos - 2);
        }
    }
}
