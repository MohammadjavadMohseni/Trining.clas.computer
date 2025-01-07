package trainig.shape.twodshape;

import java.awt.geom.Point2D;
import trainig.shape.Point;

public class Triangle extends TwodShape {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(String name) {
        super("Triangle");
    }
    
    public Point getp1() {
        return p1;
    }
    
    public void setp1(Point p1) {
        this.p1 = p1;
    }
    
    public Point getp2() {
        return p2;
    }
    
    public void setp2(Point p2) {
        this.p2 = p2;
    }
    
    public Point getp3() {
        return p3;
    }
    
    public void setp3(Point p3) {
        this.p3 = p3;
    }

    @Override
    public double area() {
        int x = p3.getx() - p2.getx();
        int y = p3.gety() - p2.gety();
        double a = Math.sqrt(x*x + y*y);
        int xx = p1.getx() - p2.getx();
        int yy = p1.gety() - p2.gety();
        double b = Math.sqrt(xx*xx + yy*yy);
        int xxx = p3.getx() - p1.getx();
        int yyy = p3.gety() - p1.gety();
        double c = Math.sqrt(xxx*xxx + yyy*yyy);
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
        distanc(Point z1, Point z2) {
        int zx = (z1.getx() - z2.getx()) * (z1.getx() - z2.getx());
        int zy = (z1.gety() - z2.gety()) * (z1.gety() - z2.gety());
        Math.sqrt(zx + zy);
        Point z1 = new Point(x, y);
        Point z2 = new Point(x, y);
        return a;
    }
    }

}
