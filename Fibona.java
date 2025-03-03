package trainig.smarksavg;

public class Fibona {
    
    public static void main(String[] args) {
        int fib1 = 1;
        int fib2 = 1;
        System.err.println("==> fib 1 : " + fib1);
        while (fib2 < 100) {
            System.err.println("==> fib : " + fib2);
            int nextFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = nextFib;
        }
    }
}
