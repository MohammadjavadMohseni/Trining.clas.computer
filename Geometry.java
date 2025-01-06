package trainig.shape;

import trainig.shape.twodshape.Rectangle;
import trainig.shape.twodshape.Square;
import trainig.shape.twodshape.Triangle;
import trainig.shape.twodshape.TwodShape;

public class Geometry {
    
    public static void main(String[] args) {
        TwodShape sh;
        Rectangle rect = new Rectangle();
        rect.setp1(new Point(0, 0));
        rect.setp2(new Point(100, 0));
        rect.setp3(new Point(100, 50));
        rect.setp4(new Point(0, 50));
        System.err.println("==> area of " + rect.getTitle() + " is : " + rect.area());
        sh = rect;
        System.err.println("==> " + sh.area());
        
        Square sq = new Square();
        sq.setp1(new Point(0, 0));
        sq.setp2(new Point(100, 0));
        sq.setp3(new Point(100, 100));
        sq.setp4(new Point(0, 100));
        System.err.println("==> area of " + sq.getTitle() + " is : " + sq.area());
        sh = sq;
        System.err.println("==> " + sh.area());
        
        Triangle tr = new Triangle();
        tr.setp1(new Point(10, 100));
        tr.setp2(new Point(10, 10));
        tr.setp3(new Point(100, 10));
    }
}
