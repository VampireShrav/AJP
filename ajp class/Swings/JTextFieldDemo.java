import javax.swing.*;
import java.awt.*;

/*
<applet code="JTextFieldDemo" width=300 height=300>
</applet>
*/
public class JTextFieldDemo extends JApplet
{
public void start()
{
Container ct= getContentPane();
ct.setLayout(new FlowLayout());
JTextField jtfl = new JTextField("You can Type here",15);
ct.add(jtfl);
}
}