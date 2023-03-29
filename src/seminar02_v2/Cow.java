package seminar02_v2;

public class Cow extends Herbivores {

    public  Cow(String name) {
        super(name);
    }
    @Override
    public String say() {
        return "Muu!";
    }
}
