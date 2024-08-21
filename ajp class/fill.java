import java.awt.*;
import java.awt.event.*;

class fill extends Frame
{
    fill()
    {
        this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
        });
    }
    public void paint(Graphics g)
    {
         g.setColor(Color.RED);
         g.fillRoundRect(30,30,250,250,30,30);
        g.setColor(Color.GREEN);
        int x[]={40,200,40,100};
        int y[]={40,40,200,200};
        int num=4;
        g.fillPolygon(x, y, num);

    }
    public static void main(String[] args) {
        fill d= new fill();
        d.setSize(400,400);
        d.setTitle("My Polygon");
        d.setVisible(true);
    }
}