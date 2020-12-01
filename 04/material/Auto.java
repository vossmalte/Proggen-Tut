public class Auto {
    static int hergestellteAutos = 0;
    String marke;
    int ps;
    int serienNummer;
    Auto(int ps) {
        marke = "VW";
        this.ps = ps;
        hergestellteAutos += 1; // erhöhen
        serienNummer = hergestellteAutos;
    }

    public static void main(String[] args) {
        Auto a,b;
        a = new Auto(300);
        b = new Auto(50);
        System.out.println(a.serienNummer);
        System.out.println(b.serienNummer);
    }
}
