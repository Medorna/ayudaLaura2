import java.util.Random;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private static char sexo;
    
    public Persona(String nombre, int edad, int dni, char sexo){
        
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = 'h';
    }
    
    public boolean esMayorDeEdad(){
    
        if(edad <18){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void comprobarSexo(char sexo){
        if (sexo != 'h' || sexo != 'm'){
            sexo = 'h';
        }
    }
    
    public int generaDNI(){
        
        Random rnd = new Random();
        dni =  rnd.nextInt(100000000);
        
        return dni;
        
    }
    
    public String toString(){
        
        return "Nombre: " + this.nombre + " " + "Edad: " + this.edad + " " + "Sexo: " + this.sexo + " " + "DNI: " + this.dni;
    
    }
    
    //METODOS SET de cada parametro
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    
}
