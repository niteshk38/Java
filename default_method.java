interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void record4K(){
        System.out.println("Recording in 4K...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " +phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap()
    {
        System.out.println("Taking Snap...");
    }
    public void recordVideo(){
        System.out.println("Recording Video...");
    }
    public void record4K(){
        System.out.println("Recording 4K Video...");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks...");
        String[] networklist = {"Harry", "Nitesh","Deepak"};
        return networklist;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
    public static void main(String[] args) {
    MySmartPhone ms = new MySmartPhone();
    ms.record4K();
    String[] ar = ms.getNetworks();
    for(String item:ar){
        System.out.println(item);
    }

    }
}
