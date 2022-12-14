class MyEmployee{
  private int id;
  private String name;
  public String getName(){
      return name;
  }
  public void setName(String n){
  name =n;
  }

  public void setId(int i){
        id = i;
  }
  public int getId(){
      return id;
  }
}
public class custom_class {
    public static void main(String[] args) {
        MyEmployee nitesh = new MyEmployee();
        nitesh.setName("Nitesh Kumar");
        System.out.println(nitesh.getName());
    }
}
