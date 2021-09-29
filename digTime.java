import java.awt.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
public class digTime{
    static JFrame f = new JFrame("Digital Timer");
    static JPanel p = new JPanel();
    static JLabel l = new JLabel();
    static JLabel l2 = new JLabel();
    digTime()
    {
        p.add(l);
        p.add(l2);
        p.setBackground(Color.white);
        f.add(p, BorderLayout.CENTER);
        f.setSize(400,200);
        f.setVisible(true);
        l.setFont(new Font("Century Gothic",Font.PLAIN,60));
        l2.setFont(new Font("Century Gothic",Font.PLAIN,25));
        do
        {
            LocalTime today = LocalTime.now();
            LocalDate date = LocalDate.now();
            String time = today.format(DateTimeFormatter.ofPattern("HH : mm : ss"));
            String date2 = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            l.setText(time);
            l2.setText(date2);
        }
        while(true);
    }
    public static void main(String[] args) {
        new digTime();
    }


}