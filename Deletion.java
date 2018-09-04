import java.sql.*;

class Deletion
{
	public static void main(String args[]) throws Exception
	{

	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "root");

	Statement stmt= con.createStatement();

	/*int norows = stmt.executeUpdate("delete from del where no>1000");
	System.out.println("No. of rows are affected="+norows);
	
	int norow = stmt.executeUpdate("insert into del(no) values (777)");
	System.out.println("No. of rows are affected="+norow);

	norow = stmt.executeUpdate("insert into del values (778, 'Suraj')");
	System.out.println("No. of rows are affected="+norow);*/
	int norows = stmt.executeUpdate("update del set name='puja' where no=777");
	System.out.println("No. of rows are affected="+norows);
	con.close();
}
}
