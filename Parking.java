import java.util.Scanner;

public class Parking {
    private static final int TOTAL_CAPACITY = 6;
    private static int parkedVehicles = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome to the parking lot!");
            System.out.println("1. Park a car");
            System.out.println("2. Unpark a car");
            System.out.println("3. Check the parking lot");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    parkVehicle();
                    break;
                case 2:
                    unparkVehicle();
                    break;
                case 3:
                    showRemainingCapacity();
                    break;
                case 4:
                    System.out.println("Exiting the parking lot!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void showRemainingCapacity() {
        int remaining = TOTAL_CAPACITY - parkedVehicles;
        System.out.println("Parked Vehicle " + parkedVehicles);
        System.out.println("Remaining Capacity " + remaining);
    }

    private static void unparkVehicle() {
        if (parkedVehicles > 0) {
            parkedVehicles--;
            System.out.println("Vehicle unparked successfully");
        } else {
            System.out.println("No vehicle to unpark");
        }
    }

    private static void parkVehicle() {
        if (parkedVehicles < TOTAL_CAPACITY) {
            parkedVehicles++;
            System.out.println("Vehicle parked");
        } else {
            System.out.println("Parking is full");
        }
    }
}
