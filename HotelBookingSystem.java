import java.util.Scanner;

class HotelBookingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int floors = 3;
        int rooms = 4;

        boolean[][] hotel = new boolean[floors][rooms];

        int choice;

        do {
            System.out.println("\n===== HOTEL ROOM BOOKING SYSTEM =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("\nRoom Status (A = Available, B = Booked):");

                for (int i = 0; i < floors; i++) {
                    System.out.print("Floor " + (i + 1) + ": ");

                    for (int j = 0; j < rooms; j++) {
                        if (hotel[i][j])
                            System.out.print("B ");
                        else
                            System.out.print("A ");
                    }

                    System.out.println();
                }

            } 
            else if (choice == 2) {

                System.out.print("Enter floor number (1-" + floors + "): ");
                int f = sc.nextInt();

                System.out.print("Enter room number (1-" + rooms + "): ");
                int r = sc.nextInt();

                if (f < 1 || f > floors || r < 1 || r > rooms) {
                    System.out.println("Invalid floor or room number!");
                }
                else if (hotel[f - 1][r - 1]) {
                    System.out.println("Room already booked!");
                }
                else {
                    hotel[f - 1][r - 1] = true;
                    System.out.println("Room booked successfully!");
                }

            } 
            else if (choice == 3) {
                System.out.println("Exiting system... Thank you!");
            } 
            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}