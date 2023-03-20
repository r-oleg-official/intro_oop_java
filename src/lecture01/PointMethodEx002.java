package lecture01;

public class PointMethodEx002 {
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2)); // ошибка в лекции: 1- b(x)-a(x); 2- a(x)-b(x)
    }

    public static void main(String[] args) {
//        Point2D a = new Point2D();
//        a.x = 0;
//        a.y = 2;
        Point2D a = new Point2D(0, 2);
        System.out.println(a.toString());

//        Point2D b = new Point2D();
//        b.x = 0;
//        b.y = 10;
        Point2D b = new Point2D(0, 10);
        System.out.println(b.toString());
        System.out.println(distance(a, b));
    }
}
