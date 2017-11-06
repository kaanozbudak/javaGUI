package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class RandomGameGui extends JFrame
{
    int randomNum,guess;
    private JLabel promptLabel,resultLabel,randomLabel;
    private JButton button1;
    private JTextField textField1;
    private boolean ret=true;
    RandomGameGui()
    {
        setLayout(new FlowLayout());
        promptLabel=new JLabel("Enter a random number between 1-10");
        add(promptLabel);

        textField1=new JTextField(5);
        add(textField1);


        button1=new JButton("Guess");
        add(button1);

        resultLabel=new JLabel("");
        add(resultLabel);

        randomLabel=new JLabel("");
        add(randomLabel);


        ClickButton1 e=new ClickButton1();
        button1.addActionListener(e);


    }

    public class ClickButton1 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            randomNum=(int)(Math.random() *10+1);
            try
            {
                guess=(int)(Double.parseDouble(textField1.getText()));
                if(guess==randomNum)
                {
                    resultLabel.setText("You won the game");
                }
                else if(guess!=randomNum)
                {
                    resultLabel.setText("You lost the game");
                }
                randomLabel.setText("Random number generated was: "+randomNum);
            }
            catch (Exception ex)
            {
                randomLabel.setText("Please enter numbers only");
            }


        }
    }
    public static void main(String [] args)
    {
        RandomGameGui rg=new RandomGameGui();
        rg.setVisible(true);
        rg.setSize(300,200);
        rg.setDefaultCloseOperation(EXIT_ON_CLOSE);
        rg.setTitle("Random Number Game");
    }



}
