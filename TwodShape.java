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
    
    public double line(Point z1, Point z2, Point z3) {
        double x = z3.getx();
        double y = z3.gety();
        double m = (z1.gety() - z2.gety()) / (z1.getx() - z2.getx());
        double xx = x - z1.getx();
        double b = z1.gety();
        double line = (y = m * xx + b);
        if (z1.gety() - z2.gety() == 0) {
            return y = b;
        }
        
        if (z1.getx() - z2.getx() == 0) {
            return y = (y + b) - b;
        }
        
        if (y != m * xx + b) {
            System.err.println(" ==> is not lin ");
        }
        return line;
    }
    
    public abstract double area();
    public abstract boolean validate();
}
