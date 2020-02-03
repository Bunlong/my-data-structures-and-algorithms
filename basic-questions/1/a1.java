public class a1 {
  static int f(int[] a) {
    int X = 0; // sum of the odd
    int Y = 0; // sum of the even
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        Y += a[i];
      } else {
        X += a[i];
      }
    }
    return X - Y;
  }

  public static void main(String args[]) {
    int result = f(new int[]{1});
    System.out.println(result);

    int result1 = f(new int[]{1, 2});
    System.out.println(result1);

    int result2 = f(new int[]{1, 2, 3});
    System.out.println(result2);

    int result3 = f(new int[]{1, 2, 3, 4});
    System.out.println(result3);

    int result4 = f(new int[]{3, 3, 4, 4});
    System.out.println(result4);

    int result5 = f(new int[]{3, 2, 3, 4});
    System.out.println(result5);

    int result6 = f(new int[]{4, 1, 2, 3});
    System.out.println(result6);

    int result7 = f(new int[]{1, 1});
    System.out.println(result7);

    int result8 = f(new int[]{});
    System.out.println(result8);
  }
}
