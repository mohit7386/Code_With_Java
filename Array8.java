//Print Array in Ascending Order 
import java.util.Arrays;
import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for array size
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Taking user input for array elements
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sorting the array in ascending order
        Arrays.sort(arr);

        // Displaying the sorted array
        System.out.println("Array in ascending order:");
        for (int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }

        scanner.close();
    }
}
