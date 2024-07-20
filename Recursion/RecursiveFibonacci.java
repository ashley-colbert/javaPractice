package javaPractice.Recursion;

public class RecursiveFibonacci {
  public static void main(String[] args) {
    RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();
    int result = recursiveFibonacci.fibonacci(10);

    System.out.println(result);
  }

  public int fibonacci(int n) {
    if (n < 1) {
      return -1;
    }
    if (n == 1 || n == 0) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci( n - 2);
  }
}
