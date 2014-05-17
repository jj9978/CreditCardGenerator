package generadortarjetascredito;

import java.io.IOException;
import java.util.Arrays;
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
        System.out.println("Escribe 10 números entre 0 y 9.");
        for(int f=0;f<ccn.length;f++){
            System.out.print(">>");
            ccn[f] =in.nextInt();
        }
        for(int i=0;i<n.length;i++)
            if(i%2!=0)
               n[i]+=n[i] = i*2;
            else{
               n[i] = i;
            System.out.println(n[i]);
            }
        System.out.println("Este es el "+ Arrays.toString(n));
}
    //Generamos el valor del CVV.
    static void cvv(){
        System.out.println("cvv");
        System.out.print(">>");
        int [] cvvarray = new int[3];
        Random randomcvv = new Random();
        for(int j=0;j<cvvarray.length;j++){
            int randomInt = randomcvv.nextInt(10);
            int a = cvvarray[j] = randomInt;
            System.out.print(a);
        }
        System.out.println("");
    }
}
