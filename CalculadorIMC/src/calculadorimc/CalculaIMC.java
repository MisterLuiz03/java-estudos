package calculadorimc;

public class CalculaIMC {

    public String name;
    public double altura;
    public double peso;

    public double calculoImc(double peso, double altura) {
    
        
        double calc;

        calc = peso / (Math.pow(altura, 2));
        if (calc < 18.5) {
            System.out.printf("BAIXO PESO");
        } else if (calc < 24.9) {
            System.out.printf("PESO ADEQUADO");
        } else if (calc < 29.9) {
            System.out.printf("SOBREPESO");
        } else {
            System.out.printf("OBESIDADE");
        }

        return calc;

    }

}
