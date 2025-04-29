package trainig.string;

public class Word {

    public char sameAsDistance(char l) {
        switch (l) {
            case ' ' ->
                l = ' ';
            case '\n' ->
                l = '\n';
            case '\t' ->
                l = '\t';
            case '\r' ->
                l = '\r';
            case '\\' ->
                l = '\\';
            case '.' ->
                l = '.';
            case ',' ->
                l = ',';
            case ';' ->
                l = ';';
            case ':' ->
                l = ':';
            case '(' ->
                l = '(';
            case ')' ->
                l = ')';
            case '_' ->
                l = '_';
            case '{' ->
                l = '{';
            case '}' ->
                l = '}';
            case '[' ->
                l = '[';
            case ']' ->
                l = ']';
            default ->
                l = '|';
        }
        return l;
    }

    public String capitalize(String n) {
        String z;
        int b;
        char[] l = new char[n.length()];
        for (b = 0; b < l.length; b++) {
            l[b] = n.charAt(b);
        }
        for (b = 0; b < l.length - 1; b++) {
            while (l[b] == sameAsDistance(l[b])) {
                b++;
                if (l[b] != sameAsDistance(l[b])) {
                    l[b] = Character.toUpperCase(l[b]);
                }
            }
        }
        return z = new String(l);
    }

    public static void main(String[] args) {
        Word a = new Word();
        System.err.println(" ==> " + a.capitalize(" abc   defg a"));
    }

}
