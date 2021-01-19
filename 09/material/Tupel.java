public class Tupel<S,T> {
    private S first;
    private T second;

    // Konstruktor
    public Tupel(S first, T second){
        this.first = first;
        this.second = second;
    }

    // parameterloser Konstruktor
    public Tupel(){
        
    }

    public S getFirst() {return first;}
    public T getSecond() {return second;}

    public static void main(String[] args) {
        Tupel tripel = new Tupel<Integer,Tupel<Double,Object>>();
    }
}
