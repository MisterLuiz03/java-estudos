
package teste_continue;

import java.util.Scanner;


public class Teste_continue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char awnser;
        int num1, num2 = 100;
        
        do {
            
            System.out.print("Enter a value: ");
            num1 = sc.nextInt();
            
            System.out.printf(" %d + %d = %d%n", num1, num2, num1 + num2);
            
            System.out.print("Do you want to continue? Yes or No (Y/N)");
            awnser = sc.next().charAt(0);
            
            if ((awnser == 'n') || (awnser == 'N')) {
                break;
            }
            
        } while (awnser != 'n' || awnser != 'N');
       
        System.out.println("End of the program");
        
    }
    
}
