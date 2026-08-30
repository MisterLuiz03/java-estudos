package cadastro;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

   
     public static void main(String[] args) {

         Locale.setDefault(Locale.US);
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Insira a quantidade de pessoas a serem adicionadas: ");
         int vet = sc.nextInt();
         
         
         Pessoa listaPessoas[] = new Pessoa[vet];
         
         
         
         for (int i = 0; i < listaPessoas.length; i++) {
            sc.nextLine();
            System.out.printf("\nInsira os dados da %dª Pessoa \n", i + 1);
            listaPessoas[i] = new Pessoa();

            System.out.print("Informe o nome: ");
            listaPessoas[i].name = sc.nextLine();

            System.out.print("Informe o seu peso: ");
            listaPessoas[i].peso = sc.nextDouble();

            System.out.print("Informe a sua altura ");
            listaPessoas[i].altura = sc.nextDouble();
            
            System.out.printf("Seu IMC: %.2f ", listaPessoas[i].calculoIMC(listaPessoas[i].peso, listaPessoas[i].altura));

        }

        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.printf("\n\tDados da %dÂª Pessoa \n", i + 1);
            System.out.println("\t" + listaPessoas[i].name);
            System.out.println("\t" + listaPessoas[i].peso);
            System.out.println("\t" + listaPessoas[i].altura);
            System.out.printf("\t%.2f" , listaPessoas[i].calculoIMC(listaPessoas[i].peso, listaPessoas[i].altura));
            
        }
         
         
         sc.close();
         
    }
    
}
