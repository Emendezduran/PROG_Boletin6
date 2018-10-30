package BOLETIN_6_3;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Boletin_6_3 {

    public static void main(String[] args) {

        System.out.println("teclea un numero");
        Scanner numeros = new Scanner(System.in);
        int num1 = numeros.nextInt();

        if (num1 == 0) {
            System.out.println("0");
        } else if (num1 < 0) {
            System.out.println("-");
        } else {
            System.out.println("+");
        }

    }
}

