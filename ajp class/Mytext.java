import java.awt.*;
import java.awt.event.*;
class Mytext extends Frame implements ActionListener
{
    TextField name,pass;
    Mytext()
    {
        setLayout(new FlowLayout());

        Label n=new Label("Name: ",Label.CENTER);
        Label p=new Label("Pass word: ",Label.CENTER);

        name=new TextField(20);
        pass = new TextField(20);

        pass.setEchoChar('*');

        name.setBackground(Color.yellow);
        name.setForeground(Color.red);
        Font f=new Font("Arial",Font.PLAIN,25);
        name.setFont(f);

        add(n);
        add(name);
        add(p);
        add(pass);

        name.addActionListener(this);
        pass.addActionListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        Graphics g=this.getGraphics();
        g.drawString("Name: "+name.getText(),10,200);
         g.drawString("Password: "+pass.getText(),10,240);
    }
    public static void main(String args[])
    {
        Mytext mt=new Mytext();
        mt.setTitle("My text field");
        mt.setSize(400,400);
        mt.setVisible(true);
    }
}