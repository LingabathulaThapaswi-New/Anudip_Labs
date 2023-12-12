/*Question:
2. Write a Java program to create a simple Body Mass Index (BMI) calculator. The program should repeatedly prompt the user to enter their age, gender, height (in meters), and mass (in kilograms). For each input, calculate the BMI using the formula:
BMI= mass/(height^2) 
The program should then display the calculated BMI along with a message indicating the BMI category according to the following scale:

BMI less than 18.5: Underweight
BMI between 18.5 and 24.9: Normal weight
BMI between 25 and 29.9: Overweight
BMI of 30 or greater: Obesity

After processing each set of inputs, ask the user if they want to calculate the BMI for another person. If the user enters 'no' or 'n', exit the loop. If the user enters 'yes' or 'y', continue the loop for the next person.
Ensure that the program handles input validation appropriately (e.g., ensuring that age, height, and mass are positive numbers).*/
import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Input: Age
            int age = getPositiveIntInput(scanner, "Enter your age: ");

            // Input: Gender
            String gender = getStringInput(scanner, "Enter your gender (male/female): ");

            // Input: Height
            double height = getPositiveDoubleInput(scanner, "Enter your height in meters: ");

            // Input: Mass (Weight)
            double mass = getPositiveDoubleInput(scanner, "Enter your mass in kilograms: ");

            // Calculate BMI
            double bmi = calculateBMI(mass, height);

            // Determine BMI category
            String bmiCategory = getBMICategory(bmi);

            // Display BMI and category
            System.out.println("\nBMI: " + bmi);
            System.out.println("BMI Category: " + bmiCategory);

            // Ask if the user wants to calculate for another person
            System.out.print("\nDo you want to calculate BMI for another person? (yes/no): ");
            String anotherPerson = scanner.next().toLowerCase();

            if (!anotherPerson.equals("yes") && !anotherPerson.equals("y")) {
                System.out.println("Exiting BMI Calculator. Goodbye!");
                break;
            }
        }

        scanner.close();
    }

    private static double calculateBMI(double mass, double height) {
        return mass / Math.pow(height, 2);
    }

    private static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    private static int getPositiveIntInput(Scanner scanner, String prompt) {
        int input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                System.out.print(prompt);
                scanner.next();
            }
            input = scanner.nextInt();
            if (input <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        } while (input <= 0);
        return input;
    }

    private static double getPositiveDoubleInput(Scanner scanner, String prompt) {
        double input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a positive number.");
                System.out.print(prompt);
                scanner.next();
            }
            input = scanner.nextDouble();
            if (input <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        } while (input <= 0);
        return input;
    }

    private static String getStringInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }
}

/*Output:
C:\Users\thila\OneDrive\Desktop\Anudip_Labs>javac BMICalculator.java

C:\Users\thila\OneDrive\Desktop\Anudip_Labs>java BMICalculator
Enter your age: 25
Enter your gender (male/female): male
Enter your height in meters: 1.75
Enter your mass in kilograms: 70

BMI: 22.857142857142858
BMI Category: Normal weight

Do you want to calculate BMI for another person? (yes/no): yes
Enter your age: 30
Enter your gender (male/female): female
Enter your height in meters: 1.60
Enter your mass in kilograms: 65

BMI: 25.390624999999996
BMI Category: Overweight

Do you want to calculate BMI for another person? (yes/no): no
Exiting BMI Calculator. Goodbye!
*/

/*Suggestion : Great job! Your code is well-structured and handles input validation appropriately. One suggestion I have is to add comments to explain the purpose of each method and the logic behind the calculations. This will make your code more readable and easier to understand for others. Keep up the good work!

Your Score : 9
*/