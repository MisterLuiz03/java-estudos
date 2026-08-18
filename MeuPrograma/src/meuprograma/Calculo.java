
package meuprograma;


public class Calculo {
    
    public double CalcularDelta(double a, double b, double c){
    
        double delta = Math.pow(b, 2) - 4 *a*c;
        
        return delta;
    
    }
    
    public double[] CalcularRaizes(double a, double b, double c){
    
        double delta = CalcularDelta(a,b,c);
        
        if (delta == 0) {
            return null;
            
        }
        
        double x1 = (-b+Math.sqrt(delta))/(2*a);
        double x2 = (-b-Math.sqrt(delta))/(2*a);
        
        return new double[]{x1,x2};
        
    }
    
}
