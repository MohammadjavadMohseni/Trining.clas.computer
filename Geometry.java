package trainig.shape;

import trainig.shape.twodshape.quadrilateral.Rectangle;
import trainig.shape.twodshape.quadrilateral.Square;
import trainig.shape.twodshape.Triangle;
import trainig.shape.twodshape.TwodShape;
import trainig.shape.twodshape.quadrilateral.Quadrilateral;

public class Geometry {
    
    public static void main(String[] args) {
        TwodShape sh;
        Rectangle rect = new Rectangle();
        rect.setP1(new Point(0, 0));
        rect.setP2(new Point(100, 0));
        rect.setP3(new Point(100, 50));
        rect.setP4(new Point(0, 50));
        System.err.println("==> area of " + rect.getTitle() + " is : " + rect.area());
        sh = rect;
        System.err.println("==> " + sh.area());
        
        Square sq = new Square();
        sq.setP1(new Point(0, 0));
        sq.setP2(new Point(100, 0));
        sq.setP3(new Point(100, 100));
        sq.setP4(new Point(0, 100));
        System.err.println("==> area of " + sq.getTitle() + " is : " + sq.area());
        sh = sq;
        System.err.println("==> " + sh.area());
        
        Triangle tr = new Triangle("Triangle");
        tr.setP1(new Point(10, 100));
        tr.setP2(new Point(10, 10));
        tr.setP3(new Point(100, 10));
        System.err.println("==> area of " + tr.getTitle() + " is : " + tr.area());
        sh = tr;
        System.err.println("==> " + sh.area());
        
        Quadrilateral qu = new Quadrilateral("Quadrilateral");
        qu.setP1(new Point(0, 0));
        qu.setP2(new Point(100, 0));
        qu.setP3(new Point(100, 100));
        qu.setP4(new Point(0, 100));
        System.err.println("==> area of " + qu.getTitle() + " is : " + qu.area());
        sh = qu;
        System.err.println("==> " + sh.area());
    }
}
