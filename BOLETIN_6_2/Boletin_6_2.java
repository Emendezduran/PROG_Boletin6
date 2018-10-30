package BOLETIN_6_2;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Boletin_6_2 {
    
    public static void main(String[] args) {
        
      
        System.out.println("teclea 2 numeros");
        Scanner numeros = new Scanner(System.in);
        
        short num1 = numeros.nextShort();
        short num2 = numeros.nextShort();
        
        short suma = (short) (num1 + num2);
        System.out.println(num1 + "+" + num2 + "=" + suma);      
        
        if (num1 >= num2) {
            short resta = (short) (num1 - num2);
            System.out.println(num1 + "-" + num2 + "=" + resta); 
        }     
    }
}
