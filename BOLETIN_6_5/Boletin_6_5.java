
package BOLETIN_6_5;

/**
 *
 * @author emendezduran
 */
public class Boletin_6_5 {
    
    public static void main(String[] args) {

        System.out.println("Comparando 10 , 5 , 32");

        Numero n1 = new Numero(10);
        Numero n2 = new Numero(5);
        Numero n3 = new Numero(31);

        Numero.compararMayor(n1, n2, n3).visualizar();

    }
}
