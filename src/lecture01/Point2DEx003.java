package lecture01;

public class Point2DEx003 {
    int x, y;

    public Point2DEx003(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

//    public Point2DEx003() {
//        x = 0;
//        y = 0;
//    }

//    public Point2DEx003(int value) {
//        x = value;
//        y = value;
//    }

//    public Point2DEx003(int value) {
//        this.x = value;             // == x = value;
//        this.y = value;
//    }

    public Point2DEx003(int value) {
        this(value, value);
    }

    public Point2DEx003() {
        this(0);
    }

    public String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }
    // private String getInfo() { return String.format("x: %d; y: %d", x, y); }

    @Override
    public String toString() {
        return getInfo();
    }

    // Snippets
    // ctor  - don't work
    // get; set;
    // docs - don't work
}
