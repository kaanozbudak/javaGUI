package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RandomColor extends JDialog
{
    private JPanel panel;
    public RandomColor(JFrame frame)
    {
        panel=new JPanel();

        panel.setBackground(randomColor());
        add(panel);

        eventt e =new eventt();
        panel.addMouseListener(e);


    }

    public class eventt implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e)
        {
            panel.setBackground(randomColor());
        }

        @Override
        public void mousePressed(MouseEvent e)


        {
            panel.setBackground(randomColor());
        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            panel.setBackground(randomColor());
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {
            panel.setBackground(randomColor());
        }

        @Override
        public void mouseExited(MouseEvent e)
        {

        }
    }

    public Color randomColor()
    {
        int r=(int)(Math.random()*256);
        int g=(int)(Math.random()*256);
        int b=(int)(Math.random()*256);

        return (new Color(r,g,b));
    }
   /* public static void main(String args[])
    {
        RandomColor rc=new RandomColor();
        rc.setVisible(true);
        rc.setTitle("Random Color");
        rc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        rc.setSize(500,500);

       CHECK main window I called there
    }*/
}
