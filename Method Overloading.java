import java.util.Locale;

public class Main {
    static void foo(){
        System.out.println("Good Morning Bro!!!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+ a + " bro");
    }
    static void foo(int x,int y){
        int z = x + y ;
        System.out.println("Sum = "+ z);
    }
    public static void main(String[] args) {
foo();
foo(3000);
foo(5,6);
    }
}



