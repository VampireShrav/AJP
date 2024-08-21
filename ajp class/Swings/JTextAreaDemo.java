import javax.swing.*;
import java.awt.*;
class JTextAreaDemo extends JFrame
{
JTextArea area;
JFrame f;
public JTextAreaDemo()
{
Container ct=getContentPane();
ct.setLayout(new FlowLayout());
area=new JTextArea("This is TextArea.\nWithout scrollbars.",20,20);
area.setBounds(10,30,300,300);
ct.add(area);
}
public static void main(String args[])
{
JTextAreaDemo fr=new JTextAreaDemo();
fr.setTitle("Demonstrating JTextArea");
fr.setSize(400,400);
fr.setVisible(true);
}
}