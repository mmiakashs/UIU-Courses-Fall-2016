package sa.com.sixthlecture;

/**
 * Created by akashs on 12/7/16.
 */
public class Product {
    public String productName;
    public double price;

    public Product() {
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
