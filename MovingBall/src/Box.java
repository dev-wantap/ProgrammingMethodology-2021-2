public class Box {
    private final int BOX_SIZE;

    public Box(int size) {
        BOX_SIZE = size;
    }

    public boolean isHorizontalContant(int x_pos) {
        return (x_pos <= 0 || x_pos >= BOX_SIZE);
    }

    public boolean isVerticalContant(int y_pos) {
        return (y_pos <= 0 || y_pos >= BOX_SIZE);
    }
}
