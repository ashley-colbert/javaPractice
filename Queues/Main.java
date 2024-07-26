package javaPractice.Queues;

public class Main {
  public static void main(String[] args) {
    QueueLinkedList queue = new QueueLinkedList();
    queue.enqueue("10");
    queue.enqueue("20");
    System.out.println("Front element is: " + queue.peek());
    queue.dequeue();
    System.out.println("Front element is: " + queue.peek());
    queue.deleteQueue();
  }


  //An animal shelter, which holds only dogs and cats, operates on a strickly first in first  out basis. People must adopt either the "oldest" (based on the arrival time) of all animals at the shelter, or they can adopt a dog or cat(and will recieve the oldest animal of that type). They cannot select which specific animal they would like. Create the data structures to maintain this system and implement operations such as enqueue, dequeue, dequeueDog, dequeueCat.
}
