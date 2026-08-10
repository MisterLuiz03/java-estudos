package for4;

import java.util.Scanner;

public class For4 {


    public static void main(String[] args) {
        
        int n1;
        String nome;
        
        Scanner teste = new Scanner(System.in);
        
        System.out.print("Digite seu nome :");
        nome = teste.nextLine();
        
        System.out.print("Digite um número inteiro positivo: ");
        n1 = teste.nextInt();
        
        while(n1 != -1){
        
            System.out.println("Seu nome foi " + nome + "O numero foi " + n1);
            
            n1--;
            
        }
        
        
    }
    
}
