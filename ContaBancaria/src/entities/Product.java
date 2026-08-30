package entities;

public class Product {

    private String holder;
    private int number;
    private double balance;

    public Product(int number ,String holder) {
        this.holder = holder;
        this.number = number;
    }

    public Product(int number, String holder, double initialDeposit) {
        this.holder = holder;
        this.number = number;
        deposit(initialDeposit);
    }

   

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance+= amount;
    
    }
    
    public void withDraw(double amount){
        balance-= amount + 5.0;
    }
    
    public String toString(){
        return "Account" 
                + number
                + ", Holder: "
                + holder
                + ", Balance: $"
                + String.format("%.2f", balance);
        
        
    }
    
    
    
    
    
}
