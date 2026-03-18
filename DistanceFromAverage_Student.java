import java.util.Scanner;

public class DistanceFromAverage_Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] values = new double[15];
        int count = 0;
        double sum = 0;

        System.out.println("Enter up to 15 values (enter 99999 to stop):");

        // TODO 1: Use a while loop to accept up to 15 values.
        // TODO 2: Stop early if the user enters 99999.
        // TODO 3: Store valid values in the array, update sum, and increase count.

        // TODO 4: If count is 0, print an error message.

        // TODO 5: Otherwise, calculate the average and display:
        //         - the count
        //         - the average
        //         - each value and its distance from the average

        while (count < 15) {

            System.out.print("Enter " + "value " + (count + 1) + ": ");
            int value = scanner.nextInt();

            if (value == 99999) {
                System.out.println("Ending program.");
                break;
            }

            for (int i = 0; i < values.length; i++) {
                values[i] = value;
            }

            sum += value;
            count++;
        }

        if (count == 0) {
            System.out.println("Error: count is zero.");
            System.exit(0);
        }

        double average = sum / count;

        System.out.println("Count: " + count);
        System.out.printf("Average: %.2f%n", average);
        
        for (int i = 0; i < values.length; i++) {
            System.out.println("Value: " + values[i]);
            System.out.printf("Distance from average: %.2f%n",  (values[i] - average));
        }
        scanner.close();
    }
}
