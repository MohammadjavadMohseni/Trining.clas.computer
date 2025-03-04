package trainig.shape;

import java.lang.reflect.Array;
import trainig.shape.twodshape.Polygon;
import trainig.shape.twodshape.quadrilateral.Rectangle;
import trainig.shape.twodshape.quadrilateral.Square;
import trainig.shape.twodshape.Triangle;
import trainig.shape.twodshape.TwodShape;
import trainig.shape.twodshape.quadrilateral.Quadrilateral;

public class Geometry {
    
    public static void main(String[] args, Point z) {
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
        
        Quadrilateral qu = new Quadrilateral("Quadrilateral") {};
        qu.setP1(new Point(0, 0));
        qu.setP2(new Point(100, 0));
        qu.setP3(new Point(100, 100));
        qu.setP4(new Point(0, 100));
        System.err.println("==> area of " + qu.getTitle() + " 1" + " is : " + qu.area());
        System.err.println("==> validate of" + qu.getTitle() + " 1" + " is : " + qu.validate());
        sh = qu;
        System.err.println("==> " + sh.area());
        
        Quadrilateral qa = new Quadrilateral("Quadrilateral") {};
        qa.setP1(new Point(0, 0));
        qa.setP2(new Point(0, 0));
        qa.setP3(new Point(0, 0));
        qa.setP4(new Point(0, 0));
        System.err.println("==> area of " + qa.getTitle() + " 2 is : " + qa.area());
        System.err.println("==> validate of" + qa.getTitle() + " 2 is : " + qa.validate());
        sh = qa;
        System.err.println("==> " + sh.area());
        
        Quadrilateral qd = new Quadrilateral("Quadrilateral") {};
        qd.setP1(new Point(0, 0));
        qd.setP2(new Point(0, 0));
        qd.setP3(new Point(0, 100));
        qd.setP4(new Point(100, 0));
        System.err.println("==> area of " + qd.getTitle() + " 3 is : " + qd.area());
        System.err.println("==> validate of" + qd.getTitle() + " 3 is : " + qd.validate());
        sh = qd;
        System.err.println("==> " + sh.area());
        
        Quadrilateral qr = new Quadrilateral("Quadrilateral") {};
        qr.setP1(new Point(100, 100));
        qr.setP2(new Point(200, 200));
        qr.setP3(new Point(300, 300));
        qr.setP4(new Point(400, 400));
        System.err.println("==> area of " + qr.getTitle() + " 4 is : " + qr.area());
        System.err.println("==> validate of" + qr.getTitle() + " 4 is : " + qr.validate());
        sh = qr;
        System.err.println("==> " + sh.area());
        
        Quadrilateral qi = new Quadrilateral("Quadrilateral") {};
        qi.setP1(new Point(100, 400));
        qi.setP2(new Point(200, 300));
        qi.setP3(new Point(300, 200));
        qi.setP4(new Point(400, 100));
        System.err.println("==> area of " + qi.getTitle() + " 5 is : " + qi.area());
        System.err.println("==> validate of" + qi.getTitle() + " 5 is : " + qi.validate());
        sh = qi;
        System.err.println("==> " + sh.area());
        
        Quadrilateral ql = new Quadrilateral("Quadrilateral") {};
        ql.setP1(new Point(100, 200));
        ql.setP2(new Point(100, 100));
        ql.setP3(new Point(300, 100));
        ql.setP4(new Point(300, 200));
        System.err.println("==> area of " + ql.getTitle() + " 6 is : " + ql.area());
        System.err.println("==> validate of" + ql.getTitle() + " 6 is : " + ql.validate());
        sh = ql;
        System.err.println("==> " + sh.area());
        
        Polygon p = new Polygon("Polygon");
        p.get(z, 0);
    }
}
