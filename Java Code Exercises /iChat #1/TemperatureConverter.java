/*Question :
1. Write a Java program to create a simple temperature converter. The program should repeatedly prompt the user to enter a temperature in Celsius, convert it to Fahrenheit using the formula:
F = (9/5) X C + 32
Display the converted temperature in Fahrenheit. Additionally, provide a message indicating the temperature category:
If Fahrenheit is less than 32: Very cold
If Fahrenheit is between 32 and 50: Cold
If Fahrenheit is between 50 and 70: Mild
If Fahrenheit is greater than or equal to 70: Warm
After processing each temperature conversion, ask the user if they want to convert another temperature. If the user enters 'no' or 'n', exit the loop. If the user enters 'yes' or 'y', continue the loop for the next temperature.
Ensure that the program handles input validation appropriately, checking if the entered temperature is a valid numerical value.*/
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter temperature in Celsius: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            try {
                double celsius = Double.parseDouble(input);
                double fahrenheit = (9.0 / 5.0) * celsius + 32;

                System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);
                displayTemperatureCategory(fahrenheit);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numerical value.");
            }

            System.out.print("Do you want to convert another temperature? (yes/no): ");
            String continueOption = scanner.nextLine();

            if (continueOption.equalsIgnoreCase("no") || continueOption.equalsIgnoreCase("n")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
        }

        scanner.close();
    }

    private static void displayTemperatureCategory(double fahrenheit) {
        if (fahrenheit < 32) {
            System.out.println("Temperature category: Very cold");
        } else if (fahrenheit >= 32 && fahrenheit < 50) {
            System.out.println("Temperature category: Cold");
        } else if (fahrenheit >= 50 && fahrenheit < 70) {
            System.out.println("Temperature category: Mild");
        } else {
            System.out.println("Temperature category: Warm");
        }
    }
}
/*output:
C:\Users\thila\OneDrive\Desktop\Anudip_Labs>javac TemperatureConverter.java

C:\Users\thila\OneDrive\Desktop\Anudip_Labs>java TemperatureConverter
Enter temperature in Celsius: 25
Temperature in Fahrenheit: 77.00
Temperature category: Warm
Do you want to convert another temperature? (yes/no): yes
Enter temperature in Celsius: abc
Invalid input. Please enter a valid numerical value.
Do you want to convert another temperature? (yes/no): yes
Enter temperature in Celsius: -5
Temperature in Fahrenheit: 23.00
Temperature category: Very cold
Do you want to convert another temperature? (yes/no): no
Exiting the program. Goodbye!
*/

/*Suggestion : Good job! Your code looks correct and it handles input validation appropriately. However, it would be helpful to add comments to explain the purpose of each section of code. This will make your code more readable and easier for others to understand. Keep up the great work!

Your Score : 9
*/