import java.util.Scanner;

public class train_app {

    // Method to perform Linear Search
    public static int linearSearch(String[] bogieIds, String key) {

        // Traverse array sequentially
        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equalsIgnoreCase (optional improvement)
            if (bogieIds[i].equalsIgnoreCase(key)) {
                return i; // return index when found
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of bogies
        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        // Input bogie IDs
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        // Input search key
        System.out.print("Enter bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Perform search
        int result = linearSearch(bogieIds, searchKey);

        // Display result
        if (result != -1) {
            System.out.println("Bogie ID found at position: " + result);
        } else {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}