package lecture01.Ex008;

import java.util.Random;

public class Teams {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = rand.nextInt(0, teamCount);
        int priestCount = teamCount - magicianCount;

        System.out.printf("magicalCount: %d priestCount: %d \n", magicianCount, priestCount);

        Priest[] priests = new Priest[priestCount];
        Magician[] magicians = new Magician[magicianCount];

        /** Наполнение массива жрецами */
        for (int i = 0; i < priestCount; i++) {
            priests[i] = new Priest();
            System.out.println(priests[i].getInfo());
        }
        // Name: HERO_PRIEST_D #1 Hp: 143 Type: Priest Elixir: 56
        System.out.println();

        /** Наполнение массива магами */
        for (int i = 0; i < magicianCount; i++) {
            magicians[i] = new Magician();
            System.out.println(magicians[i].getInfo());
        }

    }
}
