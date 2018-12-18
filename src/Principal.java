public class Principal {
    
        public static void main(String[] args){
            
            Persona persona1 = new Persona("Pedro", 40, 0 ,'h');
            
            System.out.println("ToString: " + persona1.toString());
            
            System.out.println("DNI generado aleatorio: "+ persona1.generaDNI());
        }

}
