package javaPractice.LinkedList;

public class Main {
  public static void main(String[] args) {
    
    //SingleLinkedList Demo
    SingleLinkedList singleLinkedList = new SingleLinkedList();
    singleLinkedList.insertInLinkedList(1, 0);
    singleLinkedList.insertInLinkedList(2, 1);
    singleLinkedList.insertInLinkedList(3, 2);
    singleLinkedList.insertInLinkedList(4, 3);
    singleLinkedList.insertInLinkedList(5, 1);
    
    singleLinkedList.traverseLinkedList();
    singleLinkedList.searchNode(2);
    singleLinkedList.deleteNode(1);
    singleLinkedList.traverseLinkedList();


    //DoubleLinkedList Demo
    DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    doubleLinkedList.insertDLL(1,0);
    doubleLinkedList.insertDLL(2,1);
    doubleLinkedList.insertDLL(3,2);

    doubleLinkedList.traverseDLL();
    doubleLinkedList.reverseTraverseDLL();
    doubleLinkedList.searchNodeDLL(3);
    doubleLinkedList.deleteNodeDLL(0);
    doubleLinkedList.traverseDLL();
    doubleLinkedList.deleteFullDLL();
    doubleLinkedList.traverseDLL();

  }
}




//Assignment question number
//1. Investigate and fix whey when inserting a position that is already occupied it throws a null pointed expression
//-uncomment line 10 and investigate and fix the error

//2. Deleting a node from a singleLinkedList in the SingleLinkedList class
//-If a linkedList doesn't exist
//-deleting at the ending
//-deleting at the beginning
//-deleting anywhere from the list

