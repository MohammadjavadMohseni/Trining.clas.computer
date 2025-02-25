package trainig.practice;

public class Fibonacci {
    
    private int term(int n) {
        int fi = 0;
        int fj = 1;
        int fn = 0;
        int i = 1;
        if (n == 1 || n == 2) {
            fn = 1;
        } else {
            while (i <= n) {
                fn = fi + fj;
                fi = fj;
                fj=fn;
                ++i;
            }
        }
        return fn;
    }
    
    private int recursive(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 1;
        }
        return recursive(n-1) + recursive(n-2);
    }
    
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(" fib 3 = " + fib.recursive(3));
        System.out.println(" fib 5 = " + fib.recursive(5));
        System.out.println(" fib 7 = " + fib.recursive(7));
    }
}
