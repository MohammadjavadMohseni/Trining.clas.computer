package trainig.smarksavg;

/**
 * to solve quadratic equation ..... ax^2 + bx + c = 0
 */
public class Quad {
    
    public static void main(String[] args) {
        Quad quad = new Quad();
        quad.solveQuad(2, 5, 9);
        quad.solveQuad(2, 5, 0);
        quad.solveQuad(2, 5, 0);
        quad.solveQuad(3, 4, 0);
        quad.solveQuad(9, 4, 1);
        quad.solveQuad(0, 2, 1);
    }
    
    private void solveQuad(double a, double b, double c) {
        System.out.println("\n\nquad eq : " + a + "x^2 + " + b + "x + " + c + " = 0 ");
        if (a == 0) {
            System.out.println("the eq is not quad ");
    }
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("quad eq has two roots : ");
            System.out.println("root 1 = " + x1);
            System.out.println("root 2 = " + x2);
        } else if (delta == 0) {
            double x1 = -b / (2 * a);
            System.out.println("quad eq has one root : ");
            System.out.println("root 1 =" + x1);
        } else {
            System.out.println("quad eq has no root : ");
        }
{
        }
    }
}
