package seminar01_v3;

public class Product {
    private String name;
    private double price;

    /** Конструктор продукта*/
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
        // version 1
//        this.name = "default";
//        this.price = 0;

        // version 2
        this("default", 0);
    }
}
