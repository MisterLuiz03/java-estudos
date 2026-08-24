package calculopi;

import java.util.Locale;
import java.util.Scanner;
import util.Calcultator;

public class CalculoPI {



    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calcultator calc = new Calcultator();
        
        double raio = sc.nextDouble();

        double c = calc.circuferencia(raio);

        double v = calc.volume(raio);

        System.out.printf("Circuferencia: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI valor: %.2f\n", calc.PI);

        sc.close();

    }



}
