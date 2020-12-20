class Professor extends Student {
    // subject from Student
    // name from Student
    @Override
    public String toString() {
        return "Prof.Dr. " + this.name;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Malte";
        Professor p = new Professor();
        p.name = "Anne";
        System.out.println(s);
        System.out.println(p);
    }
}