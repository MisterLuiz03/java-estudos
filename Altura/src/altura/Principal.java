package altura;

import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas pessoa vão ser adicionadas: ");
        int n = sc.nextInt();

        Pessoa[] lstp = new Pessoa[n];

        for (int i = 0; i < lstp.length; i++) {

            sc.nextLine();
            System.out.printf("Dados da %dª pessoas: %n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            lstp[i] = new Pessoa(nome, idade, altura);
        }

        double sum = 0.0;

        for (int i = 0; i < lstp.length; i++) {
            sum += lstp[i].getAltura();
        }
        
        double media = sum / n;
        
        
        int cont = 0;
        
        for (int i = 0; i < lstp.length; i++) {
            if (lstp[i].getIdade() < 16) {
                cont++;
                System.out.println(lstp[i].getNome());
            }
        }
        
        double porcentagem = (double) cont / n * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
        System.out.printf("ALTURA MÉDIA %.2f%n", media);
        

        sc.close();

    }

}
