package generadortarjetascredito;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 7h3n3w3r4cr4ck3r
 */
public class GeneradorTarjetasCredito {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.util.InputMismatchException
     */
    public static void main(String[] args)throws IOException, InputMismatchException{
        Scanner in = new Scanner(System.in);
        int option;
        Runner Road = new Runner();
        do{
                System.out.println("1 - Generate");
                System.out.println("2.- Verify your credit card number.");
                System.out.println("3 - Exit??");
                System.out.print(">>");
                    option = in.nextInt();
                    switch(option){
                        case 1:
                            Road.ccn();
                            Road.cvv();
                            System.out.println("Done...");
                        break;
                        case 2:
                            System.out.println("Welcome, in this section you can verify a creditcard number.");
                            Road.verify();
                        break;
                        case 3:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Just accept numbers from one to three.");
                        break;
                    }
        }while(option!=2);
        }
}
