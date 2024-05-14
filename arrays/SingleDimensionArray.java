/**
 * 1. insert  into an Array
 * 2. Traverse an Array
 * 3. Delete Array for both (specific value as well as the whole array)
 * 4. Search for an element in an array
 */

import java.util.Arrays;

public class SingleDimensionArray {
    int[] arr = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToInsert) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("Cell already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array: " + e);
        }
    }

    //Traverse the array

    public void traverse() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //Delete an element from the array (set it to the mim value)
    public void delete(int indexToDelete) {
        if (indexToDelete < arr.length && indexToDelete >= 0) {
            for (int i = indexToDelete; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length -1] = Integer.MIN_VALUE;
            System.out.println("Successfully deleted from: " + indexToDelete);
        } else {
            System.out.println("Invalid index");
        }
    }

    //Set the array to null value
    public void deleteArray() {
        arr = null;
        System.out.println("Array is now null.");
    }

//Search for a particular value in the array, but will only find the first instance of the value.
//    public void searchArray(int valueToSearch) {
//        for(int i = 0; i < arr.length; i++) {
//            if (arr[i] == valueToSearch) {
//                System.out.println("Value is found at the index of " + i);
//                return;
//            }
//        }
//        System.out.println(valueToSearch + " is not found");
//    }

    //this will search for a value and return all instances of that value
    public void searchArray(int valueToSearch) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value " + valueToSearch + " is found at the index of " + i);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println(valueToSearch + " is not found in the array.");
        }
    }

    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(8);
        singleDimensionArray.insert(0, 1);
        singleDimensionArray.insert(1, 2);
        singleDimensionArray.insert(2, 3);
        singleDimensionArray.insert(3, 4);
        singleDimensionArray.insert(4, 5);
        singleDimensionArray.insert(5, 3);
        singleDimensionArray.insert(6, 4);
        singleDimensionArray.insert(7, 5);

        System.out.println(Arrays.toString(singleDimensionArray.arr));
        singleDimensionArray.delete(1);
        System.out.println(Arrays.toString(singleDimensionArray.arr));
        singleDimensionArray.traverse();
        singleDimensionArray.searchArray(5);
        System.out.println(Arrays.toString(singleDimensionArray.arr));
        singleDimensionArray.deleteArray();
    }
}
