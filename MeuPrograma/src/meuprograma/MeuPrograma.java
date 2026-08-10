package meuprograma;

import java.util.Scanner;

public class MeuPrograma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        double x, maior = 0;

        for (i = 1; i <= 5; i++) {
            System.out.printf("Informe o %d valor.: ", i);
            x = sc.nextDouble();

            if (maior < x) {
                maior = x;
            }

        }
        
        System.out.println("O maior valor digitado foi: " + maior);

    }

}
