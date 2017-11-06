package GUI;

import javax.swing.*;
import java.awt.*;

public class Table extends JFrame
{
    JTable table;
    public Table()
    {
        setLayout(new FlowLayout());

        String[] columnNames={"Name","Eye Color","Gender"};
        Object[][] data={
                {"Bill","Hazel","Male"},
                {"Mary","Black","Female"},
                {"Janice","Yellow","Female"},
        };

        table=new JTable(data,columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500,50));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane=new JScrollPane(table);
        add(scrollPane);
    }
    public static void main(String args[])
    {
        Table tb=new Table();
        tb.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tb.setSize(600,200);
        tb.setVisible(true);
        tb.setTitle("Table");
    }
}
