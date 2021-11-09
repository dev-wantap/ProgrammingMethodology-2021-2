import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {
        JLabel label = new JLabel("OK를 누르세요!");
        JButton button = new JButton("OK");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label);
        c.add(button);
        setTitle("Button");
        setSize(200, 70);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Frame();
    }
}
