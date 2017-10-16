/**
 * Created by jc260799 on 16/10/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JMovieFrame extends JFrame implements ActionListener
{
    JButton nb = new JButton("Westworld");
    JButton sb = new JButton("Southpark");
    JButton eb = new JButton("Eastbound and down");
    JButton cb = new JButton("North");
    Container con = null;

    public JMovieFrame()
    {
        con = this.getContentPane();
        con.setLayout(new BorderLayout());
        con.add(nb, BorderLayout.LINE_START);
        con.add(sb, BorderLayout.PAGE_END);
        con.add(eb, BorderLayout.LINE_END);
        con.add(cb, BorderLayout.PAGE_START);
        cb.addActionListener(this);
        eb.addActionListener(this);
        sb.addActionListener(this);
        nb.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source == nb)
            nb.setText("Year:2015");
        else if(source  == sb)
            sb.setText("Year:1996");
        else if(source  == eb)
            eb.setText("Year:2009");
        else if(source  == cb)
            cb.setText("Year: 1994");
    }

    public static void main(String[] args)
    {
        JMovieFrame f = new JMovieFrame();
        f.setSize(300, 300);
        f.setVisible(true);
    }
}

