package shop;

import java.util.*;

public class Shop {
    private final ArrayList<Product> shopList = new ArrayList<>();

    public void addProdToShop(Product product) throws ShopExceptions {
        if (shopList.indexOf(product) != product.id)
        shopList.add(product);
        else throw new ShopExceptions("Этот Товар уже существует в списке");
    }


    public ArrayList<Product> getShopProducts() {
        return shopList;
    }

    public void showShop() {
        for (Product e : shopList) {
            System.out.println(e);
        }
    }

    public void removeShop(int number) {
        for (Product e : shopList) {
            if (e.getId() == number) {
                shopList.remove(e);
                break;
            }
        }
    }

    public void editShop(Product product) {
        for (Product e : shopList) {
            if (e.getId() == product.getId()) {
                int indexOfProduct = shopList.indexOf(e);
                shopList.set(indexOfProduct, product);
                break;
            }
        }
    }

}

