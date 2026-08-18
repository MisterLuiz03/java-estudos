package operador.ternario;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        /*
            Programa utilizando operador ternário
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        boolean temIngresso = true;

        String resultado = (idade >= 18 && temIngresso) ? "Pode entrar" : "Barrado";
        
        if (idade < 18) {
            System.out.println("voce é fan do cr6");
        }
        
        System.out.println(resultado);
    }

}
