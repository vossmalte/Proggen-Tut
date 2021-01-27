class Input {
    public static void main(String[] args) {
        int a,b,c;
        // get user input
        a = 20;
        b = 40;
        c = 90;
        try {
            boolean isRect = Logik.istRechtwinkligesDreeick(a,b,c);
        } catch (IllegalArgumentException e) {
            // GUI.openFehlermeldung(e.getMessage());
            main(null); // restart
        }

        if (isRect) {
            System.out.println(GermanOutput.isRect_output);
            //GUI.button3.setText("das ist ein dreieck oder nicht");
        } else {
            System.out.println("nicht rechtwinklig");
        }
    }
}