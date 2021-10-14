import java.awt.*;

public class BounceTheBall {
    public static void main(String[] args) {
        final int SIZE = 200;
        Box box = new Box(SIZE);
        MovingBall ball = new MovingBall(80, 60, 10, box);
        MovingBall ball2 = new MovingBall(160, 140, 10, box);
        BallWriter ball_writer = new BallWriter(ball, Color.red);
        BallWriter ball_writer2 = new BallWriter(ball2, Color.blue);
        BoxWriter box_writer = new BoxWriter(box);
        AnimationWriter animation_writer = new AnimationWriter(ball_writer, ball_writer2, box_writer, SIZE);
        new BounceController(ball, ball2, animation_writer).runAnimation();
    }
}
