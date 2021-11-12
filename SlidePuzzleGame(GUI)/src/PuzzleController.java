import javax.swing.*;

/** PuzzleController 슬라이드 퍼즐 조각의 움직임을 제어  */
public class PuzzleController {
	private SlidePuzzleBoard board;

	
	/** Constructor - PuzzleController 초기화 메소드 
	 * @param b - 퍼즐 보드
 */
	public PuzzleController(SlidePuzzleBoard b) {
		board = b;
	}
}
