class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(String myName, int myId){ //Constructor
        id = myId;
        name = myName;
    }
    public String getName(){return name;}
    public void setName(String n){this.name = n;}
    public void setId(int i){this.id =i;}
    public int getId(){return id;}
}
public class constructors {
    public static void main(String[] args) {
        MyMainEmployee nitesh = new MyMainEmployee("Nitesh Constructor Test",12);
        nitesh.setName("Nitesh Kumar");
       // nitesh.setId(7);
       // nitesh.getName();
        System.out.println(nitesh.getId());
        System.out.println(nitesh.getName());
    }
}
