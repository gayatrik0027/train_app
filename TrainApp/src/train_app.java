import java.util.Arrays;
import java.util.Scanner;

public class train_app {

    // Method to perform Binary Search
    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            // Compare using compareTo()
            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison < 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return false; // Not found
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

        // Sort before Binary Search (important precondition)
        Arrays.sort(bogieIds);

        // Display sorted array (optional but useful)
        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // Input search key
        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        // Perform Binary Search
        boolean found = binarySearch(bogieIds, key);

        // Output result
        if (found) {
            System.out.println("Bogie ID found.");
        } else {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}