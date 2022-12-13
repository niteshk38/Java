class Square{
    float area;
    float perimeter;
    float dimension;
    public float getArea(){
        area = dimension * dimension;
        return area;
    }
    public float getPerimeter(){
        perimeter = 4* dimension;
        return perimeter;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("Class Square Creation");
        Square nitesh = new Square(); // Instantiating a new Employee Object
        //Setting Attributes
        nitesh.dimension = 5.6f;
        System.out.println("Perimeter = "+nitesh.getPerimeter());
        System.out.println("Area = "+nitesh.getArea());

    }
}
