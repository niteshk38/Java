class Phone {
    public void showTime(){
        System.out.println("Time is 8:00 am");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}
    class Smartphone extends Phone{
    public void music(){
        System.out.println("Playing Music");
    }
    @Override
        public void on(){
            System.out.println("Turning on SmartPhone");
        }
        }
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        /*Phone obj = new Phone();
        obj.name();
        Smartphone smobj = new Smartphone();
        smobj.name();
        smobj.greet();
        */
        Phone obj = new Smartphone();
        obj.showTime();
        obj.on();
    }
}
