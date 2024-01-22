//Sum of all the numbers of an Array
import java.util.Scanner;

public class Main {
    static int sum(int[] a) {
        int sum = 0;
        for(int i=0;i<a.length;i++)
            sum += a[i];
        return sum;

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
        System.out.println("Sum of All the Numbers in Array :"+ sum(a));
    }
}
