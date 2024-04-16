import java.util.Arrays;

public class App {

/**
  This approach
  uses two pointers:

  idx: points to the current position in the array.
  writeIdx: points to the position where the next non-zero element should be placed.
  
  We iterate through the array.
  
  If the current element (arr[idx]) is non-zero, 
  we swap it with the element at writeIdx and increment both pointers.
  Otherwise, we only increment idx.
*/
  public static void moveZerosToTheEnd(int[] arr) {
    int writeIdx = 0;
    for (int idx = 0; idx < arr.length; idx++) {
      if (arr[idx] != 0) {
        if (idx != writeIdx) {
          swap(arr, idx, writeIdx);
        }
        writeIdx++;
      }
    }
  }

  public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i]= arr[j];
    arr[j]=temp;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 1, 0, 0, 0, 1, 0 };
    System.out.println(Arrays.toString(arr));
    moveZerosToTheEnd(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println();

    int[] arr2 = new int[] { 0, 0, 1, 2, 3, 0, 4 };
    System.out.println(Arrays.toString(arr2));
    moveZerosToTheEnd(arr2);
    System.out.println(Arrays.toString(arr2));
    System.out.println();

    int[] arr3 = new int[] { 0, 0 };
    System.out.println(Arrays.toString(arr3));
    moveZerosToTheEnd(arr3);
    System.out.println(Arrays.toString(arr3));
    System.out.println();

    int[] arr4 = new int[] { 2, 9, 1 };
    System.out.println(Arrays.toString(arr4));
    moveZerosToTheEnd(arr4);
    System.out.println(Arrays.toString(arr4));
    System.out.println();

    int[] arr5 = new int[] { 0, 10, 0 };
    System.out.println(Arrays.toString(arr5));
    moveZerosToTheEnd(arr5);
    System.out.println(Arrays.toString(arr5));
    System.out.println();

    int[] arr6 = new int[] { 3, 0, 0 };
    System.out.println(Arrays.toString(arr6));
    moveZerosToTheEnd(arr6);
    System.out.println(Arrays.toString(arr6));
    System.out.println();

    int[] arr7 = new int[] {};
    System.out.println(Arrays.toString(arr7));
    moveZerosToTheEnd(arr7);
    System.out.println(Arrays.toString(arr7));
    System.out.println();
  }
}