package testemediafor;

import java.util.Scanner;


public class TesteMediafor {

    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);
        
        int i;
        double num, media, soma = 0;
        
        for (i = 1; i <= 2; i++) {
            System.out.println("Digite a  nota" + i + "º: ");
            num = notas.nextDouble();
           
           soma =+ num;
           
        }
            
           media = soma/  2;
           
           
           System.out.println("Sua media final foi: " + media);
           
           notas.close();
        }
        
    }
    

