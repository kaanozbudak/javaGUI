package GUI;

import javax.swing.*;
import java.awt.*;
public class layouts extends JFrame
{
    JButton button1,button2,button3;
    JLabel label1,label2,label3;

    public layouts()
    {
        button1=new JButton("Button1");
        button2=new JButton("Button2");
        button3=new JButton("Button3");

        label1=new JLabel("Label1");
        label2=new JLabel("Label2");
        label3=new JLabel("Label3");

        add(button1);
        add(label1);
        add(button2);
        add(label2);
        add(button3);
        add(label3);

        setLayout(new GridLayout(2,3));
    }
    public static void main(String [] args)
    {
        layouts ly=new layouts();
        ly.setVisible(true);
        ly.setTitle("LAYOUTS");
        ly.setSize(400,100);
        ly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ly.pack();
    }
}
