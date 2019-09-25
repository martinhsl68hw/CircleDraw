import java.awt.*;
/**
 *  The Circle class encapsulates the information describing a circle and can draw it in a
 * AWT Graphics object using AWT library methods
 * */
public class Circle {
    private int rad;
    private Point pos;
    private Color col;

    public Circle(Point initPos, Color col, int radius){
        rad=radius;
        pos=initPos;
        this.col=col;
    }

    public void draw(Graphics g) {
        // Fill
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad, rad);
    }
}