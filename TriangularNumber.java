package trainig.summation;

public class TriangularNumber {
    
    /**
     * socnn : Sum of consecutive natural numbers 
     * @param a
     * @param b
     * @return Sum Of Smallest Number And greatest Number
     */
    public int socnn(int a, int b) {
        int socnn;
        if (a < b) {
            socnn = ((a + b) * ((b - a) + 1)) / 2;
            
        } else {
            socnn = ((b + a) * ((a - b) + 1)) / 2;
        }  
        return socnn;
    }
    
    /**
     * socnni : Sum of consecutive natural numbers iteration
     * @param a
     * @param b
     * @return Sum Of Smallest Number And greatest Number Withe Iteration
     */
    private int socnni(int a, int b) {
        int socnni = 0;
        if (a < b) {
            while (a <= b) {
                socnni = socnni + a++;
            }
            
        } else {
            while (b <= a) {
                socnni = socnni + b++;
            }
        }
        return socnni;
    }
    
    public int sumDigit1(int a) {
        int c = 0;
        StringBuilder z = new StringBuilder();
        z.append(a);
        for (int b = z.length(); b > 0; b--) {
            c = c + Integer.parseInt("" + z.charAt(b - 1));
        }
        return c;
    }
    
    public int sumDigit2(int a) {
        int d = 0;
        StringBuilder z = new StringBuilder();
        z.append(a);
        for (int b = z.length(); b > 0; b--) {
            d += (z.charAt(b - 1) - 48);
        }
        return d;
    }
    
    public int sumDigit3(int a) {
        int c = 0;
        while (a > 0) {
            int b = a % 10;
            c += b;
            a = a / 10;
        }
        return c;
    }
    
    /**
     * cc : conjectureCollatz
     * @param n
     * @return 1 : test true || another int test falls
     */
    
    public int cc(int n) {
        if (n > 1) {
            while (n > 1) {
                int a = n / 2;
                int b = a * 2;
                if (n == b) {
                    n = n / 2;
                } else {
                    n = n * 3 + 1;
                }
            }
        } else {
            n = 0;
        }
        return n;
    }
    
    public static void main(String[] args) {
        TriangularNumber a = new TriangularNumber();
        System.err.println(" ==> socnn  a " + " is a : " + a.socnn(1, 10));
        System.err.println(" ==> socnni  a " + " is a : " + a.socnni(1, 10));
        System.err.println("");
        System.err.println(" ==> socnn  b " + " is a : " + a.socnn(10, 1));
        System.err.println(" ==> socnni  b " + " is a : " + a.socnni(10, 1));
        System.err.println("");
        System.err.println(" ==> socnn  c "  + " is a : " + a.socnn(0, 10));
        System.err.println(" ==> socnni  c "  + " is a : " + a.socnni(0, 10));
        System.err.println("");
        System.err.println(" ==> socnn  d " + " is a : " + a.socnn(10, 0));
        System.err.println(" ==> socnni  d " + " is a : " + a.socnni(10, 0));
        System.err.println("");
        System.err.println(" ==> socnn  e " + " is a : " + a.socnn(-1, 10));
        System.err.println(" ==> socnni  e " + " is a : " + a.socnni(-1, 10));
        System.err.println("");
        System.err.println(" ==> socnn  f " + " is a : " + a.socnn(10, -1));
        System.err.println(" ==> socnni  f " + " is a : " + a.socnni(10, -1));
        System.err.println("");
        System.err.println(" ==> socnn  g " + " is a : " + a.socnn(0, 0));
        System.err.println(" ==> socnni  g " + " is a : " + a.socnni(0, 0));
        System.err.println("");
        System.err.println(" ==> socnn  h " + " is a : " + a.socnn(10, 10));
        System.err.println(" ==> socnni  h " + " is a : " + a.socnni(10, 10));
        System.err.println("");
        System.err.println(" ==> socnn  i " + " is a : " + a.socnn(-1, -10));
        System.err.println(" ==> socnni  i " + " is a : " + a.socnni(-1, -10));
        System.err.println("");
        System.err.println(" ==> socnn  j " + " is a : " + a.socnn(-10, -1));
        System.err.println(" ==> socnni  j " + " is a : " + a.socnni(-10, -1));
        System.err.println("");
        System.err.println(" ==> socnn  k " + " is a : " + a.socnn(-10, -10));
        System.err.println(" ==> socnni  k " + " is a : " + a.socnni(-10, -10));
        System.err.println("");
        System.err.println(" ==> socnn  l " + " is a : " + a.socnn(0, -10));
        System.err.println(" ==> socnni  l " + " is a : " + a.socnni(0, -10));
        System.err.println("");
        System.err.println(" ==> socnn  m " + " is a : " + a.socnn(-10, 0));
        System.err.println(" ==> socnni  m " + " is a : " + a.socnni(-10, 0));
        System.err.println("_________________________________________________");
        System.err.println(" ==> sumNumber a" + " is a : " + a.sumDigit1(123456789));
        System.err.println(" ==> sumNumber a" + " is a : " + a.sumDigit2(123456789));
        System.err.println(" ==> sumNumber a" + " is a : " + a.sumDigit3(123456789));
        System.err.println("_________________________________________________________");
        System.err.println(" ==> cc a " + " is a : " + a.cc(-1));
        System.err.println(" ==> cc b " + " is a : " + a.cc(0));
        System.err.println(" ==> cc c " + " is a : " + a.cc(1));
        System.err.println(" ==> cc d " + " is a : " + a.cc(2));
        System.err.println(" ==> cc e " + " is a : " + a.cc(3));
        System.err.println(" ==> cc f " + " is a : " + a.cc(4));
        System.err.println(" ==> cc g " + " is a : " + a.cc(5));
        System.err.println(" ==> cc h " + " is a : " + a.cc(6));
        System.err.println(" ==> cc i " + " is a : " + a.cc(7));
        System.err.println(" ==> cc j " + " is a : " + a.cc(8));
        System.err.println(" ==> cc k " + " is a : " + a.cc(9));
        System.err.println(" ==> cc l " + " is a : " + a.cc(10));
        System.err.println(" ==> cc m " + " is a : " + a.cc(11));
        System.err.println(" ==> cc n " + " is a : " + a.cc(12));
        System.err.println(" ==> cc o " + " is a : " + a.cc(13));
        System.err.println(" ==> cc p " + " is a : " + a.cc(14));
        System.err.println(" ==> cc q " + " is a : " + a.cc(15));
        System.err.println(" ==> cc r " + " is a : " + a.cc(16));
        System.err.println(" ==> cc s " + " is a : " + a.cc(17));
        System.err.println(" ==> cc t " + " is a : " + a.cc(18));
        System.err.println(" ==> cc u " + " is a : " + a.cc(19));
        System.err.println(" ==> cc v " + " is a : " + a.cc(20));
        System.err.println(" ==> cc w " + " is a : " + a.cc(21));
        System.err.println(" ==> cc x " + " is a : " + a.cc(22));
        System.err.println(" ==> cc y " + " is a : " + a.cc(23));
        System.err.println(" ==> cc z " + " is a : " + a.cc(24));
    }
    
}
