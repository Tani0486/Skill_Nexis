/*Basic Calculator Program
○ Perform addition, subtraction, multiplication, and division using user input*/


import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;
        int choice;

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Addition = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Subtraction = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Multiplication = " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Division = " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}





