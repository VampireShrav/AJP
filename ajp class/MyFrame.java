import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class MyFrame extends Frame
{
    public static void main(String[] args) 
    {
        MyFrame f = new MyFrame();
        f.setTitle("My Awt Frame");
        f.setSize(300,250);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
        });
    }
}