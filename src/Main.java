import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("FIND MAX IN ARRAY.");
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array(under 20): ");
        int size = scanner.nextInt();
        while (size > 20 || size < 2 ) {
            System.out.print("Invalid! Enter again: ");
            size = scanner.nextInt();
        }
        array = new int[size];
        System.out.println("Input " + size + " elements of array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("The max value in array is " + array[array.length-1]);
    }
}
