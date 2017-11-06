package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


import javax.swing.JFrame;

public class FirstGUI extends JFrame
{
    private JLabel label1;
    private JButton button1;
    private JTextField textField1;
    private ImageIcon image1;
    private ImageIcon image2;
    private JLabel label2;
    private JLabel label3;

    private JLabel label4;
    private JButton button4;
    private JButton button5;




    public FirstGUI()
    {
        label1=new JLabel("Hi,I am a label");
        add(label1);

        textField1=new JTextField(15);
        add(textField1);

        button1=new JButton("Hi, click me");
        add(button1);

        image1=new ImageIcon(getClass().getResource("GUI/plane.jpg"));
        label2=new JLabel(image1);
        add(label2);

        image2=new ImageIcon(getClass().getResource("GUI/earth.jpg"));
        label3=new JLabel(image2);
        add(label3);

        ButtonListener buttonListener=new ButtonListener();
        button1.addActionListener(buttonListener);

        label4=new JLabel("kaan");
        add(label4);

        setLayout(new FlowLayout());
    }

    public class ButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            textField1.setText("Kaan");
        }
    }

    public static void main(String args[])
    {

        FirstGUI window=new FirstGUI();
        window.setTitle("Kaan Ozbudak");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        window.setVisible(true);
       // window.pack();
    }

}
