package jdbc.patient;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Doctorjdbc {
	
	Scanner sc = new Scanner(System.in);
	int Did;
	String Dfirstname,Dlastname,Specialization,Email;
	private Connection connection;
	
	public Doctorjdbc( Connection connection) {
		
		this.connection = connection;
	}
	
	public void viewDoctor(){

		try
		{
			Statement st = connection.createStatement();
			
			
			ResultSet rs1 = st.executeQuery("select * from doctor");
			
			while(rs1.next())
			{
				System.out.println(rs1.getInt(1)+"\t"+ rs1.getString(2)+"\t"+ rs1.getString(3)+"\t"+ rs1.getString(4)+"\t"+rs1.getString(5));
			}
			
			
		}catch(Exception e) {
			System.out.println("Exception "+ e);
			}
		}
	}
	
	


