package trainig.shape.twodshape.quadrilateral;

public class Parallelogram extends Quadrilateral{
    
    public Parallelogram() {
        super("Parallelogram");
    }
    
    protected Parallelogram(String name) {
        super(name);
    }
    
    @Override
    public double area() {
        double d = super.area();
        return d;
    }
    
    @Override
    public boolean validate() {
        return (2 * (distanc(p1, p4) * distanc(p1, p4))) + 
                (2 * (distanc(p4, p3) * distanc(p4, p3))) == 
                (distanc(p1, p3) * distanc(p1, p3)) + 
                (distanc(p2, p4) * distanc(p2, p4));
    }
    
}
