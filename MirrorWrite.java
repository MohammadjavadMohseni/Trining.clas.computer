package trainig.string;

import java.lang.reflect.Array;
import java.util.Arrays;

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
    
    private String mirrorArray(String x) {
        String z = "";
        int b = z.length();
        int arr[] = null;
        int n;
        if (x == null) {
            arr = null;
            z = Arrays.toString(arr);
                    
        } else if (x.isEmpty()) {
            n = arr[0];
            z = z + b;
            
        } else {
            int a = x.length();
            while (a > 0) {
                a = a - 1;
                n = arr[a];
                z = z + x.charAt(n);
            }
        }
        return z;
    }
    
    public String mirrorStringBuilder(String x) {
        String y = "";
        StringBuilder z;
        if (x == null) {
            z = null;
            y = null;
        } else if (x.isBlank()) {
            
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