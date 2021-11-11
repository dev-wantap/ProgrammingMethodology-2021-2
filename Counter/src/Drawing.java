import javax.swing.*;
import java.awt.*;

public class Drawing extends JPanel {

    private Counter counter;

    public Drawing(Counter c) {
        counter = c;
        setSize(20, 20);
    }

    public void paintComponent(Graphics g) {

    }
}
