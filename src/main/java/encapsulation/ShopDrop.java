package encapsulation;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null && i + 1 < products.length && products[i + 1] != null) {
                Product temp = products[i];
                products[i] = products[i + 1];
                products[i + 1] = temp;
            }
        }
        return products;
    }
}
