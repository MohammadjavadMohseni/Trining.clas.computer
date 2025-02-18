package trainig.string;

public class MirrorWrite {
    
    public String mirror(String x) {
        String z = "";
        if (x == null) {
            z = null;
            
        } else if (x.isBlank()) {
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
        if (x == null) {
            z = null;
                    
        } else if (x.isBlank()) {
            z = x;
            
        } else {
            int a = x.length();
            while (a > 0) {
                a = a - 1;
                char last = x.charAt(a);
                char[] mirrora = x.toCharArray(last);
                z = new String(mirrora);
            }
        }
        return z;
    }
    
    public String mirrorStringBuilder(String x) {
        String y = "";
        StringBuilder z;
        if (x == null || x.isBlank()) {
            y = x;
        } else if (x.isBlank()) {
            y = x;
            
        } else {
            int a = x.length();
            while (a > 0) {
                a = a - 1;
            }
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