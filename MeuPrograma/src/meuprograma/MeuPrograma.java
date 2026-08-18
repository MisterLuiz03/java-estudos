package meuprograma;

import java.util.Scanner;

public class MeuPrograma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Calculo bh = new Calculo();
        
        double a, b, c;
        
        System.out.println("Digite o valor de a: ");
        a = sc.nextDouble();
        
        
        System.out.println("Digite o valor de b: ");
        b = sc.nextDouble();
        
        
        System.out.println("Digite o valor de c: ");
        c = sc.nextDouble();
        
        System.out.println("Resultado de delta: " + bh.CalcularDelta(a, b, c));
        
        double raizes[] = bh.CalcularRaizes(a, b, c);
        
        if (raizes != null) {
            System.out.println("Primeira raiz: " + raizes[0]);
            System.out.println("Segunda raiz: " + raizes[1]);
        }else{
            System.out.println("Sem raizes reais");
        }
        
        sc.close();

    }

}
