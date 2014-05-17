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
        do{
                System.out.println("1 - Generate");
                System.out.println("2 - Exit??");
                System.out.print(">>");
                    option = in.nextInt();
                    switch(option){
                        case 1:
                            Runner.ccn();
                            Runner.cvv();
                            System.out.println("Done...");
                        break;
                        case 2:
                            System.exit(0);
                        break;
                        default:
                            System.out.println("Just accept numbers (1 and 2).");
                        break;
                    }
        }while(option!=2);
        }
}