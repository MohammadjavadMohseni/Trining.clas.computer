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
    
    public StringBuilder nameNumber(int n) {
        StringBuilder z = new StringBuilder();
        StringBuilder y = new StringBuilder();
        z.append(n);
        int a = z.length();
        
        while (a > 0) {
            double b = Math.pow(10, a - 1);
            int c = (int) (n / b);
            
            if (n == 0) {
                y.append("صفر");
            
        } else if (n > 0) {
            
            if (a % 3 == 0) {
                int d = c % 10;
                switch (d) {
                    
                    case 0:y.append("");
                    break;
                    case 1:y.append("صد ");
                    break;
                    case 2:y.append("دویست ");
                    break;
                    case 3:y.append("سیصد ");
                    break;
                    case 4:y.append("چهارصد ");
                    break;
                    case 5:y.append("پانصد ");
                    break;
                    case 6:y.append("شیشصد ");
                    break;
                    case 7:y.append("هفتصد ");
                    break;
                    case 8:y.append("هشتصد ");
                    break;
                    case 9:y.append("نهصد ");
                    break;
                }
                
            } else if ((a - 2) == 3 * ((a - 2) / 3)) {
                int d = c % 10;
                switch (d) {
                    
                    case 0:y.append("");
                    break;
                    case 1:y.append("ده ");
                    break;
                    case 2:y.append("بیست ");
                    break;
                    case 3:y.append("سی ");
                    break;
                    case 4:y.append("چهل ");
                    break;
                    case 5:y.append("پنجاه ");
                    break;
                    case 6:y.append("شصت ");
                    break;
                    case 7:y.append("هفتاد ");
                    break;
                    case 8:y.append("هشتاد ");
                    break;
                    case 9:y.append("نود ");
                    break;
                }
                
            } else {
                int d = c % 10;
                switch (d) {
                    
                    case 0:y.append("");
                    break;
                    case 1:y.append("یک ");
                    break;
                    case 2:y.append("دو ");
                    break;
                    case 3:y.append("سه ");
                    break;
                    case 4:y.append("چهار ");
                    break;
                    case 5:y.append("پنج ");
                    break;
                    case 6:y.append("شیش ");
                    break;
                    case 7:y.append("هفت ");
                    break;
                    case 8:y.append("هشت ");
                    break;
                    case 9:y.append("نه ");
                    break;
                }
                
                if (d >= 0) {
                    
                    switch (a) {
                    
                    case 4:y.append("هزار ");
                    break;
                    case 7:y.append("میلیون ");
                    break;
                    case 10:y.append("میلیارد ");
                    break;
                    default:y.append("");
                }

                }
            }
            
        } else {
            
            y.append("منفی ");
            n = -1 * n;
        }
            
            a--;
        }
            
        return y;
    }
    
    public static void main(String[] args) {
        MirrorWrite m = new MirrorWrite();
        long l1 = System.currentTimeMillis();
        m.testMirror("xsdfefrrbfv", 100);
        System.err.println(" a : " + (System.currentTimeMillis() - l1) + "ms");
        System.err.println("_______________");
        m.mirror(m.number(10));
        System.err.println(" a : " + (System.currentTimeMillis() - l1) + "ms");
        System.err.println("_______________");
        System.err.println(" ==> " + m.mirror("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirror("a"));
        System.err.println(" ==> " + m.mirror(""));
        System.err.println(" ==> " + m.mirror(null));
        long l2 = System.currentTimeMillis();
        m.testMirrorStringBuilder("xsdfefrrbfv", 100);
        System.err.println(" a : " + (System.currentTimeMillis() - l2) + "ms");
        System.err.println("_______________");
        m.mirrorStringBuilder(m.number(10));
        System.err.println(" a : " + (System.currentTimeMillis() - l2) + "ms");
        System.err.println("________________");
        System.err.println(" ==> " + m.mirrorStringBuilder("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirrorStringBuilder("a"));
        System.err.println(" ==> " + m.mirrorStringBuilder(""));
        System.err.println(" ==> " + m.mirrorStringBuilder(null));
        long l3 = System.currentTimeMillis();
        m.testMirrorArray("xsdfefrrbfv", 100);
        System.err.println(" a : " + (System.currentTimeMillis() - l3) + "ms");
        System.err.println("____________");
        m.mirrorArray(m.number(10));
        System.err.println(" a : " + (System.currentTimeMillis() - l3) + "ms");
        System.err.println("______________");
        System.err.println(" ==> " + m.mirrorArray("xsdfefrrbfv"));
        System.err.println(" ==> " + m.mirrorArray("a"));
        System.err.println(" ==> " + m.mirrorArray(""));
        System.err.println(" ==> " + m.mirrorArray(null));
        System.err.println("_____________________________");
        System.err.println(" ==> " + m.nameNumber(123456789));
        System.err.println(" ==> " + m.nameNumber(100000000));
        System.err.println(" ==> " + m.nameNumber(100000));
        System.err.println(" ==> " + m.nameNumber(1000000000));
        System.err.println(" ==> " + m.nameNumber(0));
        System.err.println(" ==> " + m.nameNumber(-123456789));
    }
}