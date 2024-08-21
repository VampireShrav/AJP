import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
public class JAppletDemo extends Applet{
   public void Start()
   {
    Container ct = getContentPane();
    JLabel jl= new JLabel("Demonstrating Swing Component in JApplet");
    ct.add(jl);
   } 
}
