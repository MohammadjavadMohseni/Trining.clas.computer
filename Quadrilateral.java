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
    
    public Point intersection() {
        if (p1.getX() == p3.getX()) {
            
        }
        if (p2.getX() == p4.getX()) {
            
        }
        if ((p1.getX() - p3.getX()) == (p2.getX() - p4.getX())) {
            System.err.println("");
        }
        double m1 = (1.0 * p1.getY() - p3.getY()) / (p1.getX() - p3.getX());
        double m2 = (1.0 * p2.getY() - p4.getY()) / (p2.getX() - p4.getX());
        double b1 = -m1 * p1.getX() + p1.getY();
        double b2 = -m2 * p2.getX() + p2.getY();
        if (m1 == m2) {
            System.err.println("");
        }
        double x = (b2 - b1) / (m1 - m2);
        double y = m1 * x + b1;
        Point p = new Point();
        p.setX((int) x);
        p.setY((int) y);
        return p;
    }
    
    public boolean isDiagonalQuad() {
        Point i = intersection();
        return !(distanc(p2, i) + distanc(i, p4) == distanc(p2, p4) &&
                distanc(p1, i) + distanc(i, p3) == distanc(p1, p3));
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
        if (isDiagonalQuad()) {
            return false;
        }
        return true;
    }

}