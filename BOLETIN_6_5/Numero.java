package BOLETIN_6_5;

/**
 *
 * @author emendezduran
 */
public class Numero {

    private double num;

    public Numero() {
    }

    public Numero(double num) {
        this.num = num;
    }

    public static Numero compararMayor(Numero nu1, Numero nu2, Numero nu3) {

        if (nu1.num >= nu2.num && nu1.num >= nu3.num) {
            return nu1;

        } else if (nu1.num <= nu2.num && nu2.num >= nu3.num) {
            return nu2;

        } else if (nu1.num <= nu3.num && nu2.num <= nu3.num) {
            return nu3;
        } 
        
        else {
            return nu1;
        }

    }

    public void visualizar() {
        System.out.println("El numero mayor es: " + num);
    }

}
