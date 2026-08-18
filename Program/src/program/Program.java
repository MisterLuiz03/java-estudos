package program;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        
        /* 
            Este programa adiciona e remove produtos de um estoque
        
        */
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        
        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade: ");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Informações do produto: " + product);
        
        System.out.println();
        System.out.println("Insira o número de produtos a serem adicionados ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        
        System.out.println("");
        System.out.println("Informações atualizadas: " + product);
        
        System.out.println();
        System.out.println("Insira o número de produtos a serem removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Informações atualizadas: " + product);
        
        sc.close();
        
        
    }
    
}
