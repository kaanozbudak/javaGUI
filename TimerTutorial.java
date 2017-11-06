package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerTutorial extends JFrame
{
    JLabel promptLabel, timerLabel;
    int counter;
    JTextField tf;
    JButton button;
    Timer timer;

    public TimerTutorial()
    {
        setLayout(new GridLayout(2,2,5,5));
        promptLabel=new JLabel("Enter seconds:",SwingConstants.CENTER);

        add(promptLabel);

        tf=new JTextField(5);
        add(tf);

        button=new JButton("Start timing");
        add(button);

        timerLabel=new JLabel("Waiting...",SwingConstants.CENTER);
        add(timerLabel);

        event e=new event();
        button.addActionListener(e);
    }
    public class event implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int count=(int)(Double.parseDouble(tf.getText()));
            timerLabel.setText("Time Left "+count);

            TimeClass tc=new TimeClass(count);
            timer=new Timer(1000,tc);
            timer.start();
        }
    }
    public class TimeClass implements ActionListener
    {
        int counter;
        public TimeClass(int counter)
        {
            this.counter=counter;
        }
        public void actionPerformed(ActionEvent tc)
        {
            button.setEnabled(false);
            counter--;
            if ((counter>=1))
            {
                timerLabel.setText("Time Left: "+counter);
            }
            else
            {
                timer.stop();
                timerLabel.setText("Done!");
                Toolkit.getDefaultToolkit().beep();
                button.setEnabled(true);
            }
        }
    }
    public static void main(String args[])
    {
        TimerTutorial tt=new TimerTutorial();
        tt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tt.setVisible(true);
        tt.setTitle("Timer");
        tt.setResizable(false);
        tt.setSize(250,100);

    }
}
