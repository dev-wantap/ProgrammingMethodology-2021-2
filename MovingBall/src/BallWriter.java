import java.awt.*;

public class BallWriter {

    private MovingBall ball;
    private Color color;

    public BallWriter(MovingBall b, Color c) {
        ball = b;
        color = c;
    }

    public void paintComponent(Graphics g) {
        g.setColor(color);
        int x = ball.getX_pos();
        int y = ball.getY_pos();
        int r = ball.getRadius();
        int d = r*2;
        g.fillOval(x-r, y-r, d, d);
    }

}
