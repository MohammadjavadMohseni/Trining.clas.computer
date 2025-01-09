package trainig.shape.twodshape.quadrilateral;

public class Rectangle extends Quadrilateral {
    public Rectangle() {
        super("Rectangle");
    }
    
    protected Rectangle(String name) {
        super(name);
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

    @Override
    public boolean validate() {
        return false;
    }
    
}
