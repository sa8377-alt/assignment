import java.util.Scanner;

class TwoDArray {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      // Take input for rows and columns
      System.out.print("Enter number of rows: ");
      int rows = input.nextInt();

      System.out.print("Enter number of columns: ");
      int cols = input.nextInt();

      // Declare 2D array
      int[][] arr = new int[rows][cols];

      // Input elements
      System.out.println("Enter the elements of the matrix:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            arr[i][j] = input.nextInt();
         }
      }

      // Display matrix and calculate sum
      int sum = 0;
      System.out.println("\nMatrix:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            System.out.print(arr[i][j] + " ");
            sum += arr[i][j];
         }
         System.out.println();
      }

      // Display sum
      System.out.println("\nSum of all elements: " + sum);

      input.close();
   }
}