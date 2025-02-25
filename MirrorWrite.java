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
        System.err.println(" ==> " + m.mirror(m.number(100000)) 
                + "    a : " + (System.currentTimeMillis() - l1) + "ms");
        System.err.println(" ==> " + m.mirror("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirror("a"));
        System.err.println(" ==> " + m.mirror("b"));
        System.err.println(" ==> " + m.mirror("c"));
        System.err.println(" ==> " + m.mirror("d"));
        System.err.println(" ==> " + m.mirror("e"));
        System.err.println(" ==> " + m.mirror("f"));
        System.err.println(" ==> " + m.mirror("g"));
        System.err.println(" ==> " + m.mirror("h"));
        System.err.println(" ==> " + m.mirror("i"));
        System.err.println(" ==> " + m.mirror("j"));
        System.err.println(" ==> " + m.mirror("k"));
        System.err.println(" ==> " + m.mirror("l"));
        System.err.println(" ==> " + m.mirror("m"));
        System.err.println(" ==> " + m.mirror("n"));
        System.err.println(" ==> " + m.mirror("o"));
        System.err.println(" ==> " + m.mirror("p"));
        System.err.println(" ==> " + m.mirror("q"));
        System.err.println(" ==> " + m.mirror("r"));
        System.err.println(" ==> " + m.mirror("s"));
        System.err.println(" ==> " + m.mirror("t"));
        System.err.println(" ==> " + m.mirror("u"));
        System.err.println(" ==> " + m.mirror("v"));
        System.err.println(" ==> " + m.mirror("w"));
        System.err.println(" ==> " + m.mirror("x"));
        System.err.println(" ==> " + m.mirror("y"));
        System.err.println(" ==> " + m.mirror("z"));
        System.err.println(" ==> " + m.mirror(""));
        System.err.println(" ==> " + m.mirror(null));
        long l2 = System.currentTimeMillis();
        System.err.println(" ==> " + m.mirrorStringBuilder(m.number(100000)) 
                + "    a : " + (System.currentTimeMillis() - l2) + "ms");
        System.err.println(" ==> " + m.mirrorStringBuilder("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirrorStringBuilder("a"));
        System.err.println(" ==> " + m.mirrorStringBuilder("b"));
        System.err.println(" ==> " + m.mirrorStringBuilder("c"));
        System.err.println(" ==> " + m.mirrorStringBuilder("d"));
        System.err.println(" ==> " + m.mirrorStringBuilder("e"));
        System.err.println(" ==> " + m.mirrorStringBuilder("f"));
        System.err.println(" ==> " + m.mirrorStringBuilder("g"));
        System.err.println(" ==> " + m.mirrorStringBuilder("h"));
        System.err.println(" ==> " + m.mirrorStringBuilder("i"));
        System.err.println(" ==> " + m.mirrorStringBuilder("j"));
        System.err.println(" ==> " + m.mirrorStringBuilder("k"));
        System.err.println(" ==> " + m.mirrorStringBuilder("l"));
        System.err.println(" ==> " + m.mirrorStringBuilder("m"));
        System.err.println(" ==> " + m.mirrorStringBuilder("n"));
        System.err.println(" ==> " + m.mirrorStringBuilder("o"));
        System.err.println(" ==> " + m.mirrorStringBuilder("p"));
        System.err.println(" ==> " + m.mirrorStringBuilder("w"));
        System.err.println(" ==> " + m.mirrorStringBuilder("x"));
        System.err.println(" ==> " + m.mirrorStringBuilder("y"));
        System.err.println(" ==> " + m.mirrorStringBuilder("t"));
        System.err.println(" ==> " + m.mirrorStringBuilder("r"));
        System.err.println(" ==> " + m.mirrorStringBuilder("s"));
        System.err.println(" ==> " + m.mirrorStringBuilder("q"));
        System.err.println(" ==> " + m.mirrorStringBuilder("z"));
        System.err.println(" ==> " + m.mirrorStringBuilder("v"));
        System.err.println(" ==> " + m.mirrorStringBuilder(""));
        System.err.println(" ==> " + m.mirrorStringBuilder(null));
        long l3 = System.currentTimeMillis();
        System.err.println(" ==> " + m.mirrorArray(m.number(100000)) 
                + "    a : " + (System.currentTimeMillis() - l3) + "ms");
        System.err.println(" ==> " + m.mirrorArray("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirrorArray("a"));
        System.err.println(" ==> " + m.mirrorArray("b"));
        System.err.println(" ==> " + m.mirrorArray("c"));
        System.err.println(" ==> " + m.mirrorArray("e"));
        System.err.println(" ==> " + m.mirrorArray("d"));
        System.err.println(" ==> " + m.mirrorArray("f"));
        System.err.println(" ==> " + m.mirrorArray("g"));
        System.err.println(" ==> " + m.mirrorArray("h"));
        System.err.println(" ==> " + m.mirrorArray("i"));
        System.err.println(" ==> " + m.mirrorArray("j"));
        System.err.println(" ==> " + m.mirrorArray("k"));
        System.err.println(" ==> " + m.mirrorArray("l"));
        System.err.println(" ==> " + m.mirrorArray("m"));
        System.err.println(" ==> " + m.mirrorArray("n"));
        System.err.println(" ==> " + m.mirrorArray("o"));
        System.err.println(" ==> " + m.mirrorArray("p"));
        System.err.println(" ==> " + m.mirrorArray(""));
        System.err.println(" ==> " + m.mirrorArray(null));
    }
}