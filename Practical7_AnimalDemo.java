import java.util.Scanner;

// Abstract class
abstract class Animal {
    abstract void input();
    abstract void sound();
}

// Dog class
class Dog extends Animal {
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dog name: ");
        name = sc.nextLine();
    }

    void sound() {
        System.out.println(name + " says: Woof Woof");
    }
}

// Cat class
class Cat extends Animal {
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cat name: ");
        name = sc.nextLine();
    }

    void sound() {
        System.out.println(name + " says: Meow Meow");
    }
}

// Cow class
class Cow extends Animal {
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cow name: ");
        name = sc.nextLine();
    }

    void sound() {
        System.out.println(name + " says: Moo Moo");
    }
}

// Bird class
class Bird extends Animal {
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bird name: ");
        name = sc.nextLine();
    }

    void sound() {
        System.out.println(name + " says: Chirp Chirp");
    }
}

// Main class
public class AnimalDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n===== ANIMAL SOUND SYSTEM =====");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.println("3. Cow");
            System.out.println("4. Bird");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            sc.nextLine(); // buffer clear

            Animal a = null;

            if (ch == 1) {
                a = new Dog();
            } else if (ch == 2) {
                a = new Cat();
            } else if (ch == 3) {
                a = new Cow();
            } else if (ch == 4) {
                a = new Bird();
            } else if (ch == 5) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice!");
                continue;
            }

            a.input();
            a.sound();

        } while (true);
    }
}
