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
        Persona per2 = new Persona("Maria", 90);
                 
        Persona.compararPesoMayor(per1, per2).visualizar();
                
        float diferencia = ((Persona.compararPesoMayor(per1, per2).getPeso())-(Persona.compararPesoMenor(per1, per2).getPeso()));
         System.out.println(" La diferencia de peso entre " + per1.getNombre() + " y " + per2.getNombre() + " es de: " + diferencia + " Kg. ");
        
        
        
        
        
       
        
        
       
     }
}
