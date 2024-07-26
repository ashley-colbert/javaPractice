package javaPractice.Queues;

public class Node {
  public String value;
  public Node next;

  public Node(String value) {
    this.value = value;
    this.next = null;
}

  public String getValue() {
    return value;
  }

  public Node getNext() {
    return next;
  }

  public void setValue(String value) {
    this.value = value;
  } 

  public void setNext(Node next) {
    this.next = next;
  }
}
