package GUI;
import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
public class Frame
{
    public Frame()
    {
        new Frame();
    }
    public static void main(String args[])
    {
        JFrame gui=new JFrame();
        gui.setTitle("Paint Program");
        gui.setSize(400,400);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        Container pane=gui.getContentPane();
        pane.setLayout(new GridLayout(1,1));
        panel.setBackground(Color.yellow);

        pane.add(panel);
        gui.setVisible(true);
    }
}

