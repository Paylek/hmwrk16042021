package shop;

public class Product {
    protected int id;
    private final String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Номер товара " + id +
                " Название товара " + name +
                " Стоимость товара " + price;
    }
}
