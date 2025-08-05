class circle {
    double radius = 5.0;

    //method without parameters
    void area(){
        double area =  3.14159 * radius * radius;
        System.out.println("Radius" + radius);
        System.out.println("Area of circle is " + area);
    }
}

public class AreaCircle {
    public static void main(String args[]){
        circle c = new circle();
        c.area();
    }
}
