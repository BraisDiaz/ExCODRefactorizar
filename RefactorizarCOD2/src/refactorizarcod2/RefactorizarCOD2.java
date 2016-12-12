
package refactorizarcod2;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class RefactorizarCOD2 {

     public static void main(String[] args) {
       int f, i;

       int j = Integer.parseInt(JOptionPane.showInputDialog("Introducir valor de j"));
       
        if (j == 0)

            f = 1;

        else {

            f = 1;

        for (i = j; i >= 1; i--) {
            f = f * i;
        }
        }    
        System.out.println(f); 
}
}
    
    

