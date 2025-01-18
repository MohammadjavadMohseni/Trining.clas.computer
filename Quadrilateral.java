package trainig.shape.twodshape.quadrilateral;

import trainig.shape.Point;
import trainig.shape.twodshape.Triangle;
import trainig.shape.twodshape.TwodShape;

public abstract class Quadrilateral extends TwodShape {
    protected Point p1;
    protected Point p2;
    protected Point p3;
    protected Point p4;
    
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
    
    public boolean isDiagonalQuad() {
        Point i = intersection();
        if (p1.getX() == p3.getX()) {
            return x1 = p1.getX();
        }
        if (p1.getY() == p3.getY()) {
            return y1 = p1.getY();
        }
        double x2 = (b2 - b1) / (m1 - m2);
        if (p2.getX() == p4.getX()) {
            return x2 == p2.getX();
        }
        double y2 = ((1.0 * p2.getY() - p4.getY()) / (p2.getX() - p4.getX())) * x2 + (-((1.0 * p2.getY() - p4.getY()) / (p2.getX() - p4.getX())) * p2.getX() + p2.getY());
        if (p2.getY() == p4.getY()) {
            return y2 == p2.getY();
        }
        double m1 = (1.0 * p1.getY() - p3.getY()) / (p1.getX() - p3.getX());
        double m2 = (1.0 * p2.getY() - p4.getY()) / (p2.getX() - p4.getX());
        double b1 = -m1 * p1.getX() + p1.getY();
        double b2 = -m2 * p2.getX() + p2.getY();
        if (m1 == m2) {
            System.err.println("");
        }
        double x1 = (b2 - b1) / (m1 - m2);
        double x2 = (b2 - b1) / (m1 - m2);
        double y1 = m1 * x1 + b1;
        double y2 = m2 * x2 + b2;
        return Y = y1 == y2;
        return X = x1 == x2;
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
        return true;
    }

}