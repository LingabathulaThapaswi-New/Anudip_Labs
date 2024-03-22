package jdbc.patient;
import java.util.*;
import java.sql.*;

public class Patientjdbc {


	Scanner sc = new Scanner(System.in);
	int Pid,Page;
	String Pfirstname,Plastname,Pgender,paddress,phnumber;
	protected Connection connection;
	
	public Patientjdbc(Scanner sc, Connection connection) {
		this.sc = sc;
		this.connection = connection;
	}

	public void addPatient() throws Exception{

		System.out.println("Enter Patient ID : ");
		Pid = sc.nextInt();
		System.out.print("Enter Patient First Name: ");
		Pfirstname = sc.next();
		System.out.print("Enter Patient Last Name: ");
		Plastname = sc.next();
		System.out.print("Enter Patient Age: ");
		Page = sc.nextInt();
		System.out.print("Enter Patient Gender: ");
		Pgender = sc.next();
		System.out.print("Enter Patient Address: ");
		paddress = sc.next();
		System.out.print("Enter Patient Ph Number: ");
		phnumber = sc.next();

		try {

			//String query = "insert into patient (Pfirstname,Plastname,Page,Pgender,paddress,phnumber) values (?,?,?,?,?,?)";
			//PreparedStatement ps = connection.prepareStatement(query); 
//			ps.setString(1, Pfirstname);
//			ps.setString(2, Plastname);
//			ps.setInt(3, Page);
//			ps.setString(4, Pgender);
//			ps.setString(5, paddress);
//			ps.setString(6, phnumber);

//			int affectedRows = ps.executeUpdate();
//			if(affectedRows>0){
//				System.out.println("Patient Added Successfully!!");
//			}else{
//				System.out.println("Failed to add Patient!!");
//			}

			Scanner sc = new Scanner(System.in);
	    	String name1 = null;
	    	String name2 = null;
	    	String email = null;
	    	System.out.println("Name1");
	    	name1 = sc.next();
	    	System.out.println("Name2");
	    	name2 = sc.next();
	    	System.out.println("Email");
	    	email = sc.next();
		}
		catch(Exception e) {
			System.out.println("Exception "+ e);
		}
		
	}
	public void viewPatient()
	{
		Statement st;
		try {
			st = connection.createStatement();

			ResultSet rs1 = st.executeQuery("SELECT p.pid, p.Pfirstname ,p.Plastname,d.dfirstname,a.Appdate,a.Apptime, r.rno, r.period FROM Appointment a\r\n"
					+ "left JOIN Patient p ON p.pid = a.pid\r\n"
					+ "join doctor d on a.did = d.did \r\n"
					+ "join room r on p.pid = r.pid ");

			while(rs1.next())
			{
				System.out.println(rs1.getInt(1)+"\t"+ rs1.getString(2)+"\t"+ rs1.getString(3)+"\t"+ rs1.getString(4)+"\t"+ rs1.getString(5)+"\t"+ rs1.getString(6)+"\t"+ rs1.getString(7)+"\t"+ rs1.getString(8));
			}
			
		} 
		catch (SQLException e) {

			System.out.println("Exception "+ e);
		}
		
		
	}


}



