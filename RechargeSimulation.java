import java.util.*;

public class RechargeSimulation {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Integer> map = new HashMap<>();

    static {
        map.put("Airtel", 0);
        map.put("VI", 0);
        map.put("Jio", 0);
    }

    public static void sims() {
        System.out.println("\nSelect Your SIM Provider:");
        System.out.println("  1. Airtel");
        System.out.println("  2. VI");
        System.out.println("  3. Jio");
        System.out.print("Enter your choice (1-3): ");
        byte simChoice = sc.nextByte();

        if (simChoice < 1 || simChoice > 3) {
            System.out.println("Invalid SIM option. Please try again.\n");
            return;
        }

        System.out.println("\nAvailable Recharge Plans:");
        System.out.println("  1. ₹399 - Unlimited Calls & 1.5GB/Day Data");
        System.out.print("Select your plan (enter 1): ");
        byte planChoice = sc.nextByte();

        if (planChoice != 1) {
            System.out.println("Invalid Plan Selection. Only one plan is available.\n");
            return;
        }

        switch (simChoice) {
            case 1:
                map.put("Airtel", map.get("Airtel") + 399);
                System.out.println("Recharge Successful! ₹399 added to Airtel.\n");
                break;
            case 2:
                map.put("VI", map.get("VI") + 399);
                System.out.println("Recharge Successful! ₹399 added to VI.\n");
                break;
            case 3:
                map.put("Jio", map.get("Jio") + 399);
                System.out.println("Recharge Successful! ₹399 added to Jio.\n");
                break;
        }
    }

    public static void balanceCheck() {
        System.out.println("\nRecharge Summary:");
        for (String sim : map.keySet()) {
            System.out.println( sim + " : ₹ " + map.get(sim));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Mobile Recharge System\n");

        while (true) {
            System.out.println("Main Menu:");
            System.out.println("  1. Mobile Recharge");
            System.out.println("  2. Check Recharge Summary");
            System.out.println("  3. Exit");
            System.out.print("Enter your choice (1-3): ");

            byte choice = sc.nextByte();
            boolean exitFlag = false;

            switch (choice) {
                case 1:
                    sims();
                    break;
                case 2:
                    balanceCheck();
                    break;
                case 3:
                    System.out.println("\nThank you for using our service. Have a great day!");
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid menu number.\n");
                    break;
            }

            if (exitFlag) {
                break;
            }
        }
    }
}
