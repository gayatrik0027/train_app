import java.util.Scanner;

public class train_app {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // Method to display array
    public static void display(int[] capacities) {
        System.out.print("Sorted Passenger Bogie Capacities: ");
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of passenger bogies: ");
        int n = sc.nextInt();

        int[] capacities = new int[n];

        // Input values
        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacities[i] = sc.nextInt();
        }

        // Perform Bubble Sort
        bubbleSort(capacities);

        // Display result
        display(capacities);

        sc.close();
    }
}