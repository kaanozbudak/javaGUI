package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class beeper extends JFrame
{
    JButton button1;
    JLabel label1;
    int counter=0,x=0;
    String s;
    public beeper()
    {
        button1=new JButton("Click me");
        add(button1);

        label1=new JLabel("");
        add(label1);

        click e=new click();
        button1.addActionListener(e);

        setLayout(new FlowLayout());
    }
    public class click implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Toolkit.getDefaultToolkit().beep();
            counter++;
            if(x==0)
            {
                s="time";
            }
            else if(x==1)
            {
                s="times";
            }
            label1.setText("You have clicked "+counter+" "+s);
            x=1;
        }
    }

    public static void main(String args[])
    {
        beeper bp=new beeper();
        bp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        bp.setTitle("BEEPER");
        bp.setSize(500,500);
        bp.setVisible(true);
    }
}
