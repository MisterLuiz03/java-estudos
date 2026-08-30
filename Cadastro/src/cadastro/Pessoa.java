package cadastro;


public class Pessoa {
    
    public String name;
    public double altura;
    public double peso;
    
    public double calculoIMC(double peso, double altura){
              double calc;
              calc = peso*(Math.pow(altura, 2));
              return calc;
        
    }
    
}
