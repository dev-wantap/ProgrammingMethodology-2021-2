import javax.swing.*;
import java.awt.*;

public class AnimationWriter extends JPanel {

    private BoxWriter box_writer;
    private BallWriter ball_writer;

    public AnimationWriter(BallWriter b, BoxWriter x, int size) {
        ball_writer = b;
        box_writer = x;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Moving Ball");
        f.setSize(size, size +28 );
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        box_writer.paintComponent(g);
        ball_writer.paintComponent(g);
    }
}
