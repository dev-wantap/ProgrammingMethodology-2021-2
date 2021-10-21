public class SlidePuzzleBoard {

    private PuzzlePiece[][] board;
    private int empty_row;
    private int empty_col;

    public SlidePuzzleBoard() {
        board = new PuzzlePiece[4][4];
        int number = 15;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                board[row][col] = new PuzzlePiece(number);
                number--;
            }
        }
        board[3][3] = null;
        empty_row = 3;
        empty_col = 3;
    }

    public PuzzlePiece[][] contents() {
        return board;
    }

    public boolean move(int w) {
        int row, col;
        if (found(w, empty_row-1, empty_col)) { // 위
            row = empty_row-1;
            col = empty_col;
        } else if (found(w, empty_row+1, empty_col)) { // 아래
            row = empty_row+1;
            col = empty_col;
        } else if (found(w, empty_row, empty_col-1)) { // 왼쪽
            row = empty_row;
            col = empty_col-1;
        } else if (found(w, empty_row, empty_col+1)) { // 오른쪽
            row = empty_row;
            col = empty_col+1;
        } else {
            return false;
        }
        board[empty_row][empty_col] = board[row][col];
        board[row][col] = null;
        empty_row = row;
        empty_col = col;
        return true;

    }

    public boolean found(int v, int row, int col) {
        if (0 <= row && row <= 3 && 0 <= col && col <= 3) {
            return v == board[row][col].getFace_value();
        } else {
            return false;
        }
    }
}
