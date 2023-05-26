
package pkg5.v4trifiv;

import FUNCIONES.funcionesMultiplo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class V4TRIFIV {

    
   public static void main(String[] args) throws IOException {
        
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero; 
        
        //CREO OBJETO
        
        funcionesMultiplo mult = new funcionesMultiplo();
        
        //ENTRADA DE DATOS
        
         System.out.println ("Dame el numero:");
         numero=Integer.parseInt(bufEntrada.readLine());
         
         //SALIDA DE DATOS
         
         System.out.println (mult.retornaMultiplo(numero));
    }
    
}
    

