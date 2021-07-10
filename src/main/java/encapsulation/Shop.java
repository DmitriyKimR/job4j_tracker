package encapsulation;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int rsl = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                rsl = i;
                break;
            } else if (products.length <= 1) {
                rsl = -1;
                break;
            }
        }
        return rsl;
    }
}