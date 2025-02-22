package trainig.string;

public class MirrorWrite {
    
    public String mirror(String x) {
        String z = "";
        if (x == null || x.isBlank()) {
            z = x;
            
        } else {
            int a = x.length();
            while (a > 0) {
                a = a - 1;
                z = z + x.charAt(a);
            }
        }
        return z;
    }
    
    private String mirrorArray(String x) {
        String z = "";
        if (x == null || x.isBlank()) {
            z = x;
            
        } else {
            int a = x.length();
            char[] l = new char[a];
            String y = new String(l);
            for (int b = l.length; b > 0; b--) {
                char[] m = y.toCharArray();
                z = new String(m);
            }
        }
        return z;
    }
    
    public String mirrorStringBuilder(String x) {
        String y;
        StringBuilder z = new StringBuilder();
        if (x == null || x.isBlank()) {
            y = x;
            
        } else {
            int a = x.length();
            while (a > 0) {
                a = a - 1;
                z.append(x.charAt(a));
            }
            y = z.toString();
        }
        return y;
    }
    
    public static void main(String[] args) {
        MirrorWrite m = new MirrorWrite();
        System.err.println(" ==> " + m.mirror("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirror("a"));
        System.err.println(" ==> " + m.mirror(""));
        System.err.println(" ==> " + m.mirror(null));
        System.err.println(" ==> " + m.mirrorStringBuilder("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirrorStringBuilder("a"));
        System.err.println(" ==> " + m.mirrorStringBuilder(""));
        System.err.println(" ==> " + m.mirrorStringBuilder(null));
        System.err.println(" ==> " + m.mirrorArray("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirrorArray("a"));
        System.err.println(" ==> " + m.mirrorArray(""));
        System.err.println(" ==> " + m.mirrorArray(null));
    }
}