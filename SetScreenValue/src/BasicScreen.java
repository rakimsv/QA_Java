
	import java.awt.*;
	import java.awt.event.*;

public class BasicScreen{
	public static void main(String xyz[]) {
		Frame F = new Frame("Counter");
		Panel P1 = new Panel();
		TextField screen;
		Button Counter;
		screen = new TextField(20);
		Counter = new Button("Counter");
			
			P1.add(screen);
			
			F.add(P1,BorderLayout.NORTH);
			
			F.setSize(400,400);
			F.setVisible(true);
			
			screen.setText("Text.");		
			}
	}
