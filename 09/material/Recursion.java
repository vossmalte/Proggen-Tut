class Recursion {
    public static int fakultaet(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fakultaet(n-1);
    }

    public static int fakIterativ(int n) {
        int ergebnis = 1;
        for (int i = 1; i <= n; i++) {
            ergebnis = ergebnis * i;
        }
        return ergebnis;
    }

    public static int ggT(int a, int b) {
        if (a==b) {
            return a;
        } else {
            if (a > b) {
                return ggT(a-b, b);
            } else {
                return ggT(b-a, a);
            }
        }
    }
}