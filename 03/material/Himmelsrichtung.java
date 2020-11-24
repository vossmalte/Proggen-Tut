public enum Himmelsrichtung {
    Norden,
    Nordost,
    Osten,
    Suedost,
    Sueden,
    Suedwest,
    Westen,
    Nordwest;

public static void main(String[] args) {
    Himmelsrichtung h = Osten;
    switch(h) {
        case Osten:
            System.out.println("Es ist morgens");
            break;
        case Sueden:
            System.out.println("Es ist mittags");
            break;
        default:
            System.out.println("keine Uhrzeit möglich");
            break;
    }
}
}
