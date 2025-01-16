package trainig.shape.twodshape;

import trainig.shape.Point;
import trainig.shape.Shape;


public abstract class TwodShape extends Shape{
    
    protected TwodShape(String name){
        super(name);
    }
    
    public double distanc(Point z1, Point z2) {
        int x = (z1.getX() - z2.getX()) * (z1.getX() - z2.getX());
        int y = (z1.getY() - z2.getY()) * (z1.getY() - z2.getY());
        double a = Math.sqrt(x + y);
        return a;
    }
    
    public boolean line(Point z1, Point z2, Point z3) {
        if (z1.getX() == z2.getX()) {
            return z3.getX() == z1.getX();
        }
        if (z1.getY() == z2.getY()) {
            return z3.getY() == z1.getY();
        }
        return z3.getY() == ((1.0 * z1.getY() - z2.getY()) / (z1.getX() - z2.getX())) * (z3.getX() - z1.getX()) + z1.getY();
        
    }
    
    public abstract double area();
    public abstract boolean validate();
}
