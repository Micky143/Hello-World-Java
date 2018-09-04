import java.sql.*;
class Test
{
	public static void main(String args[]) throws Exception
	{
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection con = DriverManager.getConnection( 	"jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("Select * from sam");
	int rs1 = stmt.executeUpdate("delete from del where name LIKE '%a'");
	
	while(rs.next())
	{
	System.out.println(rs.getInt(1));
	//System.out.println(rs.getString(2));
	//System.out.println(rs.getFloat(3));
	}
	con.close();
	}
}	
