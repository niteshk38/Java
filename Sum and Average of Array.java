import java.util.Locale;

public class Main {
    public static void main(String[] args) {
         float [] marks = {45.6f,78.2f,79.4f,59.8f,92.5f};
         float sum = 0;
         float avg = 0;
         for(float element : marks){
             sum = sum + element;
         }
         avg = sum / marks.length;
        System.out.println("The Value od Sum is " +sum);
        System.out.println("The Average is "+avg);
        }
    }

