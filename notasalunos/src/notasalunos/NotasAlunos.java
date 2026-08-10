package notasalunos;

import java.util.Scanner;

public class NotasAlunos {

    public static void main(String[] args) {

        Scanner lerDados = new Scanner(System.in);

        float notas[][] = new float[3][3];
        float medias[] = new float[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite as 3 notas do aluno " + (i + 1) + ":");
            float soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota " + (j + 1) + ": ");
                notas[i][j] = lerDados.nextFloat();
                soma += notas[i][j];

            }
            medias[i] = soma/3;
        }
        
        System.out.println("\nNotas e médias do aluno: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " - ");
            }
            System.out.printf(" | Média: %.2f\n", medias[i]);
            
        }
        System.out.println("\nNota do aluno 2 na segunda prova: " + notas[1][1]);
        
        lerDados.close();
    }

}
