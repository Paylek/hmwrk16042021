package shop;

import java.util.Comparator;

class ShopComparator implements Comparator<Product> {
    String shopComparator;

    public ShopComparator(String shopComparator) {
        this.shopComparator = shopComparator;
    }

    @Override
    public int compare(Product a1, Product a2) {
        return switch (shopComparator) {
            case "Price" -> a1.getPrice() - a2.getPrice();
            case "Id" -> a1.getId() - a2.getId();
            default -> 0;
        };
    }
}
