
package refactorizarcod1;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class RefactorizarCOD1 {

    public static void main(String[] args) {
        
String nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
 
int ano = Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad"));

int mes = (ano*12); int dia = (ano*365); int hora = (dia*24);

 JOptionPane.showMessageDialog(null,  "Meses: "  +mes,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE);

 JOptionPane.showMessageDialog(null, "Días: " +dia,"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);

 JOptionPane.showMessageDialog(null, "Horas: " +hora,"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);

     System.exit (0);
}
    }
    

