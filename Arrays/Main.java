import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    //Array elements must be the same

    int[] intArr = new int[3];
    int[] intArr2 = { 1, 2, 3 };
    int intArr3[];
    int []intArr4; //Try not to do this

    int[][] intArr2D = {{1},{2,3},{4,5,6}};
    intArr2D = new int[3][5];
    int intArr2D2[][];
    int[] intArr2D3[]; //Try not to do this

    // for (int i = 0; i < intArr2.length; i++) {
    //   System.out.print(i);
    // }
    //
    // for (int i : intArr2) {
    //   System.out.print(i);
    // }
    //
    // for (int i = 0; i < intArr2D.length; i++){
    //   for (int j = 0; i < intArr2D[i].length ; j++ ) {
    //     System.out.println(intArr2D[i][j]);
    //   }
    // }

    // System.out.println(Arrays.toString(intArr2));

    int[] messyArray = { 354, 3, 63, 7345 }; // Unsorted

    Arrays.sort(messyArray);
    // System.out.println(Arrays.toString(messyArray));
    // System.out.println(Arrays.binarySearch(messyArray, 63));

    varArgMethod("hello", 4, 32,65,74,3,2);
  }

  // When you have an undeterminable length of arguments of the same type for the parameters
  public static void varArgMethod(String str, int ...args){
    for (int i : args){
      System.out.println(i);
    }
  }
}
