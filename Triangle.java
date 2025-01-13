package trainig.shape.twodshape;

import trainig.shape.Point;

public class Triangle extends TwodShape {
    private Point p1;
    private Point p2;
    private Point p3;
    
    public Triangle(String name) {
        super("Triangle");
    }
    
    public Point getP1() {
        return p1;
    }
    
    public void setP1(Point p1) {
        this.p1 = p1;
    }
    
    public Point getP2() {
        return p2;
    }
    
    public void setP2(Point p2) {
        this.p2 = p2;
    }
    
    public Point getP3() {
        return p3;
    }
    
    public void setP3(Point p3) {
        this.p3 = p3;
    }
    
    public Triangle t(Point p1, Point p2, Point p3) {
        Triangle t = new Triangle("Triangle");
        t.setP1(p1);
        t.setP2(p2);
        t.setP3(p3);
        return t;
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
    }
    
    private double area(String x) {
        double a = distanc(p3, p2);
        double b = distanc(p1, p2);
        double c = distanc(p3, p1);
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
    
    @Override
    public boolean validate() {
        return false;
    }

}
