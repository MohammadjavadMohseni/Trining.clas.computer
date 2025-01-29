package trainig.string;

public class MirrorWrite {
    
    public String mirror(String x) {
        int a = x.length();
        String z = ".";
            while (a >= 0) {
                char b = x.charAt(--a);
                String c = x.formatted(this, b);
                int y = c.lastIndexOf(c);
                char d = c.charAt(y + a);
                String s = c.formatted(this, d);
                return z.concat(s);
            }
        String mirror = "..";
        return mirror.concat(z);
    }
    
    public static void main(String[] args) {
        MirrorWrite m = new MirrorWrite();
        System.err.println(" ==> " + m.mirror("xsdfefrrbfv"));
    }
}