import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("1", "Laptop", 5, 50000.00);
        Product product2 = new Product("2", "Smartphone", 10, 15000.00);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

    }
}
