package tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        int num1;
        int soma = 0;
        int tab = 0;
        
        Scanner tabuada = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro para a tabuada desejada: ");
        num1 = tabuada.nextInt();
        
        
        while(tab <= 10){
        
              System.out.printf("%d X %d = %d%n ",num1, tab, num1 * tab);
        
        tab++;
        
        
        }
        
        

    }
    
}
