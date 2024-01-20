package Assignment;

import java.util.Scanner;

class NumberGames {
    private int number1;
    private int number2;
    private int number3;

    // Constructor to initialize the attributes
    public NumberGames(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    // Method to find and print the smallest number
    public void findSmallestNumber() {
        int smallestNumber = (number1 <= number2) ? ((number1 <= number3) ? number1 : number3) : ((number2 <= number3) ? number2 : number3);

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("The smallest number is: " + smallestNumber);
        }
    }
}

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();

        // Create an instance of NumberGame
        NumberGames numberGame = new NumberGames(number1, number2, number3);

        // Find and print the smallest number
        numberGame.findSmallestNumber();

        // Close the scanner
        scanner.close();
    }
}
