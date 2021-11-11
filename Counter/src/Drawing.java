import javax.swing.*;
import java.awt.*;

public class Drawing extends JPanel {

    private Counter counter;

    public Drawing(Counter c) {
        counter = c;
        setSize(20, 20);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0,0,200,200);
        g.setColor(Color.red);
        int x = 0, y = 0;
        for (int i = 0; i < counter.getCount(); i++) {
            g.fillOval(x, y, 20, 20);
            x += 25;
            if (x > 175) {
                x = 0; y += 25;
            }

        }
    }
}
