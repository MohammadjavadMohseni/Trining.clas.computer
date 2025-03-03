package trainig.shape.twodshape;

import trainig.shape.Point;

public class Polygon extends TwodShape {
    public Point pi;

    public Polygon(String name) {
        super("Polygon");
        Point z;
        
        Point[] p = new Point[];
        
    }
    
    public Point getPi() {
        return pi;
    }
    
    public void setPi(Point pi) {
        this.pi = pi;
    }
    

    @Override
    public double area() {
        return 1;
    }

    @Override
    public boolean validate() {
        return true;
    }
    
}
