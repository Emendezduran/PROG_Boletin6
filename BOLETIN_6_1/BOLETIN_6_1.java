package BOLETIN_6_1;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class BOLETIN_6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        System.out.println("Teclea un numero para comprobar si es positivo");
        Scanner numeros = new Scanner(System.in);
        double num1 = numeros.nextInt();
        while (num1 < 0) {
            System.out.println("Error el numero es negativo");
            num1 = numeros.nextInt();
        }

        System.out.println("Es Positivo");
                 
    }
    
}
