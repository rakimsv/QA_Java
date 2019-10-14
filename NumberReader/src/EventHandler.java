import java.awt.event.*;
import java.awt.*;


public class EventHandler implements ActionListener {

	TextField output;
	TextField input;
	String word;
	
	public EventHandler(TextField out) {
		output=out;
	}
	
	public EventHandler(TextField in) {
		input=in;
	}

	public void actionPerformed(ActionEvent AE) {
	
		output.setText(word);
		word = Integer.parseInt(input);
		if((Integer.parseInt(input)).equals(1));
		word = "one";
}
}
