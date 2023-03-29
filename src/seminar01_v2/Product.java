package seminar01_v2;

import java.util.Date;

public class Product {
    private String name;
    private double cost;

    private Date loadDate = new Date();


    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Наименование %s цена %f", name, cost);
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    public Date getLoadDate() {
        return loadDate;
    }

    public String getName() {
        return name;
    }
}
