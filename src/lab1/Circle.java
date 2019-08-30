package lab1;

public class Circle {

    private double radius;

    public Circle(double radie) {
        this.radius = radie;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    public double circumference() {
        return 2 * radius * Math.PI;
    }
    
    
}
