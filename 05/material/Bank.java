class Bank {
    static int bankCounter = 100;

    int blz;

    public Bank() {
        blz = bankCounter;
        bankCounter += 1;
    }

    public static void main(String[] args) {
        Bank b1, b2, b3;
        b1 = new Bank();
        b2 = new Bank();
        b3 = new Bank();
        System.out.println(b1.blz);
        System.out.println(b3.blz);
    }
}