class Student {
    String subject;
    String name;
    public String toString() {
        return this.name;
    }
    public String greet() {return "Hello";}
    public String greet(Student other) {
        return "Hi " + other;
    }
    public String greet(Professor other) {
        return "Sehr geehrte " + other;
    }
    public static void main(String[] args) {
        Student malte, peter;
        malte = new Student();
        malte.name = "Malte";
        peter = new Student();
        peter.name = "Peter";
        Professor anne = new Professor();
        anne.name = "Anne";

        System.out.println(malte.greet(peter));
        System.out.println(malte.greet(anne));

        System.out.println(anne.greet(malte));
        System.out.println(anne.greet(anne));
    }
}