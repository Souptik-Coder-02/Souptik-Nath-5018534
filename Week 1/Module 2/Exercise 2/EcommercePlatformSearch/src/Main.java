import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("1", "Laptop", "Electronics"),
                new Product("2", "Smartphone", "Electronics"),
                new Product("3", "Table", "Furniture"),
                new Product("4", "Chair", "Furniture")
        };

        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        String searchId = "3";

        Product linearResult = Search.linearSearch(products, searchId);
        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult : "Not Found"));

        Product binaryResult = BinarySearch.binarySearch(products, searchId);
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult : "Not Found"));
    }
}
