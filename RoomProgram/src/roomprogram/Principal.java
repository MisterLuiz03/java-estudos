package roomprogram;

import entities.Rent;
import java.util.Locale;
import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {

        
       Locale.setDefault(Locale.US);
       
       Scanner sc = new Scanner(System.in);
       
       Rent[] vect = new Rent[10];
       
        System.out.println("Quantos quartos vao ser reservados?: ");
       int n = sc.nextInt();
       
        for (int i = 0; i <= n; i++) {
            System.out.println("Reserva #"+  i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            int roomNumber = sc.nextInt();
            
            vect[roomNumber] = new Rent(nome, email);
            
        }
        
        System.out.println();
        System.out.println("Quartos reservados: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
       
       
       sc.close();

    }
    
}
