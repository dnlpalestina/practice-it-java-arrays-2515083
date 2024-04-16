import java.util.concurrent.ArrayBlockingQueue;

public class App {

    public static void printTriangle(Object[] arr) {
        StringBuilder[] concat = new StringBuilder[arr.length];
        for (int i = arr.length; i > 0; i--) {
            concat[i-1] = new StringBuilder("");

            for (int j = 0; j < i; j++) {
                concat[i-1] = concat[i-1].append(arr[j]);
            }
        }

        for (StringBuilder stringBuilder : concat) {
            System.out.println(stringBuilder);
        }
    }
    public static void printTriangleBetter(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        printTriangleBetter(new Integer[] {1, 2, 3, 4});
        printTriangleBetter(new Character[] {'A', 'B', 'C', 'D', 'E'});
        printTriangleBetter(new String[] {});
        printTriangleBetter(new String[] {"Hello"});
        printTriangleBetter(new String[] {"Hello", "There", "Friend"});
    }
}