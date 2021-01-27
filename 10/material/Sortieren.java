public class Sortieren {
    static char[] array = {'D', 'B', 'E', 'F', 'C', 'G', 'A'};

    public static void main(String[] args) {
        array = sort(array);
        print(array);
    }

    public static void print(char[] arr) {
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }

    static boolean isSorted(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] < arr[i]){
                // alles passt
            } else {
                // Reihenfolgefehler! Abbrechen und false
                return false;
            }
        }
        return true;
    }

    static char[] sort(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] < arr[i]){
                // alles passt
            } else {
                // Reihenfolgefehler! Vertauschen!
                char temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
        }
        print(arr);
        if (!isSorted(arr))
            arr = sort(arr);
        return arr;
    }
}
