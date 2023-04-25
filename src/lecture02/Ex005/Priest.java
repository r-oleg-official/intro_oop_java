package lecture02.Ex005;

public class Priest extends lecture02.Ex005.BaseHero {
    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++number), r.nextInt(100, 200));
        this.maxElixir = r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    public String getInfo() {
        return String.format("%s Elixir: %d", super.getInfo(), this.elixir);
    }

    public void attack(BaseHero target) {
        int damage = r.nextInt(10, 20);
        target.getDamage(damage);
    }

    @Override
    public void die() {

    }
}
