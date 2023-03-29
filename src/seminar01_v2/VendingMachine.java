package seminar01_v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class VendingMachine {


    protected List<Product> localist = new ArrayList<Product>();

    public List<Product> getLocalist() {
        return localist;
    }

    public VendingMachine addProduct(Product inputProduct){
        localist.add(inputProduct);
        //inputProduct.setLoadDate(Date.valueOf(LocaleDate.now()));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder();
        for (Product product:
             localist) {
            localString.append(product.toString());
            localString.append("\n");
        }
        return localString.toString();
    }

    public Product findProduct(String name) {
        for (Product product:
             localist) {
            if (product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }
}
