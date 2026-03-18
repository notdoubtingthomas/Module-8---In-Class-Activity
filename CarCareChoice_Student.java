import java.util.Scanner;

public class CarCareChoice_Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};

        // TODO 1: Use a loop to display each service on its own line.
        System.out.println("Available services: ");
        for (String service : services) {
            System.out.println(" - " + service);
        }

        boolean found = false;

        System.out.print("Enter a service: ");
        String userChoice = scanner.nextLine().toLowerCase();
    for(int i = 0; i < services.length; i++){
        if(services[i].equals(userChoice)){
            System.out.println("Service " + services[i] + ", prices $" +  prices[i]);
            found = true;
        }
    }

        // TODO 2: Use a loop to compare the user choice to each service.
        // TODO 3: If a match is found, print the service and its price.
        // TODO 4: Set found to true and stop the loop with break.

        // TODO 5: If found is still false, print an error message.
    if(!found){
        System.out.println("Invalid service");
    }
        scanner.close();
    }
}
