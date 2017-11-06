package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MultipleEvent extends JFrame
{
    private JLabel label1;
    private JLabel label2;
    private JButton button1,button2;
    private boolean a=false;
    private boolean b=false;

    public MultipleEvent()
    {
        setLayout(new FlowLayout());
        button1=new JButton("Click for 1. text");
        add(button1);

        button2=new JButton("Click for 2. text");
        add(button2);

        label1=new JLabel("");
        add(label1);

        label2=new JLabel("");
        add(label2);


        Kaan e=new Kaan();
        button1.addActionListener(e);

        Kaan2 ev=new Kaan2();
        button2.addActionListener(ev);
    }
    public class Kaan implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
          if(a==false)
          {
              label1.setText("Text 1 here\n");
              a=true;
          }
          else if(a==true)
          {
              label1.setText("");
              a=false;
          }
        }
    }
    public class Kaan2 implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {

            if(b==false)
            {
                label2.setText("Text 2 here");
                b=true;
            }
            else if(b==true)
            {
                label2.setText("");
                b=false;
            }
        }
    }
    public static void main(String args[])
    {
        MultipleEvent me=new MultipleEvent();
        me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        me.setTitle("Multiple Event");
        me.setSize(500,200);
        me.setVisible(true);
    }

}
