public class SudokuController {
	
	private Sudoku sudoku;
	private PlayerInput reader;
	private SudokuWriter writer;
	
	/** Sudoku, PlayerInput, SudokuWriter 객체를 생성하여 필드 변수에 지정한다. */
	public SudokuController() {
		reader = new PlayerInput();
		int hole_count = reader.selectLevel();
		sudoku = new Sudoku(hole_count);
		writer = new SudokuWriter(sudoku);
	}
	
	// [배점 0.5/2.0]
	/** 스도쿠 퍼즐 게임을 진행한다. */
	public void playSudokuPuzzle() {
		while (sudoku.check_finish()) {
			writer.repaint();
			int row, col, num;
			row = reader.selectNumber("가로줄 번호를 넣어주세요.")-1;
			col = reader.selectNumber("세로줄 번호를 넣어주세요.")-1;
			num = reader.selectNumber("숫자를 넣어주세요.");
			if (sudoku.check(num, row, col)) {
				sudoku.add_num_board(num, row, col);
			} else {
				System.out.println("ERR");
			}
		}
	}
}