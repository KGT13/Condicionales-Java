import java.util.Scanner;
public class Ejercicio_Java1 {
    public static void main(String[] args) throws Exception {
        
      Scanner entrada = new Scanner (System.in);
     
      double peso;
      
      System.out.println("Introduzca su peso :");
      peso = entrada.nextDouble();
      
      if (peso <= 50) {
        System.out.println("Usted es muy delgado");
      } 
      else if (peso > 50 && peso <= 60) {
        System.out.println("Usted es delgado");
      }
      else if (peso > 60 && peso <= 75){
        System.out.println("Su peso es normal");
      }
      else{
        System.out.println("Usted es gordo");
      }

    }
}
    

