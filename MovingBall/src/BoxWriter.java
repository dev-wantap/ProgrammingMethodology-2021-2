import java.awt.*;

public class BoxWriter {

    private Box box;

    public BoxWriter(Box b) {
        box = b;
    }

    public void paintComponent(Graphics g) {
        int size = box.getBOX_SIZE();
        g.setColor(Color.white);
        g.fillRect(0, 0, size, size);
    }
}
