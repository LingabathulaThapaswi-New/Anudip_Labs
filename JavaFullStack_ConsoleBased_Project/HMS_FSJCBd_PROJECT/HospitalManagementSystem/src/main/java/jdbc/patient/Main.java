package jdbc.patient;
import java.sql.DriverManager;
import java. sql.Connection;
import java.util.*;

//import authentication.Login;


public class Main {

	public static void main(String[] args) {


		try
		{
			Scanner sc = new Scanner (System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "0000");

			Patientjdbc patient = new Patientjdbc( sc,  connection) ;
			Doctorjdbc doctor = new Doctorjdbc(connection);
			Appointmentjdbc appointment = new Appointmentjdbc(connection);
			//System.out.println("Enter Credentials to login");
			//Login.user();

			while(true){
				System.out.println("Welcome to APOLLO HOSPITAL");

				System.out.println("1. Add Patient");
				System.out.println("2. View Patients");
				System.out.println("3. View Doctors");
				System.out.println("4. Book Appointment");
				System.out.println("5. Exit");
				System.out.println("6. Add Room");
				System.out.println("Enter your choice: ");

				int choice = sc.nextInt();

				switch(choice){
				case 1:
					// Add Patient
					patient.addPatient();
					System.out.println();
					break;	
				case 2:
					// View Patient
					patient.viewPatient();
					System.out.println();
					break;
				case 3:
					// View Doctor
					doctor.viewDoctor();
					System.out.println();
					break;
				case 4:
					// Add Appointment
					appointment.addAppointment();
					System.out.println();
					break;

				case 5:
					System.out.println("THANK YOU! FOR USING HOSPITAL MANAGEMENT SYSTEM!!");
					return;

				
				default:
					System.out.println("Enter valid choice!!!");
					break;
				}
			}

		}
		catch (Exception e){
			System.out.println("Exception "+e);
		}

	}
}


