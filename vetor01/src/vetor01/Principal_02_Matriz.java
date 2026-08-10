package vetor01;

import java.util.Scanner;

public class Principal_02_Matriz {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i, j, mat[][] = new int[2][4];
        
        for (i = 0; i < mat.length; i++) {
            System.out.printf("Informe os elementos da %d° linha\n", (i + 1));
                for (j = 0;  j< mat[i].length; j++) {
                    System.out.printf("m[%d][%d]", i, j);
                    
                   mat[i][j] = sc.nextInt();
            }
                System.out.println("");
        }
        
        for (i = 0; i < mat.length; i++) {
            System.out.printf("%d° linha: ", (i+1));
            for (j = 0;  j< mat[i].length; j++) {
                System.out.printf("%d", mat[i][j]);
            }
            System.out.println("");
        }
        
        
    }
    
}
