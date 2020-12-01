class Aufgaben {
    static double f(double x) {
        return 2*x+3;
    }

    public static double factorial(double n){
        double result = 1;
        for(int i = 1;i <= n; i++){
            result = result * i;
        }
        return result;
    }

    static double sinus(double x) {
        double ergebnis = 0.0;
        for (int n = 0; n < 20; n++) {
            ergebnis += Math.pow((-1),n) * (Math.pow(x,2*n+1))/(factorial(2*n+1));
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        //System.out.println(f(3));
        System.out.println(sinus(3.1));
        System.out.println(sinus(0.78));
    }
}