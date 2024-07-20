package javaPractice.Stacks;

public class StackArrays {
  int [] arr;
  int topOfStack;
  
  public StackArrays(int size) {
    this.arr = new int[size];
    this.topOfStack = -1;
    System.out.println("The stack is created with a size of: " + size);
  }

  public boolean isEmpty() {
    if(topOfStack == -1) {
      System.out.println("Stack is empty");
      return true;
    }
    else {
      return false;
    }
  }

  public boolean isFull(){
    if(topOfStack == arr.length -1){
      System.out.println("Stack is full");
      return true;
    } else {
      return false;
    }
  }

  //implement a push method
  public void push(int value) {
    if (isFull()) {
      System.out.println("The stack is full");
    } else {
      arr[topOfStack + 1] = value;
      topOfStack ++;
      System.out.println("The value is successfully added");
    }
  }

  //implement pop method
  public int pop() {
    if (isEmpty()) {
      System.out.println("The stack is empty");
      return -1;
    } else {
      int value = arr[topOfStack --];
      System.out.println("The value is successfully removed");
      return value;
    }
  }

  //implement peek method

  public void peek() {
    if (isEmpty()) {
      System.out.println("The Stack is empty");
    } else {
      System.out.println("The top of this stack is: " + arr[topOfStack]);
    }
  }

  //implement delete stack method

  public void delete() {
    arr = null;
    System.out.println("Stack has been deleted.");
  }

  //use the stack datastructure to check whether a word is a palindrome or not

  public boolean palindrome(String word) {
    int sizeOfPalStack = word.length();
    StackArrays stackArray = new StackArrays(sizeOfPalStack);
    for (int i = 0; i < word.length(); i++) {
      stackArray.push(word.charAt(i));
    }
    String reverseWord = "";

    while (!stackArray.isEmpty()) {
      reverseWord += (char) stackArray.pop();
    }
    if (word.equals(reverseWord)) {
      System.out.println("The word is a palindrome.");
      return true;
    } else {
      System.out.println("Word is not a palindrome");
    return false;
  }
}


}
