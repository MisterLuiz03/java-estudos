package arraytipado2;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        /*
            LUIZ HENRIQUE LEMOS OLIVEIRA
            THIAGO ALMEIDA SOUZA
        */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int vet = 5;

        Pessoa lstpessoas[] = new Pessoa[vet];

        for (int i = 0; i < lstpessoas.length; i++) {
            
            
            System.out.printf("Insira os dados da %dª pessoa:\n", i + 1);
            
            lstpessoas[i] = new Pessoa();

            System.out.print("Nome: ");
            lstpessoas[i].nome = sc.nextLine();

            System.out.print("Endereço: ");
            lstpessoas[i].endereço = sc.nextLine();

            System.out.print("Telefone: ");
            lstpessoas[i].telefone = sc.nextLine();

            System.out.print("Cidade: ");
            lstpessoas[i].cidade = sc.nextLine();

            System.out.print("Estado: ");
            lstpessoas[i].estado = sc.nextLine();

            System.out.print("CPF: ");
            lstpessoas[i].cpf = sc.nextLine();

            System.out.print("RG: ");
            lstpessoas[i].RG = sc.nextLine();

            System.out.print("Idade: ");
            lstpessoas[i].idade = sc.nextInt();
            
            sc.nextLine();

            System.out.print("CEP: ");
            lstpessoas[i].cep = sc.nextLine();

        }

        for (int i = 0; i < lstpessoas.length; i++) {
            
            System.out.println();
            System.out.printf("\t\nDados da %dª pessoa:\n", i + 1);

            System.out.println("\tNome: " + lstpessoas[i].nome);
            System.out.println("\tEndereço: " + lstpessoas[i].endereço);
            System.out.println("\tTelefone: " + lstpessoas[i].telefone);
            System.out.println("\tCidade: " + lstpessoas[i].cidade);
            System.out.println("\tEstado: " + lstpessoas[i].estado);
            System.out.println("\tCPF: " + lstpessoas[i].cpf);
            System.out.println("\tRG: " + lstpessoas[i].RG);
            System.out.println("\tIdade: " + lstpessoas[i].idade);
            System.out.println("\tCEP: " + lstpessoas[i].cep);

        }

        sc.close();

    }

}
