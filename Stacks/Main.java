package javaPractice.Stacks;

public class Main {
  public static void main(String[] args) {
    
    //Stack arrays
    StackArrays stackArray = new StackArrays(5);
    stackArray.push(1);
    stackArray.push(2);
    stackArray.push(3);
    stackArray.push(4);
    stackArray.push(5);
    stackArray.pop();
    stackArray.peek();


    //To check if a word is a palindrome, each letter of a word will be added to and then remove from a stack before it can be determined if the word is a palindrome.
    StackArrays palindromeChecker = new StackArrays(0);
    StackArrays palindromeChecker2 = new StackArrays(0);

    palindromeChecker.palindrome("wow");

    palindromeChecker2.palindrome("dog");


  //Stack LinkedList

    StackLinkedList stackLinkedList = new StackLinkedList();

    stackLinkedList.createLinkedListStack(10);

    stackLinkedList.push(1);
    stackLinkedList.push(2);
    stackLinkedList.push(3);
    stackLinkedList.push(4);
    stackLinkedList.push(5);
    stackLinkedList.pop();
    stackLinkedList.peek();
    stackLinkedList.delete();








  }
  
}
