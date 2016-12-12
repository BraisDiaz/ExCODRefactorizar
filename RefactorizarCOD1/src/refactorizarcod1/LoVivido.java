
package refactorizarcod1;

import javax.swing.JOptionPane;
/**
 *
 * @author Brais Núñez
 */
public class LoVivido {

    int edad; String nombre;
    
    public void registrarPersona (){
        
        nombre = JOptionPane.showInputDialog ("Escriba su nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad"));
    }
    public void visualizarLoVivido (){
        
    JOptionPane.showMessageDialog(null,  "Meses: "  + (edad*12),"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE);

    JOptionPane.showMessageDialog(null, "Días: " + (edad*365),"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);

    JOptionPane.showMessageDialog(null, "Horas: " + (edad*24*365),"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
 
    System.exit (0);
}
}


