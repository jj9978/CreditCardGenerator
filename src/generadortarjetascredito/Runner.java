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
    public Scanner in = new Scanner(System.in);
    public int [] ccn = new int[10];
    public int [] cvvarray = new int[3];
    public int cont = 0;
    //Credit card verification.
    void verify(){
        
    }
    //CreditCardNumber(CCN) generator.
    void ccn()throws IOException, InputMismatchException{
        System.out.println("Writte ten random numbers from 0 to 9.");
        for(int f=0;f<ccn.length;f++){
            cont++;
            System.out.print("Number" + cont + ">>");
            ccn[f] =in.nextInt();
        }
        System.out.println("This is the number you entered: "+ Arrays.toString(ccn));
        for(int j=0;j<ccn.length;j++)
            ccn[j]+=j;
        System.out.println("This is the hash value: " );
        System.out.println("Transforming your number into a credit card number...");
    }
    //CVV generator.
    void cvv(){
        System.out.println("cvv");
        System.out.print(">>");
        Random randomcvv = new Random();
        for(int j=0;j<cvvarray.length;j++){
            int randomInt = randomcvv.nextInt(10);
            int a = cvvarray[j] = randomInt;
            System.out.print(a);
        }
        System.out.println("");
    }
}
