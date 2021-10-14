import javax.swing.*;
import java.awt.*;

public class BounceController {

    private AnimationWriter writer;
    private MovingBall ball;

    public BounceController(MovingBall b, AnimationWriter w) {
        writer = w;
        ball = b;


    }

    public void runAnimation() {
        while (true) {
            delay(200);
            ball.move(1);
            writer.repaint();
        }

    }

    private void delay(int how_long) {
        try {
            Thread.sleep(how_long);
        } catch (InterruptedException e){
        }
    }

}
