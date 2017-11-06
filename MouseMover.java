package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.AWTException;

public class MouseMover extends JFrame
{
    private JLabel label1,label2,label3,label4,errorLabel;
    private JTextField tf1,tf2,tf3,tf4;
    JButton button1;
    public MouseMover()
    {
        setLayout(new GridLayout(5,2,5,5));

        label1=new JLabel("Enter number of movements:");
        add(label1);
        tf1=new JTextField(10);
        add(tf1);

        label2=new JLabel("Enter delay between movements m/s");
        add(label2);
        tf2=new JTextField();
        add(tf2);

        label3=new JLabel("Enter screen width in pixels");
        add(label3);
        tf3=new JTextField();
        add(tf3);

        label4=new JLabel("Enter screen height in pixels");
        add(label4);
        tf4=new JTextField();
        add(tf4);

        button1=new JButton("Start");
        add(button1);

        errorLabel=new JLabel("");
        add(errorLabel);

        click e=new click();
        button1.addActionListener(e);

    }
    public class click implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                int num = (int) (Double.parseDouble(tf1.getText()));
                int delay = (int) (Double.parseDouble(tf2.getText()));
                int width = (int) (Double.parseDouble(tf3.getText()));
                int height = (int) (Double.parseDouble(tf4.getText()));

                if (num <= 0 || delay <= 0 || width <= 0 || height <= 0) {
                    errorLabel.setText("Please enter positive values");
                }
                else
                {
                    errorLabel.setText("");
                    try
                    {
                        Robot rob= new Robot();
                        for(int x=0;x<=num;x++)
                        {
                            rob.mouseMove((int)(Math.random()*width),(int)(Math.random()*height));
                            rob.delay(delay);
                        }
                    }
                    catch (AWTException ex)
                    {
                        System.exit(0);
                    }

                }

            }
            catch (Exception exx)
            {
                errorLabel.setText("Numbers ONLY");
            }
        }
    }
    public static void main(String args[])
    {
       MouseMover mm=new MouseMover();
       mm.setDefaultCloseOperation(EXIT_ON_CLOSE);
       mm.setSize(500,200);
       mm.setTitle("Mouse Mover");
       mm.setVisible(true);
       mm.pack();
    }

}
