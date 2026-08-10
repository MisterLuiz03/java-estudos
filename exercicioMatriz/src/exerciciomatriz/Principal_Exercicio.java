package exerciciomatriz;

import java.util.Scanner;

public class Principal_Exercicio {

    
    public static void main(String[] args) {
        
        Scanner lerDados = new Scanner(System.in);
        int mtz[][] = {{25,67},{20,50,43,56,11},{15,27,4}};
        
        for (int i = 0; i < mtz.length; i++) {
            System.out.println("O valor da linha " + (i+1)+  ":");
            for (int j = 0; j < mtz[i].length; j++) {
                System.out.println(mtz[i][j]);
            }
            System.out.println("\n");
        }
        
    }
    
}
