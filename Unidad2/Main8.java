
package pkg8exepcion;
 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       
        try {
            File file = new File("archivo.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: El archivo no existe o no se puede acceder.");
        }
    }
}

    
