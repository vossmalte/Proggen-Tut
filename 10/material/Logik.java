public class Logik {
    public static boolean istRechtwinkligesDreeick(int a, int b, int c) {
        if (a+b+c != 180) {
            throw new IllegalArgumentException("kein Dreieck (Innenwinkelsumme)");
        }
        if (a >= 180 || b >= 180 || c >= 180) {
            throw new IllegalArgumentException("zu große Winkel");
        }
        if (a == 90 || b == 90 || c == 90) {
            return true;
        }
        return false;
    }

    // nicht so! falsche Datentypen
    public static boolean istRechtwinkligesDreeick(String a, String b, String c) {
        return false;
    }

    public Customer findCustomerByUserName(String username) {
        // ...
        return null;
    }

    public static void sendMail(Costumer from, Costumer to, String msg) {

    }
}
