class Circle {

    // Method with parameter
    void calculateArea(double radius) {// file name AreaCircle2.java

        double area = 3.14159 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }
}

public class Areacircle2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        // Calling method with argument
        c.calculateArea(2.5); // Pass radius as parameter
    }

}