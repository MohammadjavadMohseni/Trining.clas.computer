package trainig.shape.twodshape;

import trainig.shape.Point;

public class Rectangle extends TwodShape {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Rectangle() {
        super("Rectangle");
    }
    
    protected Rectangle(String name) {
        super(name);
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
    
    public Point getp4() {
        return p4;
    }
    
    public void setp4(Point p4) {
        this.p4 = p4;
    }

    @Override
    public double area() {
        int x = p2.getx() - p1.getx();
        int y = p2.gety() - p1.gety();
        double a = Math.sqrt(x*x + y*y);
        x = p2.getx() - p3.getx();
        y = p2.gety() - p3.gety();
        double b = Math.sqrt(x*x + y*y);
        double area = a*b;
        return area;
    }
}
