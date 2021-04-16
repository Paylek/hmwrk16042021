package shop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product car = new Product(1, "car", 110);
        Product cat = new Product(2, "cat", 10);
        Product milk = new Product(3, "milk", 12);
        Product beard = new Product(4, "beard", 17);
        Product dog = new Product(5, "dog", 19);
        Product eyes = new Product(4, "eyes", 9);

        Shop shop = new Shop();

        try {
            shop.addProdToShop(car);
            shop.addProdToShop(cat);
            shop.addProdToShop(milk);
            shop.addProdToShop(beard);
            shop.addProdToShop(dog);
        } catch (ShopExceptions e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Product> productsListForSortPrice = shop.getShopProducts();

        productsListForSortPrice.sort(new ShopComparator("Price"));
        for (Product e : productsListForSortPrice) {
            System.out.println(e);
        }
        shop.removeShop(1);
        cat.setPrice(500);
        shop.editShop(eyes);
        shop.showShop();
    }
}
