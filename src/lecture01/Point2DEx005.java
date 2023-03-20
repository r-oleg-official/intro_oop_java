package lecture01;


/**
 * Это точка 2D
 */
public class Point2DEx005 {
    private int x, y;    // default public

    /**
     * Это конструктор ...
     * @param valueX это координата X
     * @param valueY это координата Y
     */
    public Point2DEx005(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2DEx005(int value) {
        this(value, value);
    }

    public Point2DEx005() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }
//    // private String getInfo() { return String.format("x: %d; y: %d", x, y); }

    @Override
    public String toString() {
        return getInfo();
    }

    static double distance(Point2DEx005 a, Point2DEx005 b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2)); // ошибка в лекции: 1- b(x)-a(x); 2- a(x)-b(x)
    }

    // Snippets
    // ctor  - don't work
    // get; set;
    // docs - don't work
}
