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
    
    public void testMirror(String x, int a) {
        while (a > 0) {
            a = a - 1;
            mirror(x);
        }
    }
    
    public String mirrorArray(String x) {
        String z;
        if (x == null || x.isBlank()) {
            z = x;
            
        } else {
            char[] l = new char[x.length()];
            for (int b = l.length; b > 0; b--) {
                l[x.length() - b] = x.charAt(b - 1);
            }
            z = new String(l);
        }
        return z;
    }
    
    public void testMirrorArray(String x, int a) {
        while (a > 0) {
            a = a - 1;
            mirrorArray(x);
        }
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
    
    public void testMirrorStringBuilder(String x, int a) {
        while (a > 0) {
            a = a - 1;
            mirrorStringBuilder(x);
        }
    }
    
    public String number(int d) {
        String t;
        StringBuilder o = new StringBuilder();
        d = d + 1;
        while (d > 1) {
            d = d - 1;
            o.append(d);
        }
        t = o.toString();
        return t;
    }
    
    
    public static void main(String[] args) {
        MirrorWrite s = new MirrorWrite();
        long l1 = System.currentTimeMillis();
        s.testMirror("xsdfefrrbfv", 100);
        System.err.println(" a : " + (System.currentTimeMillis() - l1) + "ms");
        System.err.println("_______________");
        s.mirror(s.number(10));
        System.err.println(" a : " + (System.currentTimeMillis() - l1) + "ms");
        System.err.println("_______________");
        System.err.println(" ==> " + s.mirror("xsdfefrrbfv"));
        System.err.println(" ==> " + s.mirror("a"));
        System.err.println(" ==> " + s.mirror(""));
        System.err.println(" ==> " + s.mirror(null));
        long l2 = System.currentTimeMillis();
        s.testMirrorStringBuilder("xsdfefrrbfv", 100);
        System.err.println(" a : " + (System.currentTimeMillis() - l2) + "ms");
        System.err.println("_______________");
        s.mirrorStringBuilder(s.number(10));
        System.err.println(" a : " + (System.currentTimeMillis() - l2) + "ms");
        System.err.println("________________");
        System.err.println(" ==> " + s.mirrorStringBuilder("xsdfefrrbfv"));
        System.err.println(" ==> " + s.mirrorStringBuilder("a"));
        System.err.println(" ==> " + s.mirrorStringBuilder(""));
        System.err.println(" ==> " + s.mirrorStringBuilder(null));
        long l3 = System.currentTimeMillis();
        s.testMirrorArray("xsdfefrrbfv", 100);
        System.err.println(" a : " + (System.currentTimeMillis() - l3) + "ms");
        System.err.println("____________");
        s.mirrorArray(s.number(10));
        System.err.println(" a : " + (System.currentTimeMillis() - l3) + "ms");
        System.err.println("______________");
        System.err.println(" ==> " + s.mirrorArray("xsdfefrrbfv"));
        System.err.println(" ==> " + s.mirrorArray("a"));
        System.err.println(" ==> " + s.mirrorArray(""));
        System.err.println(" ==> " + s.mirrorArray(null));
        System.err.println("_____________________________");
    }   
}