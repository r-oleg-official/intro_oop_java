package lecture01.Ex008;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
//        Magician hero1 = new Magician();
//        System.out.println(hero1.getInfo());
//
//        Priest hero2 = new Priest();
//        System.out.println(hero2.getInfo());

//        Priest hero3 = new Priest();
//        System.out.println(hero3.getInfo());

//        hero3.GetDamage(hero2.Attack());
//        System.out.println(hero3.getInfo());
//        System.out.println(hero2.getInfo());
//        hero3.GetDamage(hero3.Attack());

        // #region ex1 Demo
        // Polimorfizm
//        System.out.println();
//        BaseHero hero3 = new Magician();
//        System.out.println(hero3.getInfo());
//        BaseHero hero4 = new Priest();
//        System.out.println(hero4.getInfo());
//        //#endregion

        // #region ex2 Attack
//        hero3.Attack(hero4);
//        System.out.println(hero4.getInfo());
//
//        hero4.Attack(hero3);
//        System.out.println(hero3.getInfo());
        // #endregion

        // #region Teams
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = 0;
        int priestCount = 0;

        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            if (rand.nextInt(2) == 0) {
                teams.add(new Priest());
                priestCount++;
            } else {
                teams.add(new Magician());
                magicianCount++;
            }
            System.out.println(teams.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("magicalCount: %d, priestCount:  %d \n\n", magicianCount, priestCount);
    }
}
