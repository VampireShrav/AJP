import java.awt.*;
import java.applet.*;
/*
<applet code="checkbox" width=500 height=500>
</applet>
*/
public class checkbox extends Applet
{
    public void init()
    {
        Button btn=new Button("Submit");
        Checkbox ch1=new Checkbox("Pizza");
        Checkbox ch2=new Checkbox("Burger");
        add(btn);
        add(ch1);
        add(ch2);
    }
}