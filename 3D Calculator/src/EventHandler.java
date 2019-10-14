import java.awt.event.*;
import java.awt.*;
class EventHandler implements ActionListener {
TextField screen;	// global variable for the TextFied screen from the main class
String Curr = ""; 	//The current value of the numerical buttons pressed so far. Set as blank so it doesn't start with a null value.
int No1,No2,Result;
String Sym,PrintResult;

	public EventHandler(TextField scr) { 			//SUPER MARIO
		screen = scr; 	//screen is set to the value of scr. Set as a local variable because
	}
	
	public void actionPerformed(ActionEvent AE) {
		screen.setText(Curr+((Button)AE.getSource()).getLabel()); 	//This sets the value of the screen as the numbers pressed so far, plus the label of the button
		if(((Button)AE.getSource()).getLabel().equals("+")) {		//If the value of the button just pressed equals + symbol
			screen.setText("");										//then sent the text to blank
			No1 = Integer.parseInt(Curr);
			Sym = "+";
			Curr = "";												//then set the current string value to blank
			screen.setText(((Button)AE.getSource()).getLabel());	//then set the screen text to the label of the button just pressed.
		}
		else if(((Button)AE.getSource()).getLabel().equals("-")) {
			screen.setText("");
			No1 = Integer.parseInt(Curr);
			Sym = "-";
			Curr = "";
			screen.setText(((Button)AE.getSource()).getLabel());
		}
		else if(((Button)AE.getSource()).getLabel().equals("x")) {
			screen.setText("");
			No1 = Integer.parseInt(Curr);
			Sym = "x";
			Curr = "";
			screen.setText(((Button)AE.getSource()).getLabel());
		}
		else if(((Button)AE.getSource()).getLabel().equals("/")) {
			screen.setText("");
			No1 = Integer.parseInt(Curr);
			Sym = "/";
			Curr = "";
			screen.setText(((Button)AE.getSource()).getLabel());
		}
		else if(((Button)AE.getSource()).getLabel().equals("=")) {
			if(Sym.equals("+")) {
				No2 = Integer.parseInt(Curr);
				Result = No1+No2;
				PrintResult = Integer.toString(Result);
				screen.setText(PrintResult);
				Curr = "";
			}
			else if(Sym.equals("-")) {
				No2 = Integer.parseInt(Curr);
				Result = No1-No2;
				PrintResult = Integer.toString(Result);
				screen.setText(PrintResult);
				Curr = "";
			}
			else if(Sym.equals("x")) {
				No2 = Integer.parseInt(Curr);
				Result = No1*No2;
				PrintResult = Integer.toString(Result);
				screen.setText(PrintResult);
				Curr = "";
			}
			else if(Sym.equals("/")) {
				No2 = Integer.parseInt(Curr);
				Result = No1/No2;
				PrintResult = Integer.toString(Result);
				screen.setText(PrintResult);
				Curr = "";
			}
		}
		else if(((Button)AE.getSource()).getLabel().equals("C")) {
			No1 = 0;
			No2 = 0;
			Curr = "";
			Sym = "";
			Result = 0;
			screen.setText("");
		}

		else {
			Curr = screen.getText();								//Otherwise, leave the value of the numbers showing on screen in the Curr variable
		}
		
		if(Curr.equals("+")) {										//If the current string on screen shows a symbol, clear the screen.
			screen.setText("");										
			Curr = "";
			screen.setText(((Button)AE.getSource()).getLabel());	
		}
		else if(Curr.equals("-")) {										
			screen.setText("");
			Curr = "";
			screen.setText(((Button)AE.getSource()).getLabel());
		}
		else if(Curr.equals("x")) {
			screen.setText("");
			Curr = "";
			screen.setText(((Button)AE.getSource()).getLabel());
		}
		else if(Curr.equals("/")) {
			screen.setText("");
			Curr = "";
			screen.setText(((Button)AE.getSource()).getLabel());
		}
	}
}
