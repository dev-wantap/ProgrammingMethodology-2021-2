import javax.swing.*;
import java.awt.*;

public class GrowingEgg extends JPanel {
    private final int NET_SIZE;
    private final int WIDER;
    private final int TALLER;
    private int width;
    private int height;

    public GrowingEgg(int size, int inc) {
        NET_SIZE = size;
        WIDER = inc * 3;
        TALLER = inc * 2;
        width = inc*3;
        height = inc * 2;

        String title = "Growing Egg";
        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(NET_SIZE, NET_SIZE+28);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 0, NET_SIZE, NET_SIZE);
        g.setColor(Color.yellow);
        g.fillOval((NET_SIZE-width)/2, (NET_SIZE-height)/2, width, height);
        width += WIDER;
        height += TALLER;
    }

    public static void main(String[] args){
        new GrowingEgg(600, 30);
    }
}
