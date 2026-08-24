package entities;

public class CalculoSalario {
    
    public String name;
    public double grossSalary;
    public double tax;
    
    public double netSalary(){
        
         return grossSalary - tax;
        
    }
    
    public void increaseSalary(double percentage){
         double s = grossSalary * (percentage / 100);
        grossSalary = grossSalary + s;
    
    }
    
    public String toString(){
        return String.format("Funcionário: %s, R$%.2f\n", name, netSalary())
                ;
        
    
    }
}
