package jdbc.patient;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;


public class Appointmentjdbc {

	Scanner sc = new Scanner(System.in);
	int Pid,Did ;
	String Aid,Appdate,Apptime;  
	Connection connection;

	public Appointmentjdbc(Connection connection) {

		this.connection = connection;
	}

	public void addAppointment()
	{
		try
		{
			Statement st1;
			st1 = connection.createStatement();

			ResultSet rs1 = st1.executeQuery("select * from Appointment ");

			while(rs1.next())
			{
				System.out.println(rs1.getString(1)+"\t"+ rs1.getInt(2)+"\t"+ rs1.getInt(3)+"\t"+ rs1.getString(4)+"\t"+ rs1.getString(5));
			}
			System.out.println("Enter Appointment ID : ");
			Aid = sc.next();
			System.out.print("Enter Patient ID : ");
			Pid = sc.nextInt();
			System.out.print("Enter Doctor ID : ");
			Did = sc.nextInt();
			System.out.print("Enter Appointment Date : ");
			Appdate = sc.next();

			System.out.print("Enter Appointment Time : ");
			Apptime = sc.next();


			String query = "Insert into Appointment (Aid,Pid,Did,Appdate,Apptime) values (?,?,?,?,?)";
			PreparedStatement ps = connection. prepareStatement(query);
			ps.setString(1,Aid );
			ps.setInt(2,Pid );
			ps.setInt(3,Did );
			ps.setString(4,Appdate );
			ps.setString(5,Apptime );

			int affectedRows = ps.executeUpdate();
			if(affectedRows>0){
				System.out.println("Appointment is Schedulled to "+Pid);
			}else{
				System.out.println("Failed to add Appointment!!");
			}
			

		}catch(Exception e) {
			System.out.println("Exception "+e);
		}
	}
}

