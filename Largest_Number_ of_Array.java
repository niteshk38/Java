// Largest Number of Array
import java.util.Scanner;

public class Main {
    static int maximum(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the count of Elements in the Array: ");
        int n = s.nextInt();
        System.out.println("Enter all the " + n + " elements of the Array: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Largest number preset in the Array is :"+maximum(a,n));
    }
}
