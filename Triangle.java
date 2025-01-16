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
    
    public final void setP1(Point p1) {
        this.p1 = p1;
    }
    
    public Point getP2() {
        return p2;
    }
    
    public final void setP2(Point p2) {
        this.p2 = p2;
    }
    
    public Point getP3() {
        return p3;
    }
    
    public final void setP3(Point p3) {
        this.p3 = p3;
    }
    
    public Triangle(Point z1, Point z2, Point z3) {
        super("Triaangle");
        setP1(z1);
        setP2(z2);
        setP3(z3);
    }
    
    @Override
    public double area() {
        int x = p3.getX() - p2.getX();
        int y = p3.getY() - p2.getY();
        double a = Math.sqrt(x*x + y*y);
        int xx = p1.getX() - p2.getX();
        int yy = p1.getY() - p2.getY();
        double b = Math.sqrt(xx*xx + yy*yy);
        int xxx = p3.getX() - p1.getX();
        int yyy = p3.getY() - p1.getY();
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
        return !line(p1, p2, p3);
    }

}
