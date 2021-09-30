import javax.swing.*;
import java.awt.*;

public class GrowingEgg extends JPanel {
    private final int NET_SIZE;
    private int width = 60;
    private int height = 40;

    public GrowingEgg(int size) {
        NET_SIZE = size;
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
        g.drawOval((NET_SIZE-width)/2, (NET_SIZE-height)/2, width, height);
        g.fillOval((NET_SIZE-width)/2, (NET_SIZE-height)/2, width, height);
        width += 60;
        height += 40;
    }

    public static void main(String[] args){
        new GrowingEgg(600);
    }
}
