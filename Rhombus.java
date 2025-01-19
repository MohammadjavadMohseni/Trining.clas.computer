package trainig.shape.twodshape.quadrilateral;

public class Rhombus extends Parallelogram {
    
    public Rhombus() {
        super("Rhombus");
    }
    
    @Override
    public double area() {
        return (distanc(p1, p3) * distanc(p2, p4)) / 2;
    }
    
    @Override
    public boolean validate() {
        return 4 * (distanc(p1, p4) * distanc(p1, p4))  == 
                (distanc(p1, p3) * distanc(p1, p3)) + 
                (distanc(p2, p4) * distanc(p2, p3));
    }
    
}
