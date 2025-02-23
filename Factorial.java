package trainig.factorial;

public class Factorial {
    
    public int factorial(int n) {
        int b = 1;
        if (n == 0 || n == 1) {
            b = 1;
            
        } else {
            int a = 1;
            while (a <= n) {
                b = b * a++;
            }
        }
        return b;
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
