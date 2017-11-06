package GUI;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox extends JFrame
{
    private JCheckBox cb1,cb2;
    private JLabel label1,label2,label3;
    private JTextArea textArea;
    private JButton button;
    public CheckBox()
    {
        setLayout(new GridLayout(2,2));
        label1=new JLabel("");
        add(label1);

        cb1=new JCheckBox("Click for 1");
        add(cb1);


        label2=new JLabel("");
        add(label2);

        cb2=new JCheckBox("Click for 2");
        add(cb2);

        event e=new event();
        cb1.addItemListener(e);
        cb2.addItemListener(e);

        textArea=new JTextArea("");
        add(textArea);

        label3=new JLabel("before");
        add(label3);

        button=new JButton("click me for save");

        click r=new click();
        button.addActionListener(r);
        add(button);
    }
    public class click implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            label3.setText(textArea.getText());
        }
    }
    public class event implements ItemListener
    {

        @Override
        public void itemStateChanged(ItemEvent e)
        {
            if(cb1.isSelected())
            {
                label1.setText("First");
            }
            else
            {
                label1.setText("");
            }
            if(cb2.isSelected())
            {
                label2.setText("Second");
            }
            else
            {
                label2.setText("");
            }
        }
    }
    public static void main(String args[])
    {
        CheckBox cb=new CheckBox();
        cb.setVisible(true);
        cb.setTitle("Check Box");
        cb.setSize(300,100);
        cb.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
