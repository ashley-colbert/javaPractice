package javaPractice.Recursion;

public class FactorialComputation {
  public static void main(String[] args) {
    FactorialComputation factorialComputation = new FactorialComputation();
    int result = factorialComputation.factorial(10); 
    int result1 = factorialComputation.factorial(7); 

    System.out.println(result);
    System.out.println(result1);


  }


  
  public int factorial(int n) {
    if (n < 1) {
      return -1;
    }
    if (n == 1) {
      return 1;
    }
    return n * factorial(n-1);
  } 


}
