package javaPractice.Stacks;

//implement the same methods from stack array to create stack linked lists
public class StackLinkedList {
  Node topOfStack;
  int size;

  public Node createLinkedListStack( int nodeValue) {
    Node node = new Node();
    node.next = null;
    node.value = nodeValue;
    topOfStack = node;
    size = 1;
    return topOfStack;
  }

  public boolean isEmpty() {
    if(topOfStack == null) {
      System.out.println("Stack is empty");
      return true;
    }
    else {
      System.out.println("Stack is not empty");
      return false;
    }
  }

  public void push(int nodeValue) {
    Node node = new Node();
    node.value = nodeValue;
    node.next = topOfStack;
    topOfStack = node;
    size ++;
    System.out.println(nodeValue + " Pushed to the stack");
  }

  public void pop() {
    if(isEmpty()) {
      System.out.println("Stack is empty");
      return;
    } else {
      System.out.println(topOfStack.value + " has been removed from the stack");
      topOfStack = topOfStack.next;
      size -- ;
    }
  }

  public int peek() {
  if (isEmpty()) {
    System.out.println("The stack is empty");
    return -1;
  } else {
  System.out.println("The top of the stack is: " + topOfStack.value);
  return topOfStack.value;
  }
 }

public void delete() {
  topOfStack = null;
  size = -1;
  System.out.println("The stack has been deleted");
}

}
