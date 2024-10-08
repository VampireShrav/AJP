import java.awt.*;
import java.awt.event.*;
class Myradio extends Frame implements ItemListener
{
    String msg="";
    CheckboxGroup cbg;
    Checkbox y,n;

    public Myradio()
    { 
        setLayout(new FlowLayout());

        cbg=new CheckboxGroup();
        y=new Checkbox("Yes",cbg,true);
        n=new Checkbox("No",cbg,false);

        add(y);
        add(n);

        y.addItemListener(this);
        n.addItemListener(this);

        addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
        });

    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        msg="Current Situation: ";
        msg+=cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 10, 100);

    }
    public static void main(String[] args) {
        Myradio mr=new Myradio();
        mr.setTitle("My Radio button");
        mr.setSize(400,400);
        mr.setVisible(true);
    }
    
}