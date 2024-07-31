import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, Product updatedProduct) {
        products.put(productId, updatedProduct);
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }
}
