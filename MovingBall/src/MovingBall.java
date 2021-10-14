public class MovingBall {
    private int x_pos;
    private int y_pos;
    private int radius;
    private int x_velocity = 3;
    private int y_velocity = -2;
    private Box box;

    public MovingBall(int x, int y, int r, Box b) {
        x_pos = x;
        y_pos = y;
        radius = r;
        box = b;
    }

    public void move(int time_unit) {
        x_pos = x_pos + x_velocity*time_unit;
        y_pos = y_pos + y_velocity*time_unit;
        if (box.isHorizontalContant(x_pos)) x_velocity = -x_velocity;
        if (box.isVerticalContant(y_pos)) y_velocity = -y_velocity;
    }
    public int getX_pos() {
        return x_pos;
    }
    public int getY_pos() {
        return y_pos;
    }
    public int getRadius() {
        return radius;
    }
}
