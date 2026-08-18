package entities;

public class Product {

    public String name;
    public int quantity;
    public double price;

    public double totalValueinStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;

    }

    public String toString() {
        return name
                + " - R$"
                + String.format("%.2f", price)
                + " - "
                + quantity
                + " quantidades, TOTAL: R$"
                + String.format("%.2f", totalValueinStock());

    }
    
    

}
