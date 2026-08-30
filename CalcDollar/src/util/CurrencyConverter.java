package util;


public class CurrencyConverter {

        public double dollar;
        public double real;

        public static double converterDollar(double dollar, double real){
            double c;
            c = dollar * real;
            c = c+(c*0.06);
            return c;
        
        }
    
}
