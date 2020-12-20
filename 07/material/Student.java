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

        malte.greet(peter);
        malte.greet(anne);
    }
}