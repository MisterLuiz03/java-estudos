package notasaluno;

import entities.CalculoNota;
import java.util.Locale;
import java.util.Scanner;


public class NotasAluno {


    public static void main(String[] args) {
        
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        CalculoNota nota = new CalculoNota();
        
        nota.name = sc.nextLine();
        nota.nota1 = sc.nextDouble();
        nota.nota2 = sc.nextDouble();
        nota.nota3 = sc.nextDouble();
        
     
        
        System.out.printf("NOTA FINAL: %.2f\n", nota.notaFinal());
        
        if (nota.notaFinal() >= 60.0) {
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
            System.out.printf("NOTA RESTANTE: %.2f", nota.notaRestante());
        }
        
        sc.close();
    }
    
}
