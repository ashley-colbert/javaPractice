import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TemperatureAverage {
  int[] arr = null;

  public TemperatureAverage(int sizeOfTempArray) {
    arr = new int[sizeOfTempArray];
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

  //method to calculate the avaerage temperature
  public static double calculateAverageTemp(int[] arr) {
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("Array is null or empty");
    }
    double sum = 0;
    for (int temp : arr) {
      sum += temp;
    }
    return sum/arr.length;
  }

//method to identify all temperature about the average temperature
  public static List<Integer> findAboveAverageTemp(int[] arr) {
    double averageTemp = calculateAverageTemp(arr);
    List<Integer> aboveAverageTemp = new ArrayList<>();
    for (int temp : arr) {
      if (temp > averageTemp) {
        aboveAverageTemp.add(temp);
      }
    }
    return aboveAverageTemp;
  }

  public static void main(String[] args) {
    TemperatureAverage temperatureAverage = new TemperatureAverage(8);
    temperatureAverage.insert(0, 20);
    temperatureAverage.insert(1, 16);
    temperatureAverage.insert(2, 14);
    temperatureAverage.insert(3, 25);
    temperatureAverage.insert(4, 30);
    temperatureAverage.insert(5, 12);
    temperatureAverage.insert(6, 20);
    temperatureAverage.insert(7, 19);

    System.out.println(Arrays.toString(temperatureAverage.arr));

    double averageTemp = calculateAverageTemp(temperatureAverage.arr);
    System.out.println("Average temperature: " + averageTemp);

    List<Integer> aboveAverageTemps = findAboveAverageTemp(temperatureAverage.arr);
    System.out.println("Temperatures above average: " + aboveAverageTemps);

  }

}
