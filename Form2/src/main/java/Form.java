import java.awt.TextField;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Form implements ActionListener{

Connection C;
Statement S;
TextField regno,name,marks;


	public Form(TextField regno,TextField name,TextField marks) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			C = DriverManager.getConnection("jdbc:mysql://localhost/Nationwide","root","root");
			S = C.createStatement();
			
			this.regno=regno;
			this.name=name;
			this.marks=marks;

		}
		catch(Exception E) {
			E.printStackTrace();
		}
	}


	public void actionPerformed(ActionEvent AE) {
		try {
			S.executeUpdate("insert into school values("+regno.getText()+", '"+name.getText()+"', "+marks.getText()+")");
		}
		catch(Exception E) {
			System.out.println("insert into school values("+regno.getText()+", '"+name.getText()+"', "+marks.getText()+")");
			E.printStackTrace();
		}
	}
		
}
