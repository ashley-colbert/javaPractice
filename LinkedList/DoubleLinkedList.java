package javaPractice.LinkedList;

public class DoubleLinkedList {
  public DoubleNode head;
  public DoubleNode tail;
  public int size;

//How to create a double Linked List
  public DoubleNode createDLL(int nodeValue) {
    head = new DoubleNode();
    DoubleNode newNode =  new DoubleNode();
    newNode.value = nodeValue;
    head = newNode;
    tail = newNode;
    size = 1;
    return head;
  }

// Insert to a double linked list

public void insertDLL(int nodeValue, int location) {
  DoubleNode newNode = new DoubleNode();
  newNode.value = nodeValue;
  if(head == null) {
    createDLL(nodeValue);
    return;
  } else if (location == 0) {
    newNode.next = head;
    newNode.prev = null;
    head.prev = tail;
    head = newNode;
  } else if (location >= size) {
    newNode.next = null;
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
  } else {
    DoubleNode tempNode = head;
    int index = 0;
    while (index < location - 1) {
      tempNode = tempNode.next;
      index++;
    }
    newNode.prev = tempNode;
    newNode.next = tempNode.next;
    tempNode.next = newNode;
    newNode.next.prev = newNode;
  }
  size++;
}

  //traverse the DoubleLL

  public void traverseDLL() {
    if (head == null) {
      System.out.println("DLL does not exist");
    } else {
      DoubleNode tempNode = head;
      for (int i = 0; i< size; i++){
        System.out.println(tempNode.value);
        if(i!= size -1) {
          System.out.println(" < - > ");
        }
        tempNode = tempNode.next;
      }
    }
    System.out.println("\n");
  }

  
  //Reverse traverse
  public void reverseTraverseDLL() {
    if (tail == null) {
      System.out.println("DLL does not exist");
    } else {
      DoubleNode tempNode = tail;
      for (int i = 0; i< size; i++){
        System.out.println(tempNode.value);
        if(i!= size -1) {
          System.out.println(" < - > ");
        }
        tempNode = tempNode.prev;
      }
    }
    System.out.println("\n");
  }


  //search for value
  public boolean searchNodeDLL (int nodeValue){
    if (head != null) {
        DoubleNode tempNode = head;
        for (int i = 0; i < size; i++){
            if (tempNode.value == nodeValue){
                System.out.println("Found the node: " + tempNode.value + " at location: " + i + "\n");
                return true;
            }
            tempNode = tempNode.next;
        }
    }
    System.out.println("Node not found");
    return false;
  }

  //delete node

  public void deleteNodeDLL(int location){
    if (head == null) {
      System.out.println("DLL does not exist");
    } else if (location == 0) {
      head = head.next;
      size--;
    } else if (location >= size) {
      DoubleNode tempNode = head;
      for (int i = 0; i< size -1; i++) {
        tempNode = tempNode.next;
      }
    } else {
      DoubleNode prevNode = head;
      int index =0;
      while(index < location -1) {
        prevNode = prevNode.next;
        index++;
      }
      DoubleNode newNode = prevNode.next;
      prevNode.next = newNode.next;
      size--;
    }
  }

    //Delete whole doubleLinkedList
    public void deleteFullDLL() {
      if (head == null) {
        System.out.println("DLL does not exist");
      } 
      DoubleNode node = head;
      while (node != null) {
        DoubleNode next = node.next;
        node.prev = null;
        node.next = null;
        node = next;
      }
      head = null;
      tail = null;
      size = 0;
  }

}




