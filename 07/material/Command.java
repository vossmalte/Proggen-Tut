import java.util.Scanner;

enum Command {
    PLUS("[0-9]+\\+[0-9]+"),
    SQRT("sqrt [0-9]+") {
        // hier wird execute ueberschrieben
        @Override
        boolean execute(String args) {
            System.out.println(Math.sqrt(Integer.parseInt(args.split(" ")[1])));
            return true;
        }
    },
    QUIT("quit") {
        boolean execute(String args) {
            return false;
        }
    };

    // Attribute, das jedes Command hat
    final String regex;
    // https://www.w3schools.com/java/java_regex.asp
    // regex sind regulaere Ausdruecke
    // unten wird match verwendet

    // Instanzen von Command haben diese Methode
    boolean execute(String args) {
        // noch besser: diese Methode abstrakt machen, 
        // dann muss jedes Command sie ueberschreiben
        System.out.println("Diese Methode ueberschreiben");
        // hier am besten 
        return true;
    }

    // Konstruktor von Instanzen von Command
    Command(String regex) {
        this.regex = regex;
    }

    // statische Methode
    static boolean findAndExecute(String command) {
        for (Command c : Command.values()) {
            if(command.matches(c.regex)) {
                return c.execute(command);
            } 
        }
        System.out.println("404");
        return true;
    }

    public static void main(String[] args) {
        String input;
        // Terminal statt Scanner verwenden
        Scanner s = new Scanner(System.in);
        do {
            input = s.nextLine();
        // aufhoeren, wenn return false
        } while(findAndExecute(input));
        s.close();
    }

}