public class TestModel {
    public static void main(String[] args) {
        Box box = new Box(100);
        MovingBall ball = new MovingBall(50, 50, 10, box);
        while (true) {
            ball.move(1);
            System.out.println("x = " + ball.getX_pos() + "y = " + ball.getY_pos());
        }
    }
}
