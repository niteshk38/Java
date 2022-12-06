import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        float[] marks = {45.7f,49.5f,21.9f,56.8f,39.6f};
        float num = 45.9f;
        boolean isInArray = false;
        for(float element:marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
            if(isInArray){
                System.out.println("The Value is Present in Array");
            }
            else{
                System.out.println("The Value is not present in Array");
            }
        }

    }

