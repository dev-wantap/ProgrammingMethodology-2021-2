import javax.swing.*;
import java.awt.*;

public class BounceController {

    private AnimationWriter writer;
    private MovingBall ball;
    private MovingBall ball2;

    public BounceController(MovingBall b, MovingBall b2, AnimationWriter w) {
        writer = w;
        ball = b;
        ball2 = b2;


    }

    public void runAnimation() {
        while (true) {
            delay(20);
            ball.move(1);
            ball2.move(1);
            writer.repaint();
            int x1 = ball.getX_pos();
            int y1 = ball.getY_pos();
            int x2 = ball2.getX_pos();
            int y2 = ball2.getY_pos();
            double x_dist = Math.pow(x1 - x2, 2.0);
            double y_dist = Math.pow(y1 - y2, 2.0);
            double distance = Math.sqrt(x_dist+y_dist);
            if (distance <= (ball.getRadius()+ ball2.getRadius())) {
                ball.changeDirectionX();
                ball.changeDirectionY();
                ball2.changeDirectionX();
                ball2.changeDirectionY();
            }
        }
    }



    private void delay(int how_long) {
        try {
            Thread.sleep(how_long);
        } catch (InterruptedException e){
        }
    }

}
