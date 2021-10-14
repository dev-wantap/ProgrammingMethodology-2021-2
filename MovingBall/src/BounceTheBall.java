import java.awt.*;

public class BounceTheBall {
    public static void main(String[] args) {
        final int SIZE = 200;
        Box box = new Box(SIZE);
        MovingBall ball = new MovingBall(80, 60, 6, box);
        BallWriter ball_writer = new BallWriter(ball, Color.red);
        BoxWriter box_writer = new BoxWriter(box);
        AnimationWriter animation_writer = new AnimationWriter(ball_writer, box_writer, SIZE);
        new BounceController(ball, animation_writer).runAnimation();
    }
}
