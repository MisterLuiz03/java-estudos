package calculodebhaskara;

import java.util.Scanner;

public class Principal_Bhaskara {

    public static void main(String[] args) {

        double a, b, c;

        Calculo bh = new Calculo();

        Scanner sc = new Scanner(System.in);

        System.out.println("!!!ESTE PROGRAMA CALCULA A FÓRMULA DE BHASKARA E O DELTA!!!");

        System.out.println("Digite o valor de A: ");
        a = sc.nextDouble();

        System.out.println("Digite o valor de B: ");
        b = sc.nextDouble();

        System.out.println("Digite o valor de C: ");
        c = sc.nextDouble();

        System.out.println("RESULTADO DE DELTA: " + bh.calcularDelta(a, b, c));

        double[] raizes = bh.calcularRaizes(a, b, c);

        if (raizes != null) {
            System.out.println("RESULTADO DO X1: " + raizes[0]);
            System.out.println("RESULTADO DO X2: " + raizes[1]);
        } else {
            System.out.println("Sem raízes reais");
        }

        sc.close();
    }

}
