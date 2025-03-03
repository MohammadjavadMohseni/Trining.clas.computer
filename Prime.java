package trainig.smarksavg;

public class Prime {
    
    public static void main(String[] args) {
        Prime p = new Prime();
        if(p.isPrime(2)) {
            System.err.println("2 is prime");
        } else {
            System.err.println("2 is prime");
        }
        
        if(p.isPrime(5)) {
            System.err.println("5 is prime");
        } else {
            System.err.println("5 is not prim");
        }
        
        if(p.isPrime(13)) {
            System.err.println("13 is prime");
        } else {
            System.err.println("13 is not prime");
        }
        
        if(p.isPrime(25)) {
            System.err.println("25 is prime");
        } else {
            System.err.println("25 is not prime");
        }
        
        if(p.isPrime(58964487)) {
            System.err.println("58964487 is prime");
        } else {
            System.err.println("58964487 is not prime");
        }
    }
    
    private boolean isPrime(int num) {
        
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num; ++i) {
            if (num % i == 0) {
                System.err.println(" " + num + "is dividable by " + i);
                return false;
            }
        }
        
        return true;
    }
}
