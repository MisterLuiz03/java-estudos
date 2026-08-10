package vetor_livro;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        

        String product1 = "Computer";
        String product2 = "Office desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        System.out.printf("Products:%n%s, which price is $%.2f%n%s, which price is $%.2f%n", product1, price1, product2, price2);
        System.out.printf("%n");
        System.out.printf("Record: %d years old, code %d and gender: %c", age, code, gender);
        System.out.printf("%n%n");
        System.out.printf("Measue with eight decimal places: %.8f%nRouded (three decimal places): %.3f%n", measure, measure);
        
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        int b = 4;
        int a = 2;
        int c = -6;
                
        double delta = Math.pow(b, 2) - 4*a*c;
        
        double x1 = (-b + Math.sqrt(delta))/(2.0 * a);
        double x2 = (-b - Math.sqrt(delta))/(2.0 * a);
        
        System.out.println(x1);
        System.out.println(x2);
        
        
        
        
        /*
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        
        IO.println(15);
                
        int opcao;


        double resultado;

        System.out.println("== ESCOLHA UMA OPERAÇÃO MATEMÁTICA ==");
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRACAO");
        opcao = sc.nextInt();

        Soma obj = new Soma();
        Subratacao obj2 = new Subratacao();

        

        switch (opcao) {

            case 1:

                System.out.println("Digite o primeiro valor:");
                num1 = sc.nextInt();

                System.out.println("Digite o segundo valor:");
                num2 = sc.nextInt();

                obj.somarValores(num1, num2);

                System.out.println("A soma dos valores deu: " + obj.somarValores(num1, num2));
                break;

            case 2:

                System.out.println("Digite o primeiro valor:");
                num1 = sc.nextInt();

                System.out.println("Digite o segundo valor:");
                num2 = sc.nextInt();

                obj2.subtrairValores(num1, num2);

                System.out.println("A subtralçao destes valores deu: " + obj2.subtrairValores(num1, num2));
                break;

            default:
                System.out.println("Opção inválida, escolha uma opção de 1 a 2");
        }
*/
        
        
      
        
        
    }

}
