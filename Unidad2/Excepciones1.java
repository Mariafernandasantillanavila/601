
package excepciones1;

import javax.swing.JOptionPane;


public class Excepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x,y;
       
        try{
              x= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero 1","Solicito datos",3));
        }
             catch(NumberFormatException n){
                 System.out.println(n.getMessage() +"No es numero entero");
                 
        }
    }
    
    
    
    
}
