package arearetangulo;

import entities.CalculoArea;
import java.util.Locale;
import java.util.Scanner;

public class AreaRetangulo {

  
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        CalculoArea calculo = new CalculoArea();
        
        System.out.println("Insira o a altura e largura do retângulo: ");
        calculo.width = sc.nextDouble();
        calculo.height = sc.nextDouble();
        
        System.out.println(calculo);
        
        
    }
    
}
