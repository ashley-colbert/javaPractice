package javaPractice.Queues;

public class QueueArray {
  private int [] arr;
  private int backOfQueue;
  int beginningOfQueue;
  int nItems;

  public QueueArray(int size) {
    this.arr = new int[size];
    this.backOfQueue = -1;
    this.beginningOfQueue = -1;
    this.nItems = 0;
    System.out.println("The queue is successfully created with size of: " + size);
  }

  //isFull
  public boolean isFull() {
    if(backOfQueue == arr.length - 1) {
      return true;
    } else {
        return false;
    }
  }

  public boolean isEmpty() {
    return (nItems == 0);
  }

  //Enqueue
  public void enQueue(int value){
    if(isFull()){
      System.out.println("Queue is full");
    } else if (isEmpty()){
      beginningOfQueue = 0;
      backOfQueue++;
      nItems++;
      arr[backOfQueue] = value;
      System.out.println("Successfully inserted " + value + " int the Queue");
    } else {
      backOfQueue++;
      nItems++;
      arr[backOfQueue]= value;
      System.out.println("Successfully inserted " + " in the queue");
    }
  }

    //deQueue
    public int deQueue(int value){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      } else {
        int result = arr[beginningOfQueue];
        beginningOfQueue++;
        if (beginningOfQueue > backOfQueue) {
          beginningOfQueue = backOfQueue = -1;
        }
        nItems--;
        return result;
      }
    }

    //peek
    public int peek() {
      if(!isEmpty()) {
        return arr[beginningOfQueue];
      } else {
        System.out.println("The queue is empty");
        return -1;
      }
    }

    //delete
    public void deleteQueue(){
      arr = null;
      System.out.println("The queue is successfully deleted");
    }

 }
