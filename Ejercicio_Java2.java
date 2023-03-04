import java.util.Scanner;
public class Ejercicio_Java2 {
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner (System.in);
       
      double peso;

      System.out.println("Introduzca su peso :");

      peso = entrada.nextDouble();
      
        switch ((peso <= 45) ? 0 : (peso > 45 && peso <= 60) ? 1 : (peso > 60 && peso <= 75) ? 2 : (peso > 75) ? 3 : 3) {
           
            case (0):
            System.out.println("Usted es muy delgado");
                break;
        
            case (1):
            System.out.println("Usted es delgado");
                break;
            
            case (2):
            System.out.println("Su peso es normal");
                break;
                
            case (3):
            System.out.println("Usted es gordo");
                break;
        }
    }
}
