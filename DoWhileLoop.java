/*Live Assignment-1:20 Marks|16/11/2023
BATCH: ANP_C6339
Lingabathula Thapaswi[AF0339471]

 Assignment-1:
 Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the opertion again. If so, the loop should repeat, otherwise it should terminate.*/

  import java.util.Scanner; 

  public class DoWhileLoop {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int num1, num2, sum = 0;
      char choice;

      do {  
        System.out.print("Enter first number: ");  
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        sum = num1 + num2;  
        System.out.println("The sum is: " + sum);

        System.out.print("Do you want to continue (Y/N)? ");
        choice = sc.next().charAt(0);
      } while(choice == 'Y' || choice == 'y');

      System.out.println("The final sum is: " + sum);
    }
  }

/*Output:
C:\Users\thila\OneDrive\Desktop\Anudip_Labs>javac DoWhileLoop.java

C:\Users\thila\OneDrive\Desktop\Anudip_Labs>java DoWhileLoop
Enter first number: 5
Enter second number: 10
The sum is: 15
Do you want to continue (Y/N)? Y
Enter first number: 2
Enter second number: 2
The sum is: 4
Do you want to continue (Y/N)? y
Enter first number: 0
Enter second number: -1
The sum is: -1
Do you want to continue (Y/N)? y
Enter first number: -89
Enter second number: 98
The sum is: 9
Do you want to continue (Y/N)? n
The final sum is: 9
*/