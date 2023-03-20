package lecture01;

public class PointMethodEx004 {
    static double distance(Point2DEx004 a, Point2DEx004 b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2)); // ошибка в лекции: 1- b(x)-a(x); 2- a(x)-b(x)
    }

    public static void main(String[] args) {
        Point2DEx004 a = new Point2DEx004(0, 2);
        System.out.println(a.getInfo());

        Point2DEx004 b = new Point2DEx004(10);
        System.out.println(b.toString());
        System.out.println(distance(a, b));
    }
}
