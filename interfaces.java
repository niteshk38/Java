interface Bicycle{
    int a =45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle{
    void blowHorn() {
        System.out.println("Sound");
    }
      public void applyBrake(int decrement){
            System.out.println("Applying Brakes");
        }
      public void speedUp(int increment){
            System.out.println("Increase Speed");
        }
    }

public class interfaces{
    public static void main(String[] args) {
    AvonCycle cycle1 = new AvonCycle();
    cycle1.applyBrake(1);
        System.out.println(cycle1.a); //Can create properties in interfaces
       // Cannot modify properties in interfaces as they are final
        //  cycle1.a = 5;
    }
}
