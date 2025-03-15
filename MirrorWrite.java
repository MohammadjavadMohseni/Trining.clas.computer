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
    
    public StringBuilder number1(long n) {
        StringBuilder z = new StringBuilder();
        long a =  9_998_988_800L;
        while (a <= n) {
            z.append(nameNumber(a)).append(" <== ");
            z.append(System.lineSeparator());
            a++;
        }
        return z;
    }
    
    public StringBuilder nameNumber(long n) {
        StringBuilder z = new StringBuilder();
        StringBuilder y = new StringBuilder();
        z.append(n);
        int a = z.length();
        int g = a - 1;
        
        if (n < 0) {
            y.append("منفی ");
            n = -n;
            a = a - 1;
            g = g - 1;
        }
        if (n == 0) {
            y.append("صفر ");
        }
            
        while (a > 0) {
            double b = Math.pow(10, a - 1);
            int c =  (int) (n / b);
            int d = c % 10;
            int f = c % 100;
            int e = c % 1000;
            if (g >= a) {
                if (d != 0) {
                y.append("و ");
            }
            }
            
            if (a % 3 == 0) {
                switch (d) {
                    
                    case 0 -> y.append("");
                    case 1 -> y.append("صد ");
                    case 2 -> y.append("دویست ");
                    case 3 -> y.append("سیصد ");
                    case 4 -> y.append("چهارصد ");
                    case 5 -> y.append("پانصد ");
                    case 6 -> y.append("شیشصد ");
                    case 7 -> y.append("هفتصد ");
                    case 8 -> y.append("هشتصد ");
                    case 9 -> y.append("نهصد ");
                }
                
            } else if ((a - 2) == 3 * ((a - 2) / 3)) {
                switch (d) {
                    
                    case 0 -> y.append("");
                    case 1 -> {
                        b = b / 10;
                        c = (int) (n / b);
                        f = c % 100;
                        switch (f) {
                            case 10 -> y.append("ده ");
                            case 11 -> y.append("یازده ");
                            case 12 -> y.append("دوازده ");
                            case 13 -> y.append("سیزده ");
                            case 14 -> y.append("چهارده ");
                            case 15 -> y.append("پانزده ");
                            case 16 -> y.append("شانزده ");
                            case 17 -> y.append("هفده ");
                            case 18 -> y.append("هجده ");
                            case 19 -> y.append("نوزده ");
                        }
                        a = a - 1;
                    }
                    case 2 -> y.append("بیست ");
                    case 3 -> y.append("سی ");
                    case 4 -> y.append("چهل ");
                    case 5 -> y.append("پنجاه ");
                    case 6 -> y.append("شصت ");
                    case 7 -> y.append("هفتاد ");
                    case 8 -> y.append("هشتاد ");
                    case 9 -> y.append("نود ");
                }
                
            } else {
                    
                switch (d) {
                    
                case 0 -> y.append("");
                case 1 -> y.append("یک ");
                case 2 -> y.append("دو ");
                case 3 -> y.append("سه ");
                case 4 -> y.append("چهار ");
                case 5 -> y.append("پنج ");
                case 6 -> y.append("شیش ");
                case 7 -> y.append("هفت ");
                case 8 -> y.append("هشت ");
                case 9 -> y.append("نه ");
                }
            }
            
            if (e != 0) {
                
                switch (a) {
                    case 4 -> y.append("هزار ");
                    case 7 -> y.append("میلیون ");
                    case 10 -> y.append("میلیارد ");
                    default -> y.append("");
                }
            }
            
            a--;
        }
        
        return y;
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
        System.err.println(" ==> " + s.nameNumber(123_456_789L));
        System.err.println(" ==> " + s.nameNumber(100_000_000L));
        System.err.println(" ==> " + s.nameNumber(100_000L));
        System.err.println(" ==> " + s.nameNumber(100_000_000_000L));
        System.err.println(" ==> " + s.nameNumber(0L));
        System.err.println(" ==> " + s.nameNumber(-123_456_789L));
        System.err.println(" ==> " + s.nameNumber(111_111_111_111_111L));
        System.err.println(" ==> " + s.nameNumber(10023L));
        System.err.println("____________________________________________");
        System.err.println("" + s.number1(10_000_000_000L));
    }   
}