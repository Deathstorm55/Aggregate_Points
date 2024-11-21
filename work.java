import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_STUDENTS = 3;
        final int NUM_COURSES = 9;
        
        double[][] scores = new double[NUM_STUDENTS][NUM_COURSES];
        double[] averages = new double[NUM_STUDENTS];
        char[] grades = new char[NUM_STUDENTS];

        // Input student scores
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Enter scores for Student " + (i + 1) + ":");
            double total = 0;
            for (int j = 0; j < NUM_COURSES; j++) {
                System.out.print("  Course " + (j + 1) + ": ");
                scores[i][j] = scanner.nextDouble();
                total += scores[i][j];
            }
            averages[i] = total / NUM_COURSES;
            grades[i] = assignGrade(averages[i]);
        }

        // Display results
        System.out.println("\nStudent Results:");
        System.out.println("Student\tAverage\tGrade");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.printf("%d\t%.2f\t%c%n", (i + 1), averages[i], grades[i]);
        }
    }

    // Function to assign grade based on average score
    public static char assignGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }
}