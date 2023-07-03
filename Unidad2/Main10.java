
package pkg10exepcion;


public class Main {

    
    public static void main(String[] args) {
      
        try {
            Object obj = "Hola";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: No se puede convertir el objeto a Integer.");
        }
    }
}

   