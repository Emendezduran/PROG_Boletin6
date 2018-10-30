package BOLETIN_6_4;

/**
 *
 * @author emendezduran
 */
public class Persona {
    
    private String  nombre;
    private float peso;
    
    public Persona () {  
    }

    public Persona(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
     
    public void visualizar(){
        System.out.println("Nombre:" + nombre + "Peso:" + peso);
    }
    
    public static Persona compararPeso(Persona persona1, Persona persona2){
    if (persona1.peso > persona2.peso){
    return persona1;                
    } 
    else{
    return persona2;    
 
    }
        
    } 
    
    }
  
  
