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
    
    public abstract double area();
    public abstract boolean validate();
}
