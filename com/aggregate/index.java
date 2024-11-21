import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Request and capture inputs
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your matric number: ");
        String matricNumber = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        
        // Calculate the birth year
        int birthYear = currentYear - age;
        
        // Display the information
        System.out.println("\nHello, " + name + "!");
        System.out.println("Matric Number: " + matricNumber);
        System.out.println("You were born in the year " + birthYear + ".");
        
        scanner.close();
    }
}