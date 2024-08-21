import javax.swing.*;
import java.awt.*;

/*
<applet code="JLabelDemo" width=300 height=300>
</applet>
*/

public class JLabelDemo extends JApplet
{
public void start()
{
Container ct= getContentPane();
ImageIcon iil = new ImageIcon("India.gif");
JLabel jl1=new JLabel("India",iil,JLabel.CENTER);
ct.add(jl1);
}
}