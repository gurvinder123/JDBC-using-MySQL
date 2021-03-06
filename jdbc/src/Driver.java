import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Driver {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/abc";
		String user = "root";
		String password = "student";
		Connection myConn = null;
		Statement myStmt = null;

try {
	myConn = DriverManager.getConnection(url, user, password);
	
	myStmt = myConn.createStatement();

	String sql = "insert into employees " + " (last_name, first_name, email)"
				+ " values ('Brown', 'David', 'david.brown@foo.com')";
	myStmt.executeUpdate(sql);
	System.out.println("Insert complete.");
} 

catch (Exception exc) {
	exc.printStackTrace();
}

finally {
	if (myStmt != null) {
		myStmt.close();
	}
	if (myConn != null) {
		myConn.close();
	}
}
}
} 