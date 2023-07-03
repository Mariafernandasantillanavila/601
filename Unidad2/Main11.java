
package pkg11exepcion;


public class Main {

    
    public static void main(String[] args) {
    
        try {
            int[] numbers = {1, 2, 3};
            int value = numbers[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: El índice está fuera de los límites del arreglo.");
        }
    }
}

