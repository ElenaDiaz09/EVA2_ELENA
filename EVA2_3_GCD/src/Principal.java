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
        System.out.println(mcd(48,11));
    }
    
    public static int mcd(int dividendo, int divisor){
        //CUANDO DETENEMOS LA RECURSION? CUADNO EL DIVISOR SEA == 0
        System.out.println(dividendo + "/" + divisor);
        if(divisor == 0){
            return dividendo;
        }else{
            int iResi = dividendo % divisor;
            return mcd(divisor, iResi);
        }
    }
}
