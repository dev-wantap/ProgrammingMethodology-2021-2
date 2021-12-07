import java.awt.event.*;
import javax.swing.*;

public class StartButton extends JButton implements ActionListener{

    private CardGameBoard board;
    private CardFrame frame;

    public StartButton(CardGameBoard b, CardFrame f) {
        super("Start");
        board = b;
        frame = f;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        board.createCardGameBoard();
        frame.update();
    }
}