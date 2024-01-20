package Assignment;

import java.util.Scanner;

class FlightService {
    private String name;
    private String source;
    private String destination;

    // Constructor to initialize the attributes
    public FlightService(String name, String source, String destination) {
        this.name = name;
        this.source = source;
        this.destination = destination;
    }

    // Method to print the welcome message
    public void printWelcomeMessage() {
        System.out.println("Dear " + name + ", welcome onboard with service from " + source + " to " + destination + ".");
        System.out.println("Thank you for choosing Sky Airlines. Enjoy your flight.");
    }
}

public class FlightApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        String name = scanner.nextLine();
        
        System.out.println("Enter source");
        String source = scanner.nextLine();

        System.out.println("Enter destination");
        String destination = scanner.nextLine();

        FlightService flightService = new FlightService(name, source, destination);

        flightService.printWelcomeMessage();

        scanner.close();
    }
}
