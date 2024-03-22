package jdbc.patient;// package declaration
//built in packages declaration
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// class declaration
public class Loginjdbc {

	static Scanner scanner = new Scanner(System.in);
	//creating a Hash Map obj 
	private static Map<String, String> userDatabase = new HashMap<>();

	static {
		// Adding some dummy user data in to the Hash Map using the static 
		userDatabase.put("Bhavani", "0000");
		userDatabase.put("Niveditha", "1111");
		userDatabase.put("Nita", "2222");
	}

	public  boolean loginn() {
		

		System.out.print("Enter username: ");
		String username = scanner.nextLine();

		System.out.print("Enter password: ");
		String password = scanner.nextLine();

		if (authenticateUser(username, password)) {
			
			// Add your code here for what should happen after successful authentication
		return true;
		} else {
			
			return false;
		}
		
		
	}
	
	public static  void newuser() {

		System.out.print("Enter Your Name ");
		String name = scanner.next();

		System.out.print("Create a Password ");
		String pwd = scanner.next();
		
		userDatabase.put(name,pwd);
		
		System.out.println(userDatabase);
		
	}

	protected static boolean authenticateUser(String username, String password) {
		// Check if the provided username exists in the user database
		if (userDatabase.containsKey(username)) {
			// If the username exists, check if the provided password matches the stored password
			String storedPassword = userDatabase.get(username);
			return storedPassword.equals(password);
		}
		return false; // Username doesn't exist in the database
	}
	
}



