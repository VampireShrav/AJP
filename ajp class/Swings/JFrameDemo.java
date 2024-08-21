import javax.swing.*;
import java.awt.*;
class JFrameDemo extends JFrame
{
    public JFrameDemo()
    {
        Container ct = getContentPane();
        JLabel jl= new JLabel("Swing has Pluggable look and feel ");
        ct.add(jl);
        }
        public static void main(String args[])
        {
            JFrameDemo fd=new JFrameDemo();
            fd.setTitle("Demonstrating Swing");
            fd.setSize(300,300);
            fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fd.setVisible(true);
        }
}