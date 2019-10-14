package main.java;
import java.awt.TextField;
import java.awt.event.*;

class ButtonClicked1 implements ActionListener{
	public void actionPerformed(ActionEvent E){
		System.out.println("A");
	}
}
class ButtonClicked2 implements ActionListener{
	public void actionPerformed(ActionEvent E){
		System.out.println("B");
	}
}
class ButtonClicked3 implements ActionListener{
	public void actionPerformed(ActionEvent E){
		System.out.println("C");
	}
}
class ButtonClicked4 implements ActionListener{
	public void actionPerformed(ActionEvent E){
		System.out.println("D");
	}
}
class ButtonClicked5 implements ActionListener{
	public void actionPerformed(ActionEvent E){
		System.out.println("E");
	}
}
class BEventHandler implements ActionListener{
		TextField Txt;
public BEventHandler(TextField X){
			Txt = X;
		}
public void actionPerformed(ActionEvent E) {
		Txt.setText("hello my Friends");
		}
	}