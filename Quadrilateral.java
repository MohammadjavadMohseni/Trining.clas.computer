package trainig.shape.twodshape.quadrilateral;

import trainig.shape.Point;
import trainig.shape.twodshape.Triangle;
import trainig.shape.twodshape.TwodShape;

public abstract class Quadrilateral extends TwodShape {
    protected Point p1;
    protected Point p2;
    protected Point p3;
    protected Point p4;
    protected Point p5;
    protected Point p6;
    
    public Quadrilateral() {
        super("Quadrilateral");
    }
    
    protected Quadrilateral(String name) {
        super(name);
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
    
    public Point getP4() {
        return p4;
    }
    
    public void setP4(Point p4) {
        this.p4 = p4;
    }
    
    private Point getP5() {
        return p5;
    }
    
    private void setP5(Point p5) {
        this.p5 = p5;
    }
    
    private Point getP6() {
        return p6;
    }
    
    private void setP6(Point p6) {
        this.p6 = p6;
    }
    
    public Point intersection() { 
        line(p1, p3, p5);
        line(p2, p4, p6);
        if (p5 != p6) {
            return p6;
        }
        return p5;
    }
    
    public boolean Intersection (Point z1, Point z2, Point z3) {
        distanc(z1, z2);
        distanc(z2, z3);
        distanc(z1, z3);
        if (distanc(z1, z2) + distanc(z2, z3) == distanc(z1, z3)) {
            return false;
        }
        return true;
    }
    
    @Override
    public double area() {
        Triangle t1 = new Triangle(p1, p2, p4);
        Triangle t2 = new Triangle(p4, p2, p3);
        return t1.area() + t2.area();
    }
    
    @Override
    public boolean validate() {
        if (line(p1, p2, p3)) {
            return false;
        }
        if (line(p1, p2, p4)) {
            return false;
        }
        if (line(p2, p3, p4)) {
            return false;
        }
        if (line(p2, p3, p1)) {
            return false;
        }
        if (line(p3, p4, p1)) {
            return false;
        }
        if (line(p3, p4, p2)) {
            return false;
        }
        if (line(p4, p1, p2)) {
            return false;
        }
        if (line(p4, p1, p3)) {
            return false;
        }
        if (Intersection(p1, intersection(), p3)) {
            return false;
        }
        if (Intersection(p2, intersection(), p4)) {
            return false;
        }
        return true;
    }
}