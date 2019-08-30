package lab1;

public class Rectangle {

    private double base, height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return base * height;
    }

    public double perimeter() {
        return base * 2 + height * 2;
    }

}
