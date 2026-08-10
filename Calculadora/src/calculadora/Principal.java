package calculadora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        //NOME DO INTEGRANTES
        //Luiz Henrique Lemos Oliveira
        //Thiago Almeida Souza
        

        //double para realizacao das operacoes
        double num1, num2;

        //double para receber o metodo das operacoes
        double resultado;

        //scanner utilizado para escolha das operacoes
        Scanner ler = new Scanner(System.in);

        //chamando a classe calculo e seus metodos
        Calculo calc = new Calculo();
        
        //int para escolha no case
        int opcao;

        
        //do para estrutura de repeticao da calculadora
        do {
            //interface para o usuario escolher a operacao que deseja
            System.out.println("== CALCULADORA ==");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Dobrar");
            System.out.println("6 - Exponenciar");
            System.out.println("7 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = ler.nextInt();

            
            
            //switch case para a escolha da operacao
            switch (opcao) {

                
                //case 1 solicitando o primeiro e segundo valor para soma
                //variavel resultado recebendo o metodo
                case 1:
                    System.out.println("Digite o primeiro número: ");
                    num1 = ler.nextDouble();

                    System.out.println("Digite o segundo número: ");
                    num2 = ler.nextDouble();

                    resultado = calc.somarNumeros(num1, num2);

                    System.out.printf("A soma de %.2f e %.2f deu: %.2f%n", num1, num2, resultado);
                    break;
                    
                    
                //case 2 solicitando o primeiro e segundo valor para subtracao
                //variavel resultado recebendo o metodo
                case 2:
                    System.out.println("Digite o primeiro número: ");
                    num1 = ler.nextDouble();

                    System.out.println("Digite o segundo número: ");
                    num2 = ler.nextDouble();

                    resultado = calc.subtrairNumeros(num1, num2);

                    System.out.printf("A subtração de %.2f e %.2f deu: %.2f%n", num1, num2, resultado);
                    break;

                    
                //case 3 solicitando o primeiro e segundo valor para multiplicacao
                //variavel resultado recebendo o metodo    
                case 3:
                    System.out.println("Digite o primeiro número: ");
                    num1 = ler.nextDouble();

                    System.out.println("Digite o segundo número: ");
                    num2 = ler.nextDouble();

                    resultado = calc.multiplicarNumeros(num1, num2);

                    System.out.printf("A multiplicação de %.2f e %.2f deu: %.2f%n", num1, num2, resultado);
                    break;
                    
                    
                //case 4 solicitando o primeiro e segundo valor para divisao
                //utilizando if para que o divisor seja apenas diferente de 0  
                //variavel resultado recebendo o metodo
                case 4:
                    System.out.println("Digite o primeiro número: ");
                    num1 = ler.nextDouble();

                    do {
                        System.out.println("Digite o segundo número: ");
                        num2 = ler.nextDouble();

                        if (num2 == 0) {
                            System.out.println("O divisor não pode ser zero");
                        }

                    } while (num2 == 0);

                    resultado = calc.dividirNumeros(num1, num2);

                    System.out.printf("A divisão de %.2f e %.2f deu: %.2f%n", num1, num2, resultado);
                    break;
                    
                    
                //case 5 solicitando o primeiro valor para dobrar ele
                //variavel resultado recebendo o metodo
                case 5:
                    System.out.println("Digite o número que deseja dobrar: ");
                    num1 = ler.nextDouble();

                    resultado = calc.dobrarNumero(num1);

                    System.out.printf("O dobro de %.2f deu: %.2f%n ", num1, resultado);
                    break;

                    
                //case 1 solicitando o primeiro e segundo valor para exponenciacao
                //variavel resultado recebendo o metodo    
                case 6:
                    System.out.println("Digite o primeiro número: ");
                    num1 = ler.nextDouble();

                    System.out.println("Digite o segundo número: ");
                    num2 = ler.nextDouble();

                    resultado = calc.exponenciarNumeros(num1, num2);

                    System.out.printf("A exponenciação de %.2f e %.2f deu: %.2f%n ", num1, num2, resultado);
                    break;

                    
                //case 7 finalizando o programa utilizando System.exit   
                case 7:
                    System.out.println("Fim do programa.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida, escolha uma opção de 1 a 7");

            }

        } while (opcao != 7);
        
        ler.close();

    }

}
