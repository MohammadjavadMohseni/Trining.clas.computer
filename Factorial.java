package trainig.factorial;

public class Factorial {
    
    public int factorial(int n) {
        int b = 1;
        if (n == 0) {
            b = 0;
            
        } else if (n == 1) {
            b = 1;
            
        } else {
            int a = 1;
            while (a < n) {
                int c = 1 * b;
                ++a;
                b = c * (a);
            }
        }
        return b;
    }
    
    private Factorial(String z) {
        z = "";
    }
    
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.err.println(" ==> " + f.factorial(0));
        System.err.println(" ==> " + f.factorial(1));
        System.err.println(" ==> " + f.factorial(2));
        System.err.println(" ==> " + f.factorial(3));
        System.err.println(" ==> " + f.factorial(4));
        System.err.println(" ==> " + f.factorial(5));
        System.err.println(" ==> " + f.factorial(6));
        System.err.println(" ==> " + f.factorial(7));
        System.err.println(" ==> " + f.factorial(8));
        System.err.println(" ==> " + f.factorial(9));
        System.err.println(" ==> " + f.factorial(10));
    }
    
}
