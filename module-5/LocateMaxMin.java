public class LocateMaxMin {

  // Shared helper: true = largest, false = smallest
  private static int[] locateExtrema(double[][] arrayParam, boolean findMax) {
    //set an array for the first address, because that one will be the 
    //smallest initially.
    int[] location = {0, 0};

    //loop through the first dimension (rows) and second dimension (cols)
    for (int row = 0; row < arrayParam.length; row++) {
      for (int col = 0; col < arrayParam[row].length; col++) {
        if (findMax && 
        arrayParam[row][col] > arrayParam[location[0]][location[1]]) {
          location[0] = row;
          location[1] = col;
        } else if (!findMax && 
        arrayParam[row][col] < arrayParam[location[0]][location[1]]) {
          location[0] = row;
          location[1] = col;
        }
      }
    }
    return location;
  }

  private static double[][] toDouble(int[][] intArray) {
  double[][] doubleArray = new double[intArray.length][];
  for (int i = 0; i < intArray.length; i++) {
    doubleArray[i] = new double[intArray[i].length];
    for (int j = 0; j < intArray[i].length; j++) {
      doubleArray[i][j] = intArray[i][j]; // widening conversion
    }
  }
  return doubleArray;
  }

  //Locate the largest value in an 2 dimensional array typed as double
  public static int [ ] locateLargest (double [ ][ ] arrayParam){
    return locateExtrema(arrayParam, true);
    } 
  
  //Locate the largest value in an 2 dimensional array typed as int
  public static int [ ] locateLargest (int [ ][ ] arrayParam){
    
    return locateExtrema(toDouble(arrayParam), true); 
    }

  //Locate the smallest value in an 2 dimensional array typed as double  
  public static int [ ] locateSmallest (double [ ][ ] arrayParam){
    return locateExtrema(arrayParam, false);  

  }
  public static int [ ] locateSmallest (int [ ][ ] arrayParam){
    return locateExtrema(toDouble(arrayParam), false);  

  }
  

  public static void main(String[] args) {
    double[][] doubleArray = {
          {1.2, 3.5, 2.2},
          {4.1, 2.2, 5.7},
          {3.3, 1.1, 0.5}
      };
      
    double[][] doubleArray2 = {
          {-1.2, -3.5, -2.2},
          {-4.1, -2.2, -5.7},
          {-3.3, -1.1, -0.5}
      };


      int[][] intArray = {
          {2, 5, 1},
          {7, 3, 4},
          {6, 8, 0}
      };

      int[][] intArray2 = {
          {-2, -5, -1},
          {-7, -3, -4},
          {-6, -8, 0}
      };

      int[] loc1 = locateLargest(doubleArray);
      System.out.printf("Largest in double array at: [%d][%d]%n", loc1[0], loc1[1]);

      int[] loc2 = locateLargest(intArray);
      System.out.printf("Largest in int array at: [%d][%d]%n", loc2[0], loc2[1]);
      
      int[] loc3 = locateLargest(doubleArray2);
      System.out.printf("Largest in double array2 at: [%d][%d]%n", loc3[0], loc3[1]);
      
      int[] loc4 = locateLargest(intArray2);
      System.out.printf("Largest in int array2 at: [%d][%d]%n", loc4[0], loc4[1]);

      loc1 = locateSmallest(doubleArray);
      System.out.printf("Smallest in double array at: [%d][%d]%n", loc1[0], loc1[1]);

      loc2 = locateSmallest(intArray);
      System.out.printf("Smallest in int array at: [%d][%d]%n", loc2[0], loc2[1]);
      
      loc3 = locateSmallest(doubleArray2);
      System.out.printf("Smallest in double array2 at: [%d][%d]%n", loc3[0], loc3[1]);
      
      loc4 = locateSmallest(intArray2);
      System.out.printf("Smallest in int array2 at: [%d][%d]%n", loc4[0], loc4[1]);
   }
}
