package BOLETIN_6_4;

/**
 *
 * @author emendezduran
 */
public class Boletin_6_4 {
  
     public static void main(String[] args) {
         
         /*-Coñecidos o nome e o peso de dúas persoas,
         queremos escribir os datos da que pesa máis e, 
         a diferenza de peso entre elas .*/
         
        Persona per1 = new Persona("Juan", 80);
        Persona per2 = new Persona("Maria", 60);
         
        
        
        per1.visualizar();
         
        System.out.println("La diferencia de ");
        Persona.compararPeso(per1, per2);
                 
     }
}
