import java.util.Scanner;
public class prog {
    public static void main(String[] args) {
        System.out.println("Marks and Percentage Calculator");
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Marks in Maths :");
        int a = sc.nextInt();
        System.out.println("Enter Number in Science :");
        int b = sc.nextInt();
        System.out.println("Enter Number in English :");
        int c = sc.nextInt();
        float sum = a+b+c;
        float avg = sum/3;
        System.out.println("Total Marks " + sum +"/300");
        System.out.println("Average is :" + avg);

    }
}
