package seminar01_v2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lay's", 100));
        machine.addProduct(new Product("Mars", 70));
        machine.addProduct(new Product("Twix", 70.99));
        machine.addProduct(new Product("Аленка", 90));
        machine.addProduct(new Perishable("Молоко Буренка", 90, new Date(2023, 1, 25)));

        System.out.println(machine);
    }
}
