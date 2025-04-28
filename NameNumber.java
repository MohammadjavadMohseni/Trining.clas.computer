package trainig.string;

import java.math.BigInteger;
import java.util.Arrays;

public class NameNumber {

    String and = " و";

    String[] digitNameHundreds = {"", " صد", " دویست", " سیصد", " چهارصد",
        " پانصد", " ششصد", " هفتصد", " هشتصد", " نهصد"};

    String[] digitNameTeens = {" ده", " یازده", " دوازده", " سیزده", " چهارده",
        " پانزده", " شانزده", " هفده", " هجده", " نوزده"};

    String[] digitNameOnes = {"", " یک", " دو", " سه", " چهار", " پنج",
        " شش", " هفت", " هشت", " نه"};
    
    String[] digitNameTens = {"", "", " بیست", " سی", " چهل", " پنجاه", " شصت",
        " هفتاد", " هشتاد", " نود"};

    String[] digitNumberOrder = {"", " هزار", " میلیون", " میلیارد", " بیلیون",
        " بیلیارد", " تریلیون", " تریلیارد", " کوآدریلیون", " کادریلیارد",
        " کوینتیلیون", " کوانتیلیارد", " سکستیلیون", " سکستیلیارد", " سپتیلیون",
        " سپتیلیارد", " اکتیلیون", " اکتیلیارد", " نانیلیون", " نانیلیارد",
        " دسیلیون", " دسیلیارد", " آندسیلیون", " آندسیلیارد", " دودسیلیون",
        " دودسیلیارد", " تریدسیلیون", " تریدسیلیارد", " کوادردسیلیون",
        " کوادردسیلیارد", " کویندسیلیون", " کویندسیلیارد", " سیدسیلیون",
        " سیدسیلیارد"};

    BigInteger d = BigInteger.valueOf(1000);

    public StringBuilder number(BigInteger n) {
        StringBuilder z = new StringBuilder();
        BigInteger a = n.subtract(BigInteger.valueOf(100));
        while (a.compareTo(n) <= 0) {
            z.append(nameNumber(a)).append(" <== ");
            z.append(System.lineSeparator());
            a = a.add(BigInteger.ONE);
        }
        return z;
    }

    private final StringBuilder name_Number(long n) {
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
            long c = (long) (n / b);
            int d = (int) (c % 10);
            int f = (int) (c % 100);
            int e = (int) (c % 1000);
            if (g >= a) {
                if (d != 0) {
                    y.append("و ");
                }
            }

            if (a % 3 == 0) {
                switch (d) {

                    case 0 ->
                        y.append("");
                    case 1 ->
                        y.append("صد ");
                    case 2 ->
                        y.append("دویست ");
                    case 3 ->
                        y.append("سیصد ");
                    case 4 ->
                        y.append("چهارصد ");
                    case 5 ->
                        y.append("پانصد ");
                    case 6 ->
                        y.append("شیشصد ");
                    case 7 ->
                        y.append("هفتصد ");
                    case 8 ->
                        y.append("هشتصد ");
                    case 9 ->
                        y.append("نهصد ");
                }

            } else if ((a - 2) == 3 * ((a - 2) / 3)) {
                switch (d) {

                    case 0 ->
                        y.append("");
                    case 1 -> {
                        b = b / 10;
                        c = (long) (n / b);
                        f = (int) (c % 100);
                        switch (f) {
                            case 10 ->
                                y.append("ده ");
                            case 11 ->
                                y.append("یازده ");
                            case 12 ->
                                y.append("دوازده ");
                            case 13 ->
                                y.append("سیزده ");
                            case 14 ->
                                y.append("چهارده ");
                            case 15 ->
                                y.append("پانزده ");
                            case 16 ->
                                y.append("شانزده ");
                            case 17 ->
                                y.append("هفده ");
                            case 18 ->
                                y.append("هجده ");
                            case 19 ->
                                y.append("نوزده ");
                        }
                        a = a - 1;
                    }
                    case 2 ->
                        y.append("بیست ");
                    case 3 ->
                        y.append("سی ");
                    case 4 ->
                        y.append("چهل ");
                    case 5 ->
                        y.append("پنجاه ");
                    case 6 ->
                        y.append("شصت ");
                    case 7 ->
                        y.append("هفتاد ");
                    case 8 ->
                        y.append("هشتاد ");
                    case 9 ->
                        y.append("نود ");
                }

            } else {

                switch (d) {

                    case 0 ->
                        y.append("");
                    case 1 ->
                        y.append("یک ");
                    case 2 ->
                        y.append("دو ");
                    case 3 ->
                        y.append("سه ");
                    case 4 ->
                        y.append("چهار ");
                    case 5 ->
                        y.append("پنج ");
                    case 6 ->
                        y.append("شیش ");
                    case 7 ->
                        y.append("هفت ");
                    case 8 ->
                        y.append("هشت ");
                    case 9 ->
                        y.append("نه ");
                }
            }

            if (e != 0) {

                switch (a) {
                    case 4 ->
                        y.append("هزار ");
                    case 7 ->
                        y.append("میلیون ");
                    case 10 ->
                        y.append("میلیارد ");
                    case 13 ->
                        y.append(" بیلیون ");
                    case 16 ->
                        y.append(" بیلیارد ");
                    case 19 ->
                        y.append(" تریلیون ");
                    case 22 ->
                        y.append("  تریلیارد");
                    case 25 ->
                        y.append("  کوآدریلیون");
                    case 28 ->
                        y.append(" کادریلیارد ");
                    case 31 ->
                        y.append("  کوینتیلیون");
                    case 34 ->
                        y.append(" کوانتیلیارد ");
                    case 37 ->
                        y.append(" سکستیلیون ");
                    case 40 ->
                        y.append(" سکستیلیارد ");
                    case 43 ->
                        y.append("  سپتیلیون");
                    case 46 ->
                        y.append(" سپتیلیارد ");
                    case 49 ->
                        y.append(" اکتیلیون ");
                    case 52 ->
                        y.append(" اکتیلیارد ");
                    case 55 ->
                        y.append(" نانیلیون ");
                    case 58 ->
                        y.append(" نانیلیارد ");
                    case 61 ->
                        y.append("  دسیلیون");
                    case 64 ->
                        y.append(" دسیلیارد ");
                    case 67 ->
                        y.append(" آندسیلیون ");
                    case 70 ->
                        y.append(" آندسیلیارد ");
                    case 73 ->
                        y.append(" دودسیلیون ");
                    case 76 ->
                        y.append("  دودسیلیارد");
                    case 79 ->
                        y.append(" تریدسیلیون ");
                    case 82 ->
                        y.append("  تریدسیلیارد");
                    case 85 ->
                        y.append("  کوادردسیلیون");
                    case 88 ->
                        y.append("  کوادردسیلیارد");
                    case 91 ->
                        y.append("  کویندسیلیون");
                    case 94 ->
                        y.append("  کویندسیلیارد");
                    case 97 ->
                        y.append("  سیدسیلیون");
                    case 100 ->
                        y.append(" سیدسیلیارد ");

                    default ->
                        y.append("");
                }
            }

            a--;
        }

        return y;
    }

    public StringBuilder digitNumber_nnn(BigInteger n) {
        StringBuilder z = new StringBuilder();
        int d = n.intValue();
        int a = d % 100;
        d = d / 100;

        switch (d) {
            case 0 ->
                z.append("");
            case 1 ->
                z.append(" صد ");
            case 2 ->
                z.append(" دویست ");
            case 3 ->
                z.append(" سیصد ");
            case 4 ->
                z.append(" چهارصد ");
            case 5 ->
                z.append(" پانصد ");
            case 6 ->
                z.append(" شیشصد ");
            case 7 ->
                z.append(" هفتصد ");
            case 8 ->
                z.append(" هشتصد ");
            case 9 ->
                z.append(" نهصد ");
        }

        if (a > 0) {
            z.append(" و");
        }

        return z;
    }

    public StringBuilder digitNumber_nn(BigInteger n) {
        StringBuilder z = new StringBuilder();
        int d = n.intValue();
        int a = d % 10;
        d = d % 100;

        if (d < 20) {

            switch (d) {

                case 10 ->
                    z.append(" ده ");
                case 11 ->
                    z.append(" یازده ");
                case 12 ->
                    z.append(" دوازده ");
                case 13 ->
                    z.append(" سیزده ");
                case 14 ->
                    z.append(" چهارده ");
                case 15 ->
                    z.append(" پانزده ");
                case 16 ->
                    z.append(" شانزده ");
                case 17 ->
                    z.append(" هیفده ");
                case 18 ->
                    z.append(" هیجده ");
                case 19 ->
                    z.append(" نوزده ");
                default ->
                    z.append("");
            }

        } else {
            d = d / 10;

            switch (d) {

                case 2 ->
                    z.append(" بیست ");
                case 3 ->
                    z.append(" سی ");
                case 4 ->
                    z.append(" چهل ");
                case 5 ->
                    z.append(" پنجاه ");
                case 6 ->
                    z.append(" شصت ");
                case 7 ->
                    z.append(" هفتاد ");
                case 8 ->
                    z.append(" هشتاد ");
                case 9 ->
                    z.append(" نود ");
                default ->
                    z.append("");
            }
            if (a > 0) {
                z.append(" و");
            }
        }
        return z;
    }

    public StringBuilder digitNumber_n(BigInteger n) {
        StringBuilder z = new StringBuilder();
        int d = n.intValue();
        d = d % 100;

        if (d < 10 || d > 19) {
            d = d % 10;
            switch (d) {
                case 0 ->
                    z.append("");
                case 1 ->
                    z.append(" یک ");
                case 2 ->
                    z.append(" دو ");
                case 3 ->
                    z.append(" سه ");
                case 4 ->
                    z.append(" چهار ");
                case 5 ->
                    z.append(" پنج ");
                case 6 ->
                    z.append(" شش ");
                case 7 ->
                    z.append(" هفت ");
                case 8 ->
                    z.append(" هشت ");
                case 9 ->
                    z.append(" نه ");
            }
        }
        return z;
    }

    public StringBuilder digitLevel(BigInteger n) {
        StringBuilder y = new StringBuilder();
        int d = n.intValue();

        switch (d) {

            case 3 ->
                y.append("هزار ");
            case 6 ->
                y.append("میلیون ");
            case 9 ->
                y.append("میلیارد ");
            case 12 ->
                y.append(" بیلیون ");
            case 15 ->
                y.append(" بیلیارد ");
            case 18 ->
                y.append(" تریلیون ");
            case 21 ->
                y.append("  تریلیارد");
            case 24 ->
                y.append("  کوآدریلیون");
            case 27 ->
                y.append(" کادریلیارد ");
            case 30 ->
                y.append("  کوینتیلیون");
            case 33 ->
                y.append(" کوانتیلیارد ");
            case 36 ->
                y.append(" سکستیلیون ");
            case 39 ->
                y.append(" سکستیلیارد ");
            case 42 ->
                y.append("  سپتیلیون");
            case 45 ->
                y.append(" سپتیلیارد ");
            case 48 ->
                y.append(" اکتیلیون ");
            case 51 ->
                y.append(" اکتیلیارد ");
            case 54 ->
                y.append(" نانیلیون ");
            case 57 ->
                y.append(" نانیلیارد ");
            case 60 ->
                y.append("  دسیلیون");
            case 63 ->
                y.append(" دسیلیارد ");
            case 66 ->
                y.append(" آندسیلیون ");
            case 69 ->
                y.append(" آندسیلیارد ");
            case 72 ->
                y.append(" دودسیلیون ");
            case 75 ->
                y.append("  دودسیلیارد");
            case 78 ->
                y.append(" تریدسیلیون ");
            case 81 ->
                y.append("  تریدسیلیارد");
            case 84 ->
                y.append("  کوادردسیلیون");
            case 87 ->
                y.append("  کوادردسیلیارد");
            case 90 ->
                y.append("  کویندسیلیون");
            case 93 ->
                y.append("  کویندسیلیارد");
            case 96 ->
                y.append("  سیدسیلیون");
            case 99 ->
                y.append(" سیدسیلیارد ");
            default ->
                y.append("");
        }
        return y;
    }

    public StringBuilder nameNumber(BigInteger n) {
        StringBuilder z = new StringBuilder();
        StringBuilder y = new StringBuilder();
        z.append(n);
        BigInteger a = BigInteger.valueOf(z.length());

        if (n.compareTo(BigInteger.ZERO) < 0) {
            y.append(" منفی ");
            n = n.negate();
            a = a.subtract(BigInteger.ONE);
        }

        if (n.equals(BigInteger.ZERO)) {
            y.append(" صفر ");

        } else {

            BigInteger b = n;
            while (b.compareTo(BigInteger.valueOf(1000)) > 0) {
                b = b.divide(BigInteger.valueOf(1000));
            }

            if (b.compareTo(BigInteger.valueOf(99)) > 0) {
                y.append(digitNumber_nnn(b));
            }
            if (b.compareTo(BigInteger.valueOf(9)) > 0) {
                y.append(digitNumber_nn(b));
            }
            if (b.compareTo(BigInteger.valueOf(0)) >= 0) {
                y.append(digitNumber_n(b));
            }

            StringBuilder x = new StringBuilder();
            x.append(b);
            BigInteger c = BigInteger.valueOf(x.length());
            BigInteger d = a.subtract(c);

            if (b.compareTo(BigInteger.ZERO) > 0) {
                y.append(digitLevel(d));
            }

            Double e = Math.pow(10, d.doubleValue());
            BigInteger f = n.remainder(BigInteger.valueOf(e.longValue()));

            if (f.compareTo(BigInteger.ZERO) > 0) {
                y.append(" و");
            }

            if (f.compareTo(BigInteger.ZERO) > 0) {
                y.append(nameNumber(f));
            }
        }

        return y;
    }

    public String digitNumber(int n) {
        String y = "";
        int hundreds = n / 100;
        int tens = (n % 100) / 10;
        int ones = n % 10;
        y = y + digitNameHundreds[hundreds];

        if (hundreds > 0 && (tens > 0 || ones > 0)) {
            y = y + and;
        }

        if (tens == 1) {
            y = y + digitNameTeens[ones];
        } else {
            y = y + digitNameTens[tens];
            if (tens > 0 & ones > 0) {
                y = y + and;
            }
            y = y + digitNameOnes[ones];
        }
        return y;
    }

    public void nameNumber(BigInteger n, String[] z, int a) {
        int b = n.remainder(d).intValue();
        if (b > 0) {
            z[a] = digitNumber(b) + digitNumberOrder[a];
        } else {
            z[a] = "";
        }
        BigInteger f = n.divide(d);

        if (f.compareTo(BigInteger.ZERO) > 0) {
            a = a + 1;
            nameNumber(f, z, a);
        }
    }

    public StringBuilder writeNameNumber(BigInteger n) {
        StringBuilder y = new StringBuilder();

        if (n.compareTo(BigInteger.ZERO) < 0) {
            y.append(" منفی ");
            n = n.negate();
        }

        if (n.equals(BigInteger.ZERO)) {
            y.append(" صفر ");

        } else {
            int a = 0;
            String[] z = new String[34];
            nameNumber(n, z, a);
            a = a + 33;
            while (a >= 0) {
                while (z[a] == null) {
                    a--;
                }
                y.append(z[a]);
                if (a > 0) {
                    y.append(and);
                }
                a--;
            }
        }
        return y;
    }

    public static void main(String[] args) {
        NameNumber n = new NameNumber();
//        System.err.println(" ==> " + n.writeNameNumber(BigInteger.valueOf(Long.MAX_VALUE)));
//        System.err.println(" ==> " + n.writeNameNumber(BigInteger.valueOf(Long.MIN_VALUE)));
//        System.err.println(" ==> " + n.writeNameNumber(BigInteger.ZERO));
//        System.err.println(" ==> " + n.number(BigInteger.valueOf(Long.MAX_VALUE)));
//        System.err.println(" ==> " + n.writeNameNumber(BigInteger.valueOf(9000000000000000000L).add(BigInteger.valueOf(9000000000000000000L))));
        System.err.println(" ==> " + n.writeNameNumber(new BigInteger("5156975")));
    }
}
