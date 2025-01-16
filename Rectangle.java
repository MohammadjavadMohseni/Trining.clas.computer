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
        int x = p2.getX() - p1.getX();
        int y = p2.getY() - p1.getY();
        double a = Math.sqrt(x*x + y*y);
        x = p2.getX() - p3.getX();
        y = p2.getY() - p3.getY();
        double b = Math.sqrt(x*x + y*y);
        double area = a*b;
        return area;
    }

    @Override
    public boolean validate() {
        return false;
    }
    
}
