import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardButton extends JButton implements ActionListener {

    private CardGameBoard board;
    private CardFrame frame;

    public CardButton(CardGameBoard b, CardFrame f) {
        board = b;
        frame = f;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

    }

}