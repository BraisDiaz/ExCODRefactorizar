
package refactorizarcod2;

/**
 *
 * @author Brais Núñez
 */
public class Factorial {
    int f, num=8;
   
    public void calcularFactorial(){
        
        if (num == 0)

            f = 1;

        else {

            f = 1;

        for (int i = num; i >= 1; i--) {
            f = f * i;
        }
        }    
        System.out.println(f); 
     }
}
