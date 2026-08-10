package calculo_imc;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        double peso, altura;

        Scanner sc = new Scanner(System.in);

        CalculoDoImc obj = new CalculoDoImc();

        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        altura = sc.nextDouble();

        double n3 = obj.calcularIMC(peso, altura);

        if (n3 < 18.5) {
            System.out.printf("Tu está magro e seu nível de obesidade está em 0");
        } else if (n3 >= 18.5 && n3 < 24.9) {
            System.out.println("Tu está no peso ideal e  seu nível de obesidade está em 0");
        } else if (n3 >= 24.9 && n3 < 29.9) {
            System.out.println("Você está acima do peso e seu nível de obesidade está em 1");
        } else if (n3 >= 29.9 && n3 < 39.9) {
            System.out.println("Você está obeso e seu nível de obesidade está em 2");
        }else{
            System.out.println("Você está MUITO acima do peso, tome cuidade  e seu nível de obesidade está em 3");
        }
    }

}
