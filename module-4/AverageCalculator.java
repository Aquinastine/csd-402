import java.util.Arrays;

public class AverageCalculator {

  // Overloaded method for array average for short[]
  public static short average(short[] array) {
    int sum = 0;
    for (short value : array) {
      sum += value;
    }
    return (short) (sum / array.length);
  }

  // Overloaded method for array average for int[]
  public static int average(int[] array) {
    long sum = 0;
    for (int value : array) {
      sum += value;
    }
    return (int) (sum / array.length);
  }

  // Overloaded method for array average for long[]
  public static long average(long[] array) {
    long sum = 0;
    for (long value : array) {
      sum += value;
    }
    return sum / array.length;
  }

  // Overloaded method for array average for double[]
  public static double average(double[] array) {
    double sum = 0.0;
    for (double value : array) {
      sum += value;
    }
    return sum / array.length;
  }

  // Test program
  public static void main(String[] args) {
    short[] shortArray = {2, 4, 6};
    int[] intArray = {10, 20, 30, 40};
    long[] longArray = {100L, 200L, 300L, 400L, 500L};
    double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

    //Compute Averages
    short shortAvg = average(shortArray);
    int intAvg = average(intArray);
    long longAvg = average(longArray);
    double doubleAvg = average(doubleArray);

    System.out.println("Short Array: " + Arrays.toString(shortArray));
    System.out.println("Short Array Average = " + shortAvg + "\n");

    System.out.println("Int Array: " + Arrays.toString(intArray));
    System.out.println("Int Array Average = " + intAvg + "\n");

    System.out.println("Long Array: " + Arrays.toString(longArray));
    System.out.println("Long Array Average = " + longAvg + "\n");

    System.out.println("Double Array: " + Arrays.toString(doubleArray));
    System.out.println("Double Array Average = " + doubleAvg);
  }
}