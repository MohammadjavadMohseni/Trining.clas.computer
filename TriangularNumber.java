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
    }
    
}
