import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    // Default constructor
    public Product() {
        this.id = 0;
        this.name = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    // Constructor with partial initialization
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 0.0;
        this.quantity = 0;
    }

    // Constructor with full initialization
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public void display() {
        System.out.printf("%-10d %-15s %-10.2f %-10d %-10.2f\n",
                id, name, price, quantity, getTotal());
    }
}

class Cart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public double calculateSubtotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getTotal();
        }
        return total;
    }

    public double getDiscount(double total) {
        if (total > 10000) {
            return total * 0.10;
        } else if (total > 5000) {
            return total * 0.05;
        }
        return 0;
    }

    public void printInvoice() {
        System.out.println("\n========= SHOPPING INVOICE =========");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s\n",
                "ID", "Product", "Price", "Qty", "Total");

        for (Product p : products) {
            p.display();
        }

        double subtotal = calculateSubtotal();
        double discount = getDiscount(subtotal);
        double finalAmount = subtotal - discount;

        System.out.println("------------------------------------");
        System.out.println("Subtotal      : " + subtotal);
        System.out.println("Discount      : " + discount);
        System.out.println("Final Amount  : " + finalAmount);
        System.out.println("====================================");
    }
}

public class ShoppingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));

            System.out.print("Product ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product p = new Product(id, name, price, quantity);
            cart.addProduct(p);
        }

        cart.printInvoice();
        sc.close();
    }
}




