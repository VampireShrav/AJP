import java.awt.*;
import java.awt.event.*;
class draw1 extends Frame
{
    draw1()
    {
        this.addWindowListener(new WindowAdapter()
         {
        public static void main(String[] args) 
            {
            System.exit(0);
            }
         });
    }

public void paint(Graphics g)
{
   
}
public static void main(String[] args) {
    draw1 d= new draw1();
    d.setSize(400,400);
    d.setTitle("My Drawing");
    d.setVisible(false);
    
}
}