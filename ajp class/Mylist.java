import java.awt.*;
import java.awt.event.*;
class Mylist extends Frame implements ItemListener
{
    int[] msg;
    List lst;
    Mylist()
    {
        setLayout(new FlowLayout());
        lst=new List(4,true);

        lst.add("English");
        lst.add("Hindi");
        lst.add("Marathi");
        lst.add("Tamil");
        lst.add("French");

        add(lst);

        lst.addItemListener(this);

        addWindowListener(new WindowAdapter()
        {
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
        g.drawString("Select Language: ",100,200);
        msg=lst.getSelectedIndexes();
        for(int i=0;i<msg.length;i++)
        {
            String item=lst.getItem(msg[1]);
            g.drawString(item,100,220+i*20);

        }
    }
    public static void main(String args[])
    {
        Mylist ml = new Mylist();
        ml.setTitle("My List");
        ml.setSize(400,400);
        ml.setVisible(true);
    }
}