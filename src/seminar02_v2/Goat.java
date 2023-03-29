package seminar02_v2;

public class Goat extends Herbivores {

    public Goat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Bee!";
    }
}
