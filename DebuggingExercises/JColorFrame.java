/**
 * Created by jc260799 on 16/10/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.Random;

public class JColorFrame extends JFrame implements ActionListener
{
    JButton button1 = new JButton("Color");

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();


    public JColorFrame()
    {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel1, BorderLayout.PAGE_START);
        add(panel2, BorderLayout.PAGE_END);
        add(panel3, BorderLayout.LINE_START);
        add(panel4, BorderLayout.LINE_END);
        add(panel5, BorderLayout.CENTER);
        panel5.add(button1);

        button1.addActionListener(this);
        setSize(400, 200);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Random rand = new Random();

        int  n = rand.nextInt(5) + 1;
        if (n == 1){
            if (panel2.getBackground() == Color.RED)
                panel2.setBackground(Color.BLUE);
            else
                panel2.setBackground(Color.RED);
        }
        else if (n == 2){
            if (panel3.getBackground() == Color.RED)
                panel3.setBackground(Color.BLUE);
            else
                panel3.setBackground(Color.RED);
        }
        else if (n == 3){
            if (panel4.getBackground() == Color.RED)
                panel4.setBackground(Color.BLUE);
            else
                panel4.setBackground(Color.RED);
        }
        else if (n == 4){
            if (panel5.getBackground() == Color.RED)
                panel5.setBackground(Color.BLUE);
            else
                panel5.setBackground(Color.RED);
        }
        else if (n == 5){
            if (panel1.getBackground() == Color.RED)
                panel1.setBackground(Color.BLUE);
            else
                panel1.setBackground(Color.RED);
        }
    }
    public static void main(String[] args)
    {
        JColorFrame frame = new JColorFrame();
    }
}
