package lecture03.Ex005;

import java.lang.reflect.Array;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Random r = new Random();

        // #region Collections.sort(numbers);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(r.nextInt(1, 20));
        }

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        // #endregion

        // #region Comparable<Worker>
        List<Worker> db = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            db.add(new Worker("Имя" + i, "Фамилия" + i,
                    r.nextInt(18, 31), r.nextInt(10000)));
        }
        System.out.println(db);

        // Collections.sort(db);
        db.sort(new SalaryComparator());
        db.sort((w1, w2) -> Integer.compare(w1.age, w2.age));
        // db.sort(Comparator.comparingInt(w -> w.age));
        // db.sort((w1, w2) -> Integer.compare(w1.salary, w2.salary));

        // Array.sort(...)
        System.out.println(db);
        // #endregion

        //#region Comparable<Worker>
        List<Worker> db2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            db2.add(new Worker("Имя" + i, "Фамилия" + i, r.nextInt(18,31),
                    r.nextInt(10000)));
        }
        System.out.println(db2);
        // db2.sort(new AgeComparator());
        System.out.println(db2);
        // #endregion

        // #region
        Worker w1 = new Worker("Имя", "Фамилия", 20, 20);
        Worker w2 = new Worker("Имя", "Фамилия", 20, 20);

        // #endregion
    }
}
