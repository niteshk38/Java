import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        float[] marks = {45.7f,49.5f,21.9f,56.8f,39.6f};
        float sum = 0;
        for(float element:marks){
            sum = sum+element;
        }
        System.out.println("The Value of Sum is " + sum);
    }
}
