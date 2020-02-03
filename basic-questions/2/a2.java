public class a2 {
  static int f(int[] a) {
    int max1 = -1;
    int max2 = -1;
    for (int i = 0; i < a.length; i++) {
      if (a[i] > max1) {
        max2 = max1;
        max1 = a[i];
      } else if (a[i] > max2 && a[i] != max1) {
        max2 = a[i];
      }
    }
    return max2;
  }

  public static void main(String args[]) {
    int result = f(new int[]{1, 2, 3, 4});
    System.out.println(result);

    int result1 = f(new int[]{4, 1, 2, 3});
    System.out.println(result1);

    int result2 = f(new int[]{1, 1, 2, 2});
    System.out.println(result2);

    int result3 = f(new int[]{1, 1});
    System.out.println(result3);

    int result4 = f(new int[]{1});
    System.out.println(result4);

    int result5 = f(new int[]{});
    System.out.println(result5);
  }
}