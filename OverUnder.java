package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OverUnder extends JFrame
{
    int round=1;
    int firstRand,rand2,rand3,rand4;
    JLabel firstLabel,secondLabel, thirdLabel,fourthLabel,or,winOrLose;
    JButton higher,lower;
    JMenuBar menuBar;
    JMenu file;
    JMenuItem reset,exit;

    public OverUnder()
    {
        firstRand=(int)(Math.random()*20+1);

        Font font=new Font("Serif",Font.BOLD,16);

        setLayout(new GridLayout(3,1));

        menuBar=new JMenuBar();
        setJMenuBar(menuBar);

        file=new JMenu("File");
        menuBar.add(file);

        reset=new JMenuItem("Restart");
        file.add(reset);

        exit=new JMenuItem("Quit");
        file.add(exit);

        systemClose s=new systemClose();
        exit.addActionListener(s);

        restartGame r=new restartGame();
        reset.addActionListener(r);

        Container pane=this.getContentPane();

        //top panel setup

        JPanel top=new JPanel();
        top.setLayout(new GridLayout(1,4));

        firstLabel=new JLabel(""+firstRand,SwingConstants.CENTER);
        firstLabel.setFont(font);
        top.add(firstLabel);

        secondLabel=new JLabel("",SwingConstants.CENTER);
        secondLabel.setFont(font);
        top.add(secondLabel);

        thirdLabel=new JLabel("",SwingConstants.CENTER);
        thirdLabel.setFont(font);
        top.add(thirdLabel);

        fourthLabel=new JLabel("",SwingConstants.CENTER);
        fourthLabel.setFont(font);
        top.add(fourthLabel);
        pane.add(top);

        //middle panel setup

        JPanel middle=new JPanel();
        middle.setLayout(new GridLayout(1,3));

        higher=new JButton("Higher");
        middle.add(higher);

        or=new JLabel("OR",SwingConstants.CENTER);
        middle.add(or);

        lower=new JButton("Lower");
        middle.add(lower);
        pane.add(middle);

        event e=new event();
        higher.addActionListener(e);
        lower.addActionListener(e);

        //bottom panel
        JPanel bottom=new JPanel();
        bottom.setLayout(new GridLayout(1,1));

        winOrLose=new JLabel("",SwingConstants.CENTER);
        winOrLose.setFont(font);
        bottom.add(winOrLose);
        pane.add(bottom);
    }
    public class event implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String option=e.getActionCommand();
            if(round==1)
            {
                rand2=(int)(Math.random()*20+1);
                secondLabel.setText(""+rand2);
                if(rand2>firstRand && option.equals("Higher"))
                {
                    winOrLose.setText("Right,2 more!");
                }
                else if(rand2<firstRand&&option.equals("Higher"))
                {
                    winOrLose.setText("You lost! Try again!");
                    lower.setEnabled(false);
                    higher.setEnabled(false);
                }
                else if(rand2>firstRand && option.equals("Lower"))
                {
                    winOrLose.setText("You lost! Try again!");
                    lower.setEnabled(false);
                    higher.setEnabled(false);
                }
                else if(rand2<firstRand&&option.equals("Lower"))
                {
                    winOrLose.setText("Right,2 more!");
                }
               round =2;
            }
            else if(round==2)
            {
                rand3=(int)(Math.random()*20+1);
                thirdLabel.setText(""+rand3);
                if(rand3>rand2&&option.equals("Higher"))
                {
                    winOrLose.setText("Right,1 more!");
                }
                else if(rand3<rand2 && option.equals("Lower"))
                {
                    winOrLose.setText("Right,1 more");
                }
                else if(rand3>rand2 && option.equals("Lower"))
                {
                    winOrLose.setText("You lost! Try again!");
                    lower.setEnabled(false);
                    higher.setEnabled(false);
                }
                else if(rand3<rand2 && option.equals("Lower"))
                {
                    winOrLose.setText("You lost!Try Again");
                    lower.setEnabled(false);
                    higher.setEnabled(false);
                }
                round=3;
            }
            else if(round==3)
            {
               rand4=(int)(Math.random()*20+1);
               fourthLabel.setText(""+rand4);
                if(rand4>rand3&&option.equals("Higher"))
                {
                    winOrLose.setText("You won the game");
                }
                else if(rand4<rand3 && option.equals("Higher"))
                {
                    winOrLose.setText("You lost! Try again!");
                    lower.setEnabled(false);
                    higher.setEnabled(false);
                }
                else if(rand4>rand3 && option.equals("Lower"))
                {
                    winOrLose.setText("You lost! Try Again!");
                    lower.setEnabled(false);
                    higher.setEnabled(false);
                }
                else if(rand4<rand3 && option.equals("Lower"))
                {
                    winOrLose.setText("You won the game!");
                }
            }
        }
    }
    public class systemClose implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    public class restartGame implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            firstRand=(int)(Math.random()*20+1);
            round=1;
            higher.setEnabled(true);
            lower.setEnabled(true);
            firstLabel.setText(""+firstRand);
            secondLabel.setText("");
            thirdLabel.setText("");
            fourthLabel.setText("");
            winOrLose.setText("");
        }
    }
    public static void main(String args[])
    {
        OverUnder ou=new OverUnder();
        ou.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ou.setVisible(true);
        ou.setSize(300,150);
        ou.setTitle("KAAN OZBUDAK");
        ou.setResizable(false);
        ou.setLocation(700,500);

    }
}
