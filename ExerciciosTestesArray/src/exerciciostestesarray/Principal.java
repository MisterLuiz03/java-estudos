
package exerciciostestesarray;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new  Scanner(System.in);
        
       
        
        System.out.println("Quantos numeros voce vai digitar?");
        int vet = sc.nextInt();
        
        double[] vect = new double[vet];
        
               
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Digite o %d° numero: " , i +1);
            vect[i] = sc.nextDouble();
        }
        
        System.out.print("VALORES = ");
        
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }
        
        double sum = 0.0;
        
        for (int i = 0; i < vect.length; i++) {
            sum+= vect[i];
        }
        
        double media;
        media = sum / vet;
        
        System.out.printf("%nSOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n" , media);
        
        
        
        
        
        sc.close();
        
    }
    
}
