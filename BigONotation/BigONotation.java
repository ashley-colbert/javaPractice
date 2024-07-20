package javaPractice.BigONotation;

public class BigONotation {
    
  public static int multiply (int n) {
    int test = 10;
    if (n < 10) {
      System.out.println("Hey I am less than: " + n);
    }
    return n * n;
  }
}
