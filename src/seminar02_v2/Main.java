package seminar02_v2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = List.of(
        new Cow("Мурка"),
        new Crocodile("Гена"),
        new Leo("Симба -Леопольд"),
        new Goat("Шнурка"));

        Zoo zoo = new Zoo(animalList);

        for (Animal animal:
                zoo.getAnimalList()) {
            System.out.println(animal.say());
        }
    }
}
