import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Independent{

	public static void main() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection C = DriverManager.getConnection("jdbc:mysql://localhost/Nationwide","root","root");
			Statement S = C.createStatement();
		
			ResultSet rs = S.executeQuery("SELECT * from School");
			
			while(rs.next()); {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
		}
			catch(Exception E4) {
				System.out.println(E4.toString());
			}
	}
}
