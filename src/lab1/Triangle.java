package lab1;

public class Triangle {

    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        if (!isValid(side1, side2, side3)) {
            System.out.println("\nWrong triangle!");
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    private boolean isValid(double side1, double side2, double side3) {

        return (side1 + side2 > side3
                && side1 + side3 > side2
                && side2 + side3 > side1);

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }

    public double area() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter
                * (semiPerimeter - side1)
                * (semiPerimeter - side2)
                * (semiPerimeter - side3));
    }
}
