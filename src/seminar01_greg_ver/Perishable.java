package seminar01_greg_ver;
import java.util.Date;

public class Perishable extends Product {
    private Date expireDate = new Date();

    public Perishable(String name, double cost, Date expireDate) {
        super(name, cost);
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" годен до %s", expireDate.toString()));
        return localString.toString();
    }
}
