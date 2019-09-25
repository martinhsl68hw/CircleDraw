import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private Frame f;
    private Circle circle;
    public Drawing(){
        f = new Frame("My window"); 	// Instantiates the Frame
        f.add(this);			// Adds the Canvas to the Frame
        f.setLayout(null);			// Stops the frame from trying to layout contents
        f.setSize(400, 400);		// Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {	// Closes the frame if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setBackground(Color.WHITE);
        setSize(400, 400);
        circle=new Circle(new Point(200,200),new Color(0x992266),80);
    }
    public void paint(Graphics g){
        circle.draw(g);
    }
}
