package GUI;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class sliderTutorial extends JDialog
{
    private JSlider slider,slider2,slider3;
    private JLabel label,label2,label3;
    private JPanel panel;
    sliderTutorial(JFrame frame)
    {
        super(frame,"Help Window",true);
        setLayout(new GridLayout(4,1));


        slider=new JSlider(JSlider.HORIZONTAL,0,255,0);
        slider.setMajorTickSpacing(50);
        slider.setPaintTicks(true);
        add(slider);

        label=new JLabel("r: 0");
        add(label);



        event e=new event();
        slider.addChangeListener(e);

        slider2=new JSlider(JSlider.HORIZONTAL,0,255,0);
        slider2.setMajorTickSpacing(50);
        slider2.setPaintTicks(true);
        add(slider2);

        label2=new JLabel("g: 0");
        add(label2);

        event a=new event();
        slider2.addChangeListener(a);

        slider3=new JSlider(JSlider.HORIZONTAL,0,255,0);
        slider3.setMajorTickSpacing(50);
        slider3.setPaintTicks(true);
        add(slider3);

        label3=new JLabel("b: 0");
        add(label3);

        event b=new event();
        slider3.addChangeListener(b);


        panel=new JPanel();
        panel.setSize(300,100);
        panel.setBackground(Color.black);

        add(panel);

    }
    public class event implements ChangeListener
    {
        public void stateChanged(ChangeEvent e)
        {
            int value=slider.getValue();
            label.setText("r: "+value);


            int value2=slider2.getValue();
            label2.setText("g: "+value2);

            int value3=slider3.getValue();
            label3.setText("b: "+value3);

            panel.setBackground(new Color(value,value2,value3));
        }
    }
  /*  public static void main(String args[])
    {
        sliderTutorial st=new sliderTutorial();
        st.setSize(300 ,400);
        st.setVisible(true);
        st.setTitle("Slider");
        st.setDefaultCloseOperation(EXIT_ON_CLOSE);

        CHECK mainWindow.JAVA CODE BECAUSE I CALLED THERE

    }*/
}
