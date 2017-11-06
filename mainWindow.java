package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainWindow extends JFrame
{
    private JMenuBar menuBar;
    private JMenu help;
    private JMenuItem about,about2;
    public mainWindow()
    {
        setLayout(new FlowLayout());

        menuBar=new JMenuBar();
        add(menuBar);

        help=new JMenu("Option");
        menuBar.add(help);

        about=new JMenuItem("Colors1");
        help.add(about);

        about2=new JMenuItem("Colors2");
        help.add(about2);

        setJMenuBar(menuBar);

        event e=new event();
        about.addActionListener(e);

        event2 a=new event2();
        about2.addActionListener(a);


    }
    public class event implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            sliderTutorial gui=new sliderTutorial(mainWindow.this);
            gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            gui.setSize(300,200);
            gui.setLocation(500,500);
            gui.setVisible(true);
            gui.setTitle("Random Slider");
        }
    }
    public class event2 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            RandomColor gui=new RandomColor(mainWindow.this);
            gui.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            gui.setSize(300,200);
            gui.setLocation(500,500);
            gui.setVisible(true);
            gui.setTitle("Random Color");
        }
    }
    public static void main(String args[])
    {
        mainWindow mw=new mainWindow();
        mw.setSize(500,500);
        mw.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mw.setTitle("New Window");
        mw.setVisible(true);


    }
}
