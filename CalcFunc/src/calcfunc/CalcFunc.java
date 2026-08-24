package calcfunc;

import entities.CalculoSalario;
import java.util.Locale;
import java.util.Scanner;

public class CalcFunc {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        CalculoSalario calc = new CalculoSalario();
        
        System.out.println("Nome: ");
        calc.name = sc.nextLine();
        System.out.println("Salário bruto: ");
        calc.grossSalary = sc.nextDouble();
        System.out.println("Desconto: ");
        calc.tax = sc.nextDouble();
        
        System.out.println();
        System.out.println(calc);
        
        System.out.println("Qual porcentagem para aumentar o salário: ");
        double percentage = sc.nextDouble();
        calc.increaseSalary(percentage);
        
        System.out.println();
        System.out.println("Informações atualizadas: " + calc);
        
        sc.close();
        
        
        
        
        
        
        
        
    }
    
}
