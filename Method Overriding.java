class A{
    public int a;
    public int nitesh(){
        return 4;
    }
    public void method2(){
        System.out.println("This is method2 of class A");
    }
}
class B extends A{
    public void method2(){
        System.out.println("This is method3 of class B");
    }
}
public class method_overriding {
    public static void main(String[] args) {
A a = new A();
a.method2();
        System.out.println("Output = "+a.nitesh());
        B b = new B();
        b.method2();
    }
}
