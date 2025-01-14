package trainig.shape.twodshape;

import trainig.shape.Point;
import trainig.shape.Shape;


public abstract class TwodShape extends Shape{
    
    protected TwodShape(String name){
        super(name);
    }
    
    public double distanc(Point z1, Point z2) {
        int x = (z1.getx() - z2.getx()) * (z1.getx() - z2.getx());
        int y = (z1.gety() - z2.gety()) * (z1.gety() - z2.gety());
        double a = Math.sqrt(x + y);
        return a;
    }
    
    public boolean line(Point z1, Point z2, Point z3) {
        if (z1.getx() == z2.getx()) {
            return z3.getx() == z1.getx();
        }
        if (z1.gety() == z2.gety()) {
            return z3.gety() == z1.gety();
        }
        return z3.gety() == ((1.0 * z1.gety() - z2.gety()) / (z1.getx() - z2.getx())) * (z3.getx() - z1.getx())
        
    }
    
    public abstract double area();
    public abstract boolean validate();
}
