import javax.swing.*;
import java.awt.*;

public class PuzzleController {

    private SlidePuzzleBoard board;
    private PuzzleWriter writer;

    public PuzzleController(SlidePuzzleBoard b, PuzzleWriter w) {
        board = b;
        writer = w;
    }

    public void play() {
        while (true) {
            writer.displayPuzzle();
            String input = JOptionPane.showInputDialog("움직일 펴즐 조각 번호를 입력하세요.");
            int n = Integer.parseInt(input);
            if (! board.move(n)) {
                writer.printError("움직일 수 없습니다.");
            }
        }
    }

    public static void main(String[] args) {
        SlidePuzzleBoard b = new SlidePuzzleBoard();
        new PuzzleController(b, new PuzzleWriter(b)).play();
    }
}
