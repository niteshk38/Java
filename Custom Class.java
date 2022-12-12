class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My ID is "+ id);
        System.out.println("My name is "+name);
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our Custom Class");
        Employee nitesh = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee();
        //Setting Attributes
        nitesh.id = 12;
        nitesh.name = "Nitesh Kumar";
        john.id = 13;
        john.name = "John Tripathi";
        //Printing the Attributes
       nitesh.printDetails();
       john.printDetails();
    }
}
