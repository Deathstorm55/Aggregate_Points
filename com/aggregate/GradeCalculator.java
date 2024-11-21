import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their score
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        // Determine the grade
        if (score >= 70) {
            System.out.println("Grade: A");
        } else if (score >= 60) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else if (score >= 45) {
            System.out.println("Grade: D");
        } else if (score >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        // Close the scanner
        scanner.close();
    }
}