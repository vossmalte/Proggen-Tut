import java.util.ArrayList;

public class Car {
    String marke = "BMW";

    public String toString() {
        return "Brummm";
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        Object o = (Object) myCar;
        System.out.println(o); // brumm

        System.out.println((byte) 128);
        System.out.println((char) 65);
        //byte b = 2000; // error: incompatible types: possible lossy conversion from int to byte
        System.out.println(Byte.MAX_VALUE);

        ArrayList<> l = new ArrayList<>();
        l.add(new Car());
    }
}
