import java.util.Scanner;
public class HouseholdWater{
    
    // --------------------------------------------------------------
    //  1a) Data Types: Displays household details of the user 
    // --------------------------------------------------------------

    static void householdDetails() {
        int family_members = 4;
        double water_consumed = 590.25;
        int house_number = 12;
        char water_usage = 'H';

        System.out.println("Family Members: " + family_members);
        System.out.println("Water Consumed in liters: " + water_consumed + "L");
        System.out.println("House Number: " + house_number);
        System.out.println("Water Usage Status: " + water_usage);

    }

    // ---------------------------------------------------------------------------------------
    // 1b) If-Else Condition: Calculating water bill based on consumption of the user
    // ---------------------------------------------------------------------------------------

    static void waterBilling(Scanner sc) {
        System.out.println("Enter water consumption in liters: ");

        int consumption = sc.nextInt();
        int billAmount;

        if (consumption <= 500) {
            billAmount = 100;
        } else {
            billAmount = 200;
        }

        System.out.println("Water Bill Amount: Rs. " + billAmount);

    }

    // --------------------------------------------------------
    // 1c) Methods: Main excution of the program starts here
    // ---------------------------------------------------------

    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======Household Details======");
        householdDetails();

        System.out.println("\n======Water Billing======");
        waterBilling(sc);

        System.out.println("\n======Total Water Consumption======");
        System.out.println("Enter morning usage: ");
        int morningUsage = sc.nextInt();

        System.out.println("Enter evening usage: ");
        int eveningUsage = sc.nextInt();

        int totalConsumption = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total Water Consumption: " + totalConsumption + "L");

        sc.close();

    }

}