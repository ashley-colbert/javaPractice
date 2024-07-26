package javaPractice.Queues;

public class QueueLinkedList {
  private Node frontOfQueue;
  private Node backOfQueue;
  private int size;

  public QueueLinkedList() {
    this.frontOfQueue = null;
    this.backOfQueue = null;
    size = 0;
  }


  public boolean isEmpty() {
    return frontOfQueue == null;
  }

  public void enqueue(String nodeValue) {
    Node node = new Node(nodeValue);
    if(backOfQueue == null) {
      frontOfQueue = node;
    } else {
    backOfQueue.setNext(node);
    }
    backOfQueue = node;
    size ++;
    System.out.println(nodeValue + " has been inserted into the queue");
  }

  public String dequeue() {
    if(isEmpty()) {
      System.out.println("The queue is empty");
      return null;
    } else {
      String returnedValue = frontOfQueue.getValue();
      frontOfQueue = frontOfQueue.getNext();
      if (frontOfQueue == null) {
        backOfQueue = null;
      }
      size--;
      System.out.println("Removed " + returnedValue + " from the queue");
      return returnedValue;
    }
  }

  public String peek() {
    if (isEmpty()) {
      System.out.println("The queue is empty");
      return null;
    } else {
      return frontOfQueue.getValue();
    }
  }

  public void deleteQueue() {
    frontOfQueue = backOfQueue = null;
    System.out.println("Queue has been deleted");
  }
}
