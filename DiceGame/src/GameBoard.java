import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    private Dice dice;
    private int WIDTH = 400;
    private int HEIGHT = 600;
    private Player p1;
    private Player p2;


    public GameBoard(Player p1, Player p2) {
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Dice Game");
        f.setSize(WIDTH, HEIGHT);
        // f.setLocation(x, y);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.repaint();
    }

    public void paintComponent(Graphics g) {

        g.setColor(Color.white);
        g.fillRect(0, 0, WIDTH, HEIGHT+22);
        g.setColor(Color.black);
        System.out.print("a"+p1.name()+"a");
        g.drawString(p1.name(), 20, 20);
        g.drawString(p2.name(), 20, 120);


    }
}
