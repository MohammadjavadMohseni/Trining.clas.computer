package trainig.shape.twodshape.quadrilateral;

public class Square extends Rectangle {
    
    public Square() {
        super("Square");
    }
    
    @Override
    public double area() {
        double d = super.area();
        return d;
    }
    
    @Override
    public boolean validate(){
        return 4 * (distanc(p1, p4) * distanc(p1, p4)) == 
                2 * (distanc(p1, p3) * distanc(p1, p3))
    }
}
