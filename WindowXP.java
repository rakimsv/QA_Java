import java.awt.*;

class WindowXP{
    public static void main(String xyz[]){
    Button B1,B2,B3,B4,B5;
    B1 = new Button("Click1");
    B2 = new Button("Click2");
    B3 = new Button("Click3");
    B4 = new Button("Click4");
    B5 = new Button("Click5");
       
    Frame F = new Frame("Nationwide");
    F.add(B1 ,BorderLayout.NORTH);
    F.add(B2 ,BorderLayout.EAST);
    F.add(B3 ,BorderLayout.WEST);
    F.add(B5);

    F.setSize(400,400);
    F.setVisible(true);

    ButtonClicked BEvent = new ButtonClicked();
    B5.addActionListener(BEvent);
    }
}