package trainig.string;

public class MirrorWrite {
    
    public String mirror(String x) {
        String z = "";
        if (x == null) {
            z = null;
            
        } else if (x.isBlank()) {
            z = "";
            
        } else {
            int a = x.length();
            while (a > 0) {
                a = a - 1;
                z = z + x.charAt(a);
            }
        }
        return z;
    }
    
    public static void main(String[] args) {
        MirrorWrite m = new MirrorWrite();
        System.err.println(" ==> " + m.mirror("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirror("a"));
        System.err.println(" ==> " + m.mirror(""));
        System.err.println(" ==> " + m.mirror(null));
    }
}