import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountButton  extends JButton implements ActionListener {
    private Counter counter;
    private CounterFrame frame;

    public CountButton(String name, Counter c, CounterFrame f) {
        super(name);
        counter = c;
        frame = f;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        counter.increment();
        frame.update();
    }
}
