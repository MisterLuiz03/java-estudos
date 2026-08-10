package consolecalc;

import java.util.Scanner;


public class ConsoleCalc {


    public static void main(String[] args) {
        
        Scanner calc = new Scanner(System.in);
        
        double number1, number2;
                
        System.out.println("Determine o primeiro número: ");
        number1 = calc.nextDouble();
        
        System.out.println("Determine o segundo número: ");
        number2 = calc.nextDouble();
        
        System.out.println("Escolha a operaçäo que deseja utilizar: ");
        System.out.println("1 - ADIÇÄO");
        System.out.println("2 - SUBTRAÇÄO");
        System.out.println("3 - MULTIPLICAÇÄO");
        System.out.println("4 - DIVISÄO");
        
        int options = calc.nextInt();
        
        switch(options){
            case 1:
                System.out.println("RESULTADO FINAL: " + (number1 + number2));    
            break;   
            
            case 2:
                System.out.println("RESULTADO FINAL :" + (number1 - number2));
            break;    
                
            case 3:
                System.out.println("RESULTADO FINAL :" + (number1 * number2));
            break;
            
            case 4:
                System.out.println("RESULTADO FINAL: " + (number1 / number2));
                
            default:
                System.out.println("INDISPONÍVEL");
                
        }
        
        calc.close();
        
       
        
    }
    
}
