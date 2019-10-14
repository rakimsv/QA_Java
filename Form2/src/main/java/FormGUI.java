import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.*;
import java.beans.EventHandler;

public class FormGUI {
	public static void main(String xyz[]) {
	Frame F = new Frame("Form Submission");
	Panel P1 = new Panel();
	GridLayout GL = new GridLayout(2,4);
	P1.setLayout(GL);

	
	Label L1;
	Label L2;
	Label L3;
	Label L4;
	
	TextField regno;
	TextField name;
	TextField marks;
	Button submit;
	
	L1 = new Label("RegNo");
	L2 = new Label("Name");
	L3 = new Label("Marks");
	L4 = new Label();
	
	submit = new Button("Submit");
	regno = new TextField(20);
	name = new TextField(20);
	marks = new TextField(20);
	
	F.add(P1,BorderLayout.CENTER);
	
	Form event = new Form(regno, name, marks);
	
	submit.addActionListener(event);
	
	P1.add(L1);
	P1.add(regno);
	P1.add(L2);
	P1.add(name);
	P1.add(L3);
	P1.add(marks);
	P1.add(L4);
	P1.add(submit);
	
	F.setSize(600,400);
	F.setVisible(true);
	
	
}
}
