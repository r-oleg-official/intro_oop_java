package lecture01;

public class PointMethodEx005 {

    public static void main(String[] args) {
        Point2DEx005 a = new Point2DEx005(0, 2);
//        a.setX(12);
//        a.x = 14;
        System.out.println(a.getX());
        System.out.println(a.getY());
//        a = new Point2DEx005();
        Point2DEx005 b = new Point2DEx005(0);
        System.out.println(b);
        var dis = Point2DEx005.distance(a, b);
        System.out.println(dis);
    }
}
