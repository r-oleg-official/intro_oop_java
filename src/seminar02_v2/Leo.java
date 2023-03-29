package seminar02_v2;

public class Leo extends Predator{
    public Leo(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Rrrr!";
    }
}
