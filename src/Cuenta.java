import java.util.Scanner;


public class Cuenta {
    public String titular;
    public double cantidad;
    
 
    //METODO SETER
    public void setIngresar(double cantidad1){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad a la cuenta: ");
        cantidad1 = sc.nextInt();
        
        if(cantidad1 < 0){
            System.out.println("Nada para hacer.");
        }
        else{
            cantidad = cantidad1;
        }
        
    }
    //METODO GETER
    
    public double retirar(double cantidad2){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad a retirar de la cuenta: ");
        cantidad2 = sc.nextInt();
        
        if(cantidad2-cantidad < 0){
            cantidad = 0;
        }
        return cantidad;
    }
    
    //METODO TOSTRING
    public String toString(){
        
        return "Titular: " + this.titular + "Cantidad cuenta: " + this.cantidad;
    }
    
}
