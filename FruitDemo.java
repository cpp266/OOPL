import java.util.Scanner;

class Fruit {
    int fruitId;
    String name;
    double price;

    Fruit(int fruitId, String name, double price) {
        this.fruitId = fruitId;
        this.name = name;
        this.price = price;
    }

    void displayFruit() {
        System.out.println("Fruit ID   : " + fruitId);
        System.out.println("Fruit Name : " + name);
        System.out.println("Price      : " + price);
    }
}

class FruitDetails extends Fruit {
    String season;

    FruitDetails(int fruitId, String name, double price, String season) {
        super(fruitId, name, price); // Calling parent constructor
        this.season = season;
    }

    void displayFruitDetails() {
        displayFruit(); // Calling parent method
        System.out.println("Season     : " + season);
    }
}

public class FruitDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fruit ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Fruit Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Season: ");
        String season = sc.nextLine();

        FruitDetails f1 = new FruitDetails(id, name, price, season);

        System.out.println("\n----- FRUIT DETAILS -----");
        f1.displayFruitDetails();

        sc.close();
    }
}