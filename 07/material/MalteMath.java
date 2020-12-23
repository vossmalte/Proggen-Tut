import java.util.Scanner;

public enum MalteMath {
    PI("pi") {
        @Override
        void execute(String input) {
            System.out.println(Math.PI);
        }
    },
    SQRT("sqrt [0-9]+") {
        @Override
        void execute(String input) {
            String digits = input.split(" ")[1];
            double s = Math.sqrt(Integer.parseInt(digits));
            System.out.println(s);

        }
    },
    QUIT("quit") {
        @Override
        void execute(String input) {
            running = false;
        }
    };

    String regex;
    MalteMath(String regex) {
        this.regex = regex;
    }

    abstract void execute(String input);

    static boolean running = true;
    public static void main(String[] args) {
        String input;
        Scanner s = new Scanner(System.in);
        do {
            input = s.nextLine();
            findAndExecute(input);
        } while(running);
    }

    public static void findAndExecute(String input) {
        for (MalteMath m : MalteMath.values()) {
            if (input.matches(m.regex)) {
                m.execute(input);
                return;
            }
        }
    }
}
