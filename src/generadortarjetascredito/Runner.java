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
    public int [] ccn = new int[15];
    public int [] cvvarray = new int[3];
    public int [] ccnarray = new int[16];
    public int cont = 0;
    //Variables de primer control.
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    //Variables de segundo control.
    public int a2;
    public int b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    //Hash value.
    public int val;
    //Module value.
    public int module;
    
    //Credit card opetarion.
    
    //Credit card generation.
    void ccn(){
        System.out.println("ccn");
        System.out.println("Generating...");
        Random randomccn = new Random();
        for(int j=0;j<ccnarray.length;j++){
            cont++;
            int randomInt = randomccn.nextInt(10);
            int a = ccnarray[j] = randomInt;
            System.out.println("Iteration: "+cont);
            System.out.println(">>"+Arrays.toString(ccnarray));
        }
        System.out.println("Preparing verification...");
        for(int j=0;j<ccnarray.length;j++){
            a = ccnarray[j=1];
            b = ccnarray[j=3];
            c = ccnarray[j=5];
            d = ccnarray[j=7];
            e = ccnarray[j=9];
            f = ccnarray[j=11];
            g = ccnarray[j=13];
            h = ccnarray[j=15];
            a2 = a * 2;
            if (a2>10){
               a2=ccnarray[1];
            }
            b2 = b * 2;
            if (b2>10){
               b2=ccnarray[3];
            }
            c2 = c * 2;
            if (c2>10){
               c2=ccnarray[5];
            } 
            d2 = d * 2;
            if (d2>10){
               d2=ccnarray[7];
            } 
            e2 = e * 2;
            if (e2>10){
               e2=ccnarray[9];
            } 
            f2 = f * 2;
            if (f2>10){
               f2=ccnarray[11];
            } 
            g2 = g * 2;
            if (g2>10){
               g2=ccnarray[13];
            } 
            h2 = h * 2;
            if (h2>10){
               h2=ccnarray[15];
            } 
        for(int k = 0;k<ccnarray.length;k++){
            val+=ccnarray[k];
            module = val%10;
        }
        if(module==0){
            System.out.println("This is your credit card number: "+ Arrays.toString(ccnarray));
        }
        else{
            System.out.println("Input another number, cause it is not a valid one.");
        }
    }
    }
    //CreditCardNumber(CCN) generator.
    void verify()throws IOException, InputMismatchException{
        System.out.println("Write sixteen random numbers from 0 to 9.");
        for(int f=0;f<ccn.length;f++){
            cont++;
            System.out.print("Number" + cont + ">>");
            ccn[f] =in.nextInt();
        }
        System.out.println("Credit card to iterate: "+ Arrays.toString(ccn));
        for(int j=0;j<ccn.length;j++){
            a = ccn[j] = 1;
            b = ccn[j] = 3;
            c = ccn[j] = 5;
            d = ccn[j] = 7;
            e = ccn[j] = 9;
            f = ccn[j] = 11;
            g = ccn[j] = 13;
            h = ccn[j] = 15;
            a2 = a * 2;
            if (a2>10){
               a2=ccn[j]=1;
            }
            b2 = b * 2;
            if (b2>10){
               b2=ccn[j]=3;
            }
            c2 = c * 2;
            if (c2>10){
               c2=ccn[j]=5;
            } 
            d2 = d * 2;
            if (d2>10){
               d2=ccn[j]=7;
            } 
            e2 = e * 2;
            if (e2>10){
               e2=ccn[j]=9;
            } 
            f2 = f * 2;
            if (f2>10){
               f2=ccn[j]=11;
            } 
            g2 = g * 2;
            if (g2>10){
               g2=ccn[j]=13;
            } 
            h2 = h * 2;
            if (h2>10){
               h2=ccn[j]=15;
            } 
        }
        System.out.println("Last iteration: "+ Arrays.toString(ccnarray));
        for(int k = 0;k<ccn.length;k++)
            System.out.println("This is the hash value: " + (val+=ccn[k]));
        module = val%10;
        if(module==0){
            System.out.println("This is your credit card number: "+ Arrays.toString(ccn));
            Runner United = new Runner();
            United.cvv();
            System.out.println("Done...");
        }
        else
            System.out.println("Input another number, cause it is not a valid one.");
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
