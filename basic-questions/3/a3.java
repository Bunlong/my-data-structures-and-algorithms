public class a3 {
  static int f(int n) {
    if (n == 0) return 0;
    int reverse = 0;
    while (n != 0) {
      reverse = (reverse * 10) + (n % 10);
      n /= 10;
    }
    return reverse;
  }

  public static void main(String args[]) {
    int result = f(1234);
    System.out.println(result);

    int result1 = f(12005);
    System.out.println(result1);

    int result2 = f(1);
    System.out.println(result2);

    int result3 = f(0);
    System.out.println(result3);

    int result4 = f(-12345);
    System.out.println(result4);
  }
}
