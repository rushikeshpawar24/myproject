package rent2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class rentdao {
	 public void insertDetails(rentbean rt)throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentcar","root","root");
		String query="insert into car values(?,?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,rt.getName());
		ps.setString(2,rt.getCity());
		ps.setLong(3,rt.getContact());
		ps.setString(4,rt.getDays());
		ps.setString(5,rt.getDestination());
		
		ps.execute();
		con.close();
		
	}

}
