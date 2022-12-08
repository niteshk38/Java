import java.util.Locale;

public class Main {
    static int logic(int x,int y){
        int z ;
        if(x>y){
            z = x + y;
        }
        else {
            z = (x + y)*5;
        }
        return z;

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a,b);
        System.out.println("Value of C is " +c);

        int a1 = 7;
        int b1 = 2;
        int c1;
        c1 = logic(a1,b1);
        System.out.println("Value of C1 is " +c1);

        int a2 = 2;
        int b2 = 3;
        int c2;
        c2 = logic(a2,b2);
        System.out.println("Value of C2 is " +c2);
    }
}
