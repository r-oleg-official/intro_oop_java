package seminar02_v2;

public abstract class Animal {

    private String name;
    protected Animal(String name) {
        this.name = name;
    }

    public abstract String say();

    public String getName() {
        return this.name;
    }
    public abstract String feed();
}
