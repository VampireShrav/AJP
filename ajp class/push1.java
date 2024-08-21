import java.awt.*;
import java.awt.event.*;
class push1 extends Frame implements ActionListener
{
       Button b1,b2,b3;
       push1()
       {
        this.setLayout(null);
        b1= new Button("Yellow");
        b2=new Button("Blue");
        b3=new Button("Pink");

        b1.setBounds(100, 100, 70, 40);
        b2.setBounds(100, 160, 70, 40);
        b3.setBounds(100, 220, 70, 40);

        this.add(b1);
        this.add(b2);
        this.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
        });
       }
          
          public void actionPerformed(ActionEvent ae)
         {
           String str= ae.getActionCommand();          
            if(str.equals("Yellow")) this.setBackground(Color.YELLOW);
            if(str.equals("Blue")) this.setBackground(Color.BLUE);
            if(str.equals("Pink")) this.setBackground(Color.PINK);
         }

       public static void main(String[] args) {
           push1 p=new push1();

           p.setSize(400,500);
           p.setTitle("Buttons");
           p.setVisible(true);
       }
}
