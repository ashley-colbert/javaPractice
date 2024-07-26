package javaPractice.Queues;

public class AnimalShelter {
  private QueueLinkedList catQueue;
  private QueueLinkedList dogQueue;
  private int size;

  public AnimalShelter() {
    this.catQueue = new QueueLinkedList();
    this.dogQueue = new QueueLinkedList();
    this.size = 0;
  }

  public void addCatQueue(String catName) {
    catQueue.enqueue(catName);
    size++;
  }

  public void addDogQueue(String dogName) {
    dogQueue.enqueue(dogName);
    size++;
  }

  public String adoptCat() {
    if (catQueue.isEmpty()) {
      System.out.println("There are no cats available");
      return null;
    } else {
      String adoptedCat = catQueue.dequeue();
      size--;
      System.out.println(adoptedCat + " has been adopted");
      return adoptedCat;
    }
  }

  public String adoptDog() {
    if (dogQueue.isEmpty()) {
      System.out.println("There are no dogs available");
      return null;
    } else {
      String adoptedDog = dogQueue.dequeue();
      size--;
      System.out.println(adoptedDog + " has been adopted");
      return adoptedDog;
    }
  }

  public String peekCat() {
    if (catQueue.isEmpty()) {
      System.out.println("Cat queue is empty");
      return null;
    } else {
      String cat = catQueue.peek();
      return cat;
    }
  }

  public String peekDog() {
    if (dogQueue.isEmpty()) {
      System.out.println("Dog queue is empty");
      return null;
    } else {
      String dog = dogQueue.peek();
      return dog;
    }
  }
  public static void main(String[] args) {
    AnimalShelter shelter = new AnimalShelter();

    shelter.addCatQueue("Chloe");
    shelter.addCatQueue("Chickadee");
    shelter.addCatQueue("Atlas");
    shelter.addCatQueue("Bodhi");

    shelter.addDogQueue("Lennon");
    shelter.addDogQueue("Daisy");
    shelter.addDogQueue("Tanner");
    shelter.addDogQueue("Rory");


    System.out.println("Adopted Cat: " + shelter.adoptCat());

    System.out.println("Adopted Dog: " + shelter.adoptDog());

    System.out.println("Next cat in queue: " + shelter.peekCat());

    System.out.println("Next dog in queue: " + shelter.peekDog());
  }
}
