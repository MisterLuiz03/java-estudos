package calcdollar;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class CalcDollar {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        double dollar, real;
        
        System.out.println("What is the dollar price?");
        dollar = sc.nextDouble();
        
        System.out.println("How many dollars will be bought?");
        real = sc.nextDouble();
        
        System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.converterDollar(dollar, real));
        
        
        
        
        sc.close();
        

    }
    
}
