import java.util.Arrays;

public class App {

  public static void reverse(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      swap(arr, i, arr.length-1-i);
    }
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String args[]) {
    int[] arr = new int[] {};
    System.out.println(Arrays.toString(arr));
    reverse(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println();

    int[] arr2 = new int[] { 1 };
    System.out.println(Arrays.toString(arr2));
    reverse(arr2);
    System.out.println(Arrays.toString(arr2));
    System.out.println();

    int[] arr3 = new int[] { 1, 2, 3 };
    System.out.println(Arrays.toString(arr3));
    reverse(arr3);
    System.out.println(Arrays.toString(arr3));
    System.out.println();

    int[] arr4 = new int[] { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(arr4));
    reverse(arr4);
    System.out.println(Arrays.toString(arr4));
    System.out.println();

    int[] arr5 = new int[] { 9, 3, 4, 1 };
    System.out.println(Arrays.toString(arr5));
    reverse(arr5);
    System.out.println(Arrays.toString(arr5));
    System.out.println();

    int[] arr6 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
    System.out.println(Arrays.toString(arr6));
    reverse(arr6);
    System.out.println(Arrays.toString(arr6));
    System.out.println();
  }
}