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
        Triangle t1 = new Triangle("Triangle");
        t1.p1 = p1;
        t1.p2 = p2;
        t1.p3 = p4;
        
        Triangle t2 = new Triangle("Triangle");
        t2.p1 = p4;
        t2.p2 = p2;
        t2.p3 = p3;
        
        double area = t1.area() + t2.area();
        return area;
    }
}
