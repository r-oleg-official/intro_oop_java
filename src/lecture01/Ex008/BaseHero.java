package lecture01.Ex008;

import java.util.Random;

public class BaseHero {
    protected static int number;
    public static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    /** инициализатор статических полей */
    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    /**Конструктор */
    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    /** Конструктор мага по умолчанию */
    public BaseHero() {
        this(String.format("Hero_Magican #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }

    public String getInfo() {
        return String.format("Name: %s Hp: %d Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    /** Метода лечения */
    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    /** Метода нанесения урона */
    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

    //Polimorfizm
    public void Attack(BaseHero target) {
        int damage = BaseHero.r.nextInt(10, 20);
        target.GetDamage(damage);
    }

}
