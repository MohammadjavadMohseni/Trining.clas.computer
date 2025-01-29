package trainig.string;

public class MirrorWrite {
    
    public String mirror(String x) {
        int a = x.length();
        String z = "";
        if (x == null) {
            z = null;
            
        } else if (x == "") {
            z = "";
            
        } else {
            while (a > 0) {
                z = z + x.charAt(a = a - 1);
            }
        }
        return z;
    }
    
    public static void main(String[] args) {
        MirrorWrite m = new MirrorWrite();
        MirrorWrite o = new MirrorWrite();
        MirrorWrite i = new MirrorWrite();
        MirrorWrite r = new MirrorWrite();
        System.err.println(" ==> " + m.mirror("xsdfefrrbfv"));
        System.err.println(" ==> " + o.mirror("a"));
        System.err.println(" ==> " + i.mirror(""));
        System.err.println(" ==> " + r.mirror(null));
    }
}