package javaPractice.LinkedList;

public class SingleLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createLinkedList( int nodeValue) {
    head = new Node();
    Node node = new Node();
    node.next = null;
    node.value = nodeValue;
    head = node;
    tail = node;
    size = 1;
    return head;
  }

  public void insertInLinkedList(int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;
    if(head == null) {
      createLinkedList(nodeValue);
      return;
    } else if (location == 0) {
      node.next = head;
      head = node;
    } else if (location >= size) {
      tail.next = node;
      // node.next = null;
      tail = node;
    } else {
      Node tempNode = head;
      int index = 0;
      while (index < location - 1) {
        tempNode = tempNode.next;
        index++;
      }
      node.next = tempNode.next;
      tempNode.next = node;
    }
    size++;
    
  }

  //traverse the LinkedList

  public void traverseLinkedList() {
    if (head == null) {
      System.out.println("SLL does not exist");
    } else {
      Node tempNode = head;
      for (int i = 0; i< size; i++){
        System.out.println(tempNode.value);
        if(i!= size -1) {
          System.out.println(" -> ");
        }
        tempNode = tempNode.next;
      }
    }
    System.out.println("\n");
  }

  //Search for a node

  public boolean searchNode (int nodeValue){
    if (head != null) {
        Node tempNode = head;
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

  //Delete node from a single LinkedList

  public void deleteNode(int location){
    if (head == null) {
      System.out.println("SLL does not exist");
    } else if (location == 0) {
      head = head.next;
      size--;
    } else if (location >= size) {
      Node tempNode = head;
      for (int i = 0; i< size -1; i++) {
        tempNode = tempNode.next;
      }
    } else {
      Node prevNode = head;
      int index =0;
      while(index < location -1) {
        prevNode = prevNode.next;
        index++;
      }
      Node node = prevNode.next;
      prevNode.next = node.next;
      size--;
    }

    
  }

}