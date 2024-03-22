package jdbc.patient;// Package Declaration
// Built-in Package Declaration
import java.sql.DriverManager;
import java. sql.Connection;
import java.util.*;

// Class Declaration
public class Mjdbc {
// Main method 
	public static void main(String[] args) {
		// create a obj for Login class
		Loginjdbc login = new Loginjdbc();
		// use while loop to repeat Login page
		while(true)
		{
			// scanner class to accept input from user
			Scanner sc = new Scanner (System.in);

			System.out.println("1. Login");
			System.out.println("2. New User --> Create an Account");
			System.out.print("Enter your choice: ");
			// switch case used for choose multiple options
			int s = sc.nextInt();
			switch(s) {
			case 1: 
				// if else statement
				// if -> checking Login is successfull 
			if (login.loginn()) {
				System.out.println("Authentication successful. Welcome!");}				
				// else ->  login failed 
			else {
				System.out.println("Authentication failed. ");
				System.out.println("Please enter valid username or password.");}
			// if login is sucessfull , calling the enter() method from same class
			// By entering this method we go to Main page of HMS
			enter();					
			break;
			// calling a newuser() method of login class  
			case 2: login.newuser(); break;
			// default case if the input does'nt match with switch datatype
			default:
				System.out.println("Enter valid Choice!!!");
				break;
			}
		}

	}
	// enter() method to view the internal operations of HMS
	public static void enter()
	{
		try
		{
			// scanner class to accept input from user
			Scanner sc = new Scanner (System.in);
			//Loading and Registering the JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// creating a connection with DataBase
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "0000");
			// creating objects for Pateint class, doctor class,Appointment class, Room class
			Patientjdbc patient = new Patientjdbc( sc,  connection) ;
			Doctorjdbc doctor = new Doctorjdbc(connection);
			Appointmentjdbc appointment = new Appointmentjdbc(connection);
			Roomjdbc room = new Roomjdbc(connection);
			// use while loop to repeat the execution until false
			while(true){
				System.out.println("Welcome to APOLLO HOSPITAL");

				System.out.println("1. Patient Details");
				System.out.println("2. View Doctors");
				System.out.println("3. Book Appointment");
				System.out.println("4. Add Room");
				System.out.println("5. Exit");

				System.out.print("Enter your choice: ");
				// switch case used for choose multiple options
				int choice = sc.nextInt();
				switch(choice){
				case 1:
					System.out.println("A. Add Patient Details");
					System.out.println("B. View Patients Details");
					String choice1 = sc.next();
					switch(choice1){
					case "A":
						// Add Patient details
						patient.addPatient();
						System.out.println();
						break;

					case "B":
						// View Patient Details
						patient.viewPatient();
						System.out.println();
						break;
					}
					break;	

				case 2:
					// View Doctor Details
					doctor.viewDoctor();
					System.out.println();
					break;
				case 3:
					// Add Appointment to the Patient
					appointment.addAppointment();
					System.out.println();
					break;

				case 4:
					// Add Room to the Patient if necessary
					room.addRoom();
					System.out.println();
					break;	

				case 5:
					System.out.println("THANK YOU! FOR USING HOSPITAL MANAGEMENT SYSTEM!!");
					// used to Exit from the Loop
					System.exit(0);
					break;
					
				default:
					System.out.println("Enter valid choice!!!");
					break;
				}
			}
		}
		// catch block to print Exception
		catch (Exception e){
			System.out.println("Exception "+e);
		}		
	}
}


