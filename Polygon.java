package trainig.shape.twodshape;

import trainig.shape.Point;

public class Polygon extends TwodShape {
    Point[] p;
    int point;

    public Polygon(String name) {
        super("Polygon");
    }
    
    public Point[] get(Point z, int point) {
        return p;
    }

    @Override
    public double area() {
        return 1;
    }

    @Override
    public boolean validate() {
        return true;
    }

    
}
