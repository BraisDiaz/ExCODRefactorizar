
package refactorizarcod2;

/**
 *
 * @author Brais Núñez
 */
public class Factorial {
    int f, j=8;
   
    public void calcularFactorial(){
        
        if (j == 0)

            f = 1;

        else {

            f = 1;

        for (int i = j; i >= 1; i--) {
            f = f * i;
        }
        }    
        System.out.println(f); 
     }
}
