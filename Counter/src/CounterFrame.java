import javax.swing.*;
import java.awt.*;


public class CounterFrame extends JFrame {

    private Counter counter;
    private JLabel label;
    private Drawing drawing;

    public CounterFrame(Counter c, Drawing d) {
        counter = c;
        drawing = d;


        JButton button = new CountButton("OK", counter, this);
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JPanel p1 = new JPanel(new FlowLayout());
        label = new JLabel("count = " + counter.getCount());
        p1.add(label);

        JPanel p2 = new JPanel(new FlowLayout());
        JButton b1 = new CountButton("OK", counter, this);
        JButton b2 = new ExitButton("EXIT");
        p2.add(b1);
        p2.add(b2);

        cp.add(p1, BorderLayout.NORTH);
        cp.add(drawing, BorderLayout.CENTER);
        cp.add(p2, BorderLayout.SOUTH);

        setTitle("Counter");
        setSize(200, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void update() {
        label.setText("count = " + counter.getCount());
    }


}