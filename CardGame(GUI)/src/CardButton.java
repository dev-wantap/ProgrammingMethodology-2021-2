import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardButton extends JButton implements ActionListener {

    private CardGameBoard board;
    private CardFrame frame;
    private int[] coordinates;

    public CardButton(CardGameBoard b, CardFrame f, int x, int y) {
        board = b;
        frame = f;
        coordinates = new int[] {x, y};
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (this.getText().equals("?")) {
            this.setText(board.getCard(coordinates[0], coordinates[1]).getFaceValue());

            if (!board.saveRowCol(coordinates[0], coordinates[1])) {
                frame.hideFirstCard();
                this.setText("?");
            } else if (board.secondCheck()) {
                board.reset();
            }
        }
    }

    public void hideCard () {
        this.setText("?");
    }
}