package calculadorimc;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas a serem insiridas: ");
        int vet = sc.nextInt();

        CalculaIMC lstpessoas[] = new CalculaIMC[vet];

        for (int i = 0; i < lstpessoas.length; i++) {
            sc.nextLine();
            System.out.printf("\nInsira os dados da %dª Pessoa \n", i + 1);
            lstpessoas[i] = new CalculaIMC();

            System.out.print("Informe o nome: ");
            lstpessoas[i].name = sc.nextLine();

            System.out.print("Informe o seu peso: ");
            lstpessoas[i].peso = sc.nextDouble();

            System.out.print("Informe a sua altura: ");
            lstpessoas[i].altura = sc.nextDouble();

        }

        for (int i = 0; i < lstpessoas.length; i++) {

            System.out.printf("\n\tDados da %dª Pessoa \n", i + 1);
            System.out.println("\tNome: " + lstpessoas[i].name);
            System.out.println("\tPeso: " + lstpessoas[i].peso);
            System.out.println("\tAltura: " + lstpessoas[i].altura);
            System.out.printf("\tIMC = %.2f\n", lstpessoas[i].calculoImc(lstpessoas[i].peso, lstpessoas[i].altura));

        }

        sc.close();

    }

}
