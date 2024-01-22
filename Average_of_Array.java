import java.util.Scanner;

public class Main {
    static float average(int[] a) {
        int sum = 0;
        float avg =0;
        for(int i=0;i<a.length;i++)
            sum += a[i];
        int m = a.length;
        avg = (float) sum/(float) m ;

        return avg;

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
        System.out.println("Average of All the Numbers in Array :"+ average(a));
    }
}
