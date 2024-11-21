import javax.swing.JOptionPane;

public class app {
    public static void main(String[] args) {
        // Request inputs via dialog boxes
        String name = JOptionPane.showInputDialog("Enter your name:");
        String matricNumber = JOptionPane.showInputDialog("Enter your matric number:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        int currentYear = Integer.parseInt(JOptionPane.showInputDialog("Enter the current year:"));
        
        // Calculate the birth year
        int birthYear = currentYear - age;
        
        // Display the information in a message dialog
        String message = "Hello, " + name + "!\nMatric Number: " + matricNumber + "\nYou were born in the year " + birthYear + ".";
        JOptionPane.showMessageDialog(null, message);
    }
}