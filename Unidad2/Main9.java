
package pkg9exepcion;

public class Main {

    
    public static void main(String[] args) {
        
        try {
            // Intentar cargar una clase que no existe en el classpath
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: La clase no ha sido encontrada.");
        }
    }
}
