// A simple Java program
public class Main {
    public static void main(String[] args) {
        // Print a welcome message to the console
        System.out.println("Welcome to Java Programming!");

        // Call a method to add two numbers
        int result = addNumbers(5, 10);
        System.out.println("The sum of 5 and 10 is: " + result);

        // Print an array of numbers
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array of numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
