package jdbc.patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Roomjdbc {

	int pid;
	String rno,roomtype, period;
	protected Connection connection;
	
	protected Roomjdbc(Connection connection) {
		
		this.connection = connection;
	}
	public void addRoom()
	{		
		try 
		{
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from Room");

			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the  Room No: ");
			rno = sc.next();
			System.out.println("Enter the Patient ID : ");
			pid = sc.nextInt();
			System.out.println("Enter the Type of the Room : ");
			roomtype = sc.next();
			System.out.println("Enter the Duration of the Room allocation : " );
			period = sc.next();

			String query = "insert into Room (pid,roomtype,period) values(?,?,?)";
			PreparedStatement ps = connection .prepareStatement(query);
			ps.setInt(1, pid);
			ps.setString(2, roomtype);
			ps.setString(3, period);

			int affectedRows = ps.executeUpdate();
			if(affectedRows >0)
			{
				System.out.println("Room is alloted");
			}else if (affectedRows == 0){
				System.out.println("Room is not alloted");
			}else
				System.out.println("Rooms are vacant");

			
		}catch(Exception e)
		{
			System.out.println("Exception "+ e);
		}
	}
	
}
