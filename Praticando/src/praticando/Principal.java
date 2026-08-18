package praticando;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        
        char resp;
        do {
            System.out.println("Digite a temperatura em Celsius");
            double C = sc.nextDouble();
            double F = 9.0*C / 5 + 32.0;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.1f%n", F);
            System.out.println("Desejar continuar? (S/N)");
            resp = sc.next().charAt(0);
            
        } while (resp != 'N');
        
        
                
        sc.close();
    }
    
    
    
    }


