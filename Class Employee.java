class Employee{
    String name;
    int salary;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("Class Employee Creation");
        Employee nitesh = new Employee(); // Instantiating a new Employee Object
        //Setting Attributes
        nitesh.name = "Nitesh Kumar";
        nitesh.salary = 34000;
        nitesh.name = "Golu";

        int salary = nitesh.getSalary();
        System.out.println(salary);
        String name = nitesh.getName();
        System.out.println("Updated Name: " + name);
    }
}
