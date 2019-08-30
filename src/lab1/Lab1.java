package lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1 {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        boolean newCalculation = true;

        while (newCalculation) {
            try {
                System.out.println("Which geometric figure do you want to calculate?"
                        + "\n1. Circle\n2. Rectangle\n3. Triangle\n0. Exit");

                int answer = sc.nextInt();
                while (answer < 0 || answer > 3) {
                    System.out.println("Wrong input! Try again");
                    answer = sc.nextInt();
                }

                switch (answer) {
                    case 1:
                        circle();
                        break;
                    case 2:
                        rectangle();
                        break;
                    case 3:
                        triangle();
                        break;
                    case 0:
                        newCalculation = false;
                        break;
                    default:
                        System.out.println("Wrong choice! Try again");
                        break;
                }
                System.out.println();
                if (newCalculation) {
                    System.out.println("Do you want to do a new calculation?"
                            + "\n1. Yes\n2. No");
                    answer = sc.nextInt();
                    while (answer < 1 || answer > 2) {
                        System.out.println("Wrong input! Try again");
                        answer = sc.nextInt();
                    }
                    if (answer == 2) {
                        newCalculation = false;
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Wrong input! Try again from the beginning\n");
                sc.nextLine();
            }

        }

    }

    private static void triangle() {
        int answer;
        System.out.println("Triangle. What would you like to calculate?"
                + "\n1. Area\n2. Perimeter\n3. Both");
        answer = sc.nextInt();
        System.out.println("Enter side 1:");
        int side1 = sc.nextInt();
        System.out.println("Enter side 2:");
        int side2 = sc.nextInt();
        System.out.println("Enter side 3:");
        int side3 = sc.nextInt();
        Triangle t = new Triangle(side1, side2, side3);
        if (t.perimeter()==0)
            return;
        switch (answer) {
            case 1:
                System.out.println("Triangle has an area of " + t.area());
                break;
            case 2:
                System.out.println("Triangle has a perimeter of " + t.perimeter());
                break;
            default:
                System.out.println("Triangle has an area of " + t.area()
                        + "\nand a perimeter of " + t.perimeter());
                break;
        }
    }

    private static void rectangle() {
        int answer;
        System.out.println("Rectangle. What would you like to calculate?"
                + "\n1. Area\n2. Perimeter\n3. Both");
        answer = sc.nextInt();
        System.out.println("Enter base:");
        int base = sc.nextInt();
        System.out.println("Enter height:");
        int height = sc.nextInt();
        Rectangle r = new Rectangle(base, height);
        switch (answer) {
            case 1:
                System.out.println("Rectangle has an area of " + r.area());
                break;
            case 2:
                System.out.println("Rectangle has a perimeter of " + r.perimeter());
                break;
            default:
                System.out.println("Rectangle with has an area of " + r.area()
                        + "\nand a perimeter of " + r.perimeter());
                break;
        }
    }

    private static void circle() {
        int answer;
        System.out.println("Circle. What would you like to calculate?"
                + "\n1. Area\n2. Circumference\n3. Both");
        answer = sc.nextInt();
        System.out.println("Enter radius:");
        int radius = sc.nextInt();
        Circle c = new Circle(radius);
        switch (answer) {
            case 1:
                System.out.println("Circle has an area of " + c.area());
                break;
            case 2:
                System.out.println("Circle has a circumference of " + c.circumference());
                break;
            default:
                System.out.println("Circle has an area of " + c.area()
                        + "\nand a circumference of " + c.circumference());
                break;
        }
    }

}
