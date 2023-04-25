package lecture02.Ex005;

import lecture01.Ex008.Magician;

public class Druid extends lecture02.Ex005.BaseHero {
    private int harmony;
    private int maxHarmony;

    public Druid() {
        super(String.format("Hero_Druid #%d", ++Druid.number), Magician.r.nextInt(100, 200));
        this.maxHarmony = Magician.r.nextInt(50, 150);
        this.harmony = maxHarmony;
    }

    public String getInfo() {
        return String.format("%s Harmony: %d", super.getInfo(), this.harmony);
    }

    @Override
    public void die() {

    }

    public void healing(lecture02.Ex005.BaseHero target) {
        int heal = BaseHero.r.nextInt(10, 20);
        if (this.harmony >= heal) {
            target.healed(heal);
        }
    }
}
