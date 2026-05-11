import java.util.Scanner;

interface Shape {
    void input();
    void perimeter();
    void area();
}

class Circle implements Shape {
    double r;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Enter radius: ");
        r = sc.nextDouble();
    }

    public void perimeter() {
        System.out.println("Perimeter: " + (2 * 3.14 * r));
    }

    public void area() {
        System.out.println("Area: " + (3.14 * r * r));
    }
}

class Rectangle implements Shape {
    double l, b;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Enter length: ");
        l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        b = sc.nextDouble();
    }

    public void perimeter() {
        System.out.println("Perimeter: " + (2 * (l + b)));
    }

    public void area() {
        System.out.println("Area: " + (l * b));
    }
}

class Triangle implements Shape {
    double a, b, c;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Enter side a: ");
        a = sc.nextDouble();
        System.out.print("Enter side b: ");
        b = sc.nextDouble();
        System.out.print("Enter side c: ");
        c = sc.nextDouble();
    }

    public void perimeter() {
        System.out.println("Perimeter: " + (a + b + c));
    }

    public void area() {
        System.out.println("Area: not calculated");
    }
}

public class ShapeDemo1 {

    static Shape choice(int ch) {
        if (ch == 1) return new Circle();
        else if (ch == 2) return new Rectangle();
        else return new Triangle();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n===== SHAPE CALCULATOR =====");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            ch = sc.nextInt();

            if (ch >= 1 && ch <= 3) {
                Shape s = choice(ch);
                s.input();
                s.perimeter();
                s.area();
            } 
            else if (ch == 4) {
                System.out.println("Exiting... Bye!");
            } 
            else {
                System.out.println("Invalid choice!");
            }

        } while (ch != 4);
    }
}