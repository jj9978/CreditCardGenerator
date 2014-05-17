package generadortarjetascredito;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
/**
 * @author 7h3n3w3r4cr4ck3r
 * @throws java.io.IOException
 * @throws java.util.InputMismatchException
 */
public class Runner {
    //CreditCardNumber(CCN)
    static void ccn()throws IOException, InputMismatchException{
        Scanner in = new Scanner(System.in);
        int [] ccn = new int[10];
        int [] n = new int[10];
        for(int f=0;f<ccn.length;f++){
            System.out.println("Escribe 10 números entre 0 y 9.");
            ccn[f] =in.nextInt(); 
        }
        for(int i=0;i<n.length;i++){
        System.out.println("Este es el número ingresado"+i);
            if(i%2!=0)
               n[i]+=n[i] = i*2;
            System.out.println(n[i]);
        }
}
    //Generamos el valor del CVV.
    static void cvv(){
        System.out.println("cvv");
        int [] cvvarray = new int[3];
        Random randomcvv = new Random();
        for (int cvv = 0; cvv <3; cvv++){
            int randomInt = randomcvv.nextInt(10);
            for(int j=0;j<cvvarray.length;j++){
                cvvarray[j] = randomInt;
                System.out.println(">> " + cvvarray[j]);
            }
        }
    }
}