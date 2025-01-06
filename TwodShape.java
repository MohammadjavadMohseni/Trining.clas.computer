package trainig.shape.twodshape;

import trainig.shape.Shape;


public abstract class TwodShape extends Shape{
    
    protected TwodShape(String name){
        super(name);
    }
    
    public abstract double area();
}
