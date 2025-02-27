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
    
    public String testMirror(String x, int a) {
        StringBuilder z = new StringBuilder();
        while (a > 0) {
            a = a - 1;
            z.append(mirror(x));
        }
        return z.toString();
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
    
    public String testMirrorArray(String x, int a) {
        StringBuilder z = new StringBuilder();
        while (a > 0) {
            a = a - 1;
            z.append(mirrorArray(x));
        }
        return z.toString();
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
    
    public String testMirrorStringBuilder(String x, int a) {
        StringBuilder z = new StringBuilder();
        while (a > 0) {
            a = a - 1;
            z.append(mirrorStringBuilder(x));
        }
        return z.toString();
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
        MirrorWrite m = new MirrorWrite();
        long l1 = System.currentTimeMillis();
        System.err.println(" ==> " + m.testMirror("xsdfefrrbfv", 100) 
                + System.lineSeparator() + " a : " + (System.currentTimeMillis() - l1) + "ms");
        System.err.println("_______________");
        System.err.println(" ==> " + m.mirror(m.number(10)) 
                + System.lineSeparator() + "    a : " + (System.currentTimeMillis() - l1) + "ms");
        System.err.println("_______________");
        System.err.println(" ==> " + m.mirror("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirror("a"));
        System.err.println(" ==> " + m.mirror(""));
        System.err.println(" ==> " + m.mirror(null));
        long l2 = System.currentTimeMillis();
        System.err.println(" ==> " + m.testMirrorStringBuilder("xsdfefrrbfv", 100) 
                + System.lineSeparator() + "    a : " + (System.currentTimeMillis() - l2) + "ms");
        System.err.println("_______________");
        System.err.println(" ==> " + m.mirrorStringBuilder(m.number(10)) 
                + System.lineSeparator() + "    a : " + (System.currentTimeMillis() - l2) + "ms");
        System.err.println("________________");
        System.err.println(" ==> " + m.mirrorStringBuilder("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirrorStringBuilder("a"));
        System.err.println(" ==> " + m.mirrorStringBuilder(""));
        System.err.println(" ==> " + m.mirrorStringBuilder(null));
        long l3 = System.currentTimeMillis();
        System.err.println(" ==> " + m.testMirrorArray("xsdfefrrbfv", 100) 
                + System.lineSeparator() + "    a : " + (System.currentTimeMillis() - l3) + "ms");
        System.err.println("____________");
        System.err.println(" ==> " + m.mirrorArray(m.number(10)) 
                + System.lineSeparator() + "    a : " + (System.currentTimeMillis() - l3) + "ms");
        System.err.println("______________");
        System.err.println(" ==> " + m.mirrorArray("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirrorArray("a"));
        System.err.println(" ==> " + m.mirrorArray(""));
        System.err.println(" ==> " + m.mirrorArray(null));
    }
}