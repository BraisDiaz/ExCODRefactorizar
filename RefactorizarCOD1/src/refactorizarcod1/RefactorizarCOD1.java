
package refactorizarcod1;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class RefactorizarCOD1 {

    public static void main(String[] args) {
        String n;

int m;

int d;

int h;

int a;


n = JOptionPane.showInputDialog ("Escriba su nombre: ");
 
a = Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad"));

 
m = (a*12);

d = (a*365);

h = (d*24);

 
 JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +n,JOptionPane.INFORMATION_MESSAGE);

 JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+n,JOptionPane.INFORMATION_MESSAGE);

 JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+n,JOptionPane.INFORMATION_MESSAGE);

     System.exit (0);
}
    }
    

