
package continuethefato;

public class ContinueTheFato {

    public static void main(String[] args) {

        System.out.println("Prints even values from 0 to 100");
        for (int i = 0; i < 20; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            } else 
                continue;
            {
            }
            
            int a = 0, soma = 0;
            
            while(a < i){
                a++;
                soma += a;
            
            }
            System.out.println("The sum of all values is: " + soma);
        }
    }
    
    
}
