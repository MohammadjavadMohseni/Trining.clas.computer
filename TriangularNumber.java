package trainig.summation;

public class TriangularNumber {
    public Andis a1;
    public Andis a2;

    public TriangularNumber() {
        
    }
    
    public Andis getA1() {
        return a1;
    }
    
    public void setA1(Andis a1) {
        this.a1 = a1;
    }
    
    public Andis getA2() {
        return a2;
    }
    
    public void setA2(Andis a2) {
        this.a2 = a2;
    }
    
    int a = a1.getN();
    int b = a2.getN();
    
    /**
     * socnn = Sum of consecutive natural numbers
     * int c =  consecutive integers
     * a = smallest integer
     * a = a1 > 0
     * b = greatest integer
     * b = a2 > a1
     * @return 
     */
    public double socnn() {
        int sconn;
        if (a > 0 && b > a || b > 0 && a > b) {
            int c = (b - a) + 1;
        sconn = ((a + b) * c) / 2;
        
        } else {
            if (a <= 0 && b > 0) {
                int n = a - a;
                int c = (b - n) + 1;
                sconn = ((n + b) * c) / 2;
                
            } else if (b <= 0 && a > 0) {
                int n = b - b;
                int c = (a - n) + 1;
                sconn = ((a + n) * c) / 2;
                
            } else {
                sconn = 0;
            }
        }
        return sconn;
    }
    
    /**
     * socnni = Sum of consecutive natural numbers iteration
     * a = smallest integer
     * a = a1 > 0
     * b = greatest integer
     * b = a2 > a1
     * @return 
     */
    private int socnni() {
        int socnni = 0;
        
        if (a > 0 && b > a) {
            while (a > b) {
                socnni = a = a + a++;
            }
            
        } else if (b > 0 && a > b) {
            while (b > a) {
                socnni = b = b + b++;
            }
            
        } else {
            if (a <= 0 && b > 0) {
                int n = a - a;
                while (n > b) {
                    socnni = n = n + n++;
                }
                
            } else if (b <= 0 && a > 0) {
                int n = b - b;
                while (n > a) {
                    socnni = n = n + n++;
                }
                
            } else {
                socnni = 0;
            }
        }
        return socnni;
    }
    
    public static void main(String[] args) {
        TriangularNumber a = new TriangularNumber();
        a.setA1(new Andis(1));
        a.setA2(new Andis(10));
        System.err.println(" ==> socnn  a " + a.getClass() + " is a : " + a.socnn());
        System.err.println(" ==> socnni  a " + a.getClass() + " is a : " + a.socnn());
        
        TriangularNumber b = new TriangularNumber();
        b.setA1(new Andis(10));
        b.setA2(new Andis(1));
        System.err.println(" ==> socnn  b " + b.getClass() + " is a : " + b.socnn());
        System.err.println(" ==> socnni  b " + b.getClass() + " is a : " + b.socnn());
        
        TriangularNumber c = new TriangularNumber();
        c.setA1(new Andis(0));
        c.setA2(new Andis(10));
        System.err.println(" ==> socnn  c " + c.getClass() + " is a : " + c.socnn());
        System.err.println(" ==> socnni  c " + c.getClass() + " is a : " + c.socnn());
        
        TriangularNumber d = new TriangularNumber();
        d.setA1(new Andis(10));
        d.setA2(new Andis(0));
        System.err.println(" ==> socnn  d " + d.getClass() + " is a : " + d.socnn());
        System.err.println(" ==> socnni  d " + d.getClass() + " is a : " + d.socnn());
        
        TriangularNumber e = new TriangularNumber();
        e.setA1(new Andis(-1));
        e.setA2(new Andis(10));
        System.err.println(" ==> socnn  e " + e.getClass() + " is a : " + e.socnn());
        System.err.println(" ==> socnni  e " + e.getClass() + " is a : " + e.socnn());
        
        TriangularNumber f = new TriangularNumber();
        f.setA1(new Andis(10));
        f.setA2(new Andis(-1));
        System.err.println(" ==> socnn  f " + f.getClass() + " is a : " + f.socnn());
        System.err.println(" ==> socnni  f " + f.getClass() + " is a : " + f.socnn());
        
        TriangularNumber g = new TriangularNumber();
        g.setA1(new Andis(1));
        g.setA2(new Andis(10));
        System.err.println(" ==> socnn  g " + g.getClass() + " is a : " + g.socnn());
        System.err.println(" ==> socnni  g " + g.getClass() + " is a : " + g.socnn());
        
        TriangularNumber h = new TriangularNumber();
        h.setA1(new Andis(0));
        h.setA2(new Andis(0));
        System.err.println(" ==> socnn  h " + h.getClass() + " is a : " + h.socnn());
        System.err.println(" ==> socnni  h " + h.getClass() + " is a : " + h.socnn());
        
        TriangularNumber i = new TriangularNumber();
        i.setA1(new Andis(10));
        i.setA2(new Andis(10));
        System.err.println(" ==> socnn  i " + i.getClass() + " is a : " + i.socnn());
        System.err.println(" ==> socnni  i " + i.getClass() + " is a : " + i.socnn());
        
        TriangularNumber j = new TriangularNumber();
        j.setA1(new Andis(-1));
        j.setA2(new Andis(-10));
        System.err.println(" ==> socnn  j " + j.getClass() + " is a : " + j.socnn());
        System.err.println(" ==> socnni  j " + j.getClass() + " is a : " + j.socnn());
        
        TriangularNumber k = new TriangularNumber();
        k.setA1(new Andis(-10));
        k.setA2(new Andis(-10));
        System.err.println(" ==> socnn  k " + k.getClass() + " is a : " + k.socnn());
        System.err.println(" ==> socnni  k " + k.getClass() + " is a : " + k.socnn());
    }
    
}
