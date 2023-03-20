package lecture01;

public class Point2DEx004 {
    int x, y;

    public Point2DEx004(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2DEx004(int value) {
        this(value, value);
    }

    public Point2DEx004() {
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
