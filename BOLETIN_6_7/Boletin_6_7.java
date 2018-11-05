package BOLETIN_6_7;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Boletin_6_7 {

    public static void main(String[] args) {

        System.out.println("****FIGURAS GEOMETRICAS****\n 1-> CUADRADO\n 2-> TRIANGULO\n 3-> CIRCULO\n 4->\n ELIGE UNA OPCION");

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("CUADRADO");
                break;
            case 2:
                System.out.println("TRIANGULO");
                break;
            case 3:
                System.out.println("CIRCULO");
                break;
        }
    }

}
