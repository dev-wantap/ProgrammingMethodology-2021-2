import java.util.*;

public class CardGameBoard {
    private Card[][] board;
    private boolean game_on = false;
    private int[] first = null;
    private int[] second = null;


    /** Constructor - SlidePuzzleBoard 초기 퍼즐 보드 설정 - 감소하는 순으로 나열
     */
    public CardGameBoard() {
        board = new Card[2][8];
        // 카드 1~8를 보드에 역순으로 끼우기
        int[][] numbers = new int[][]{generateRandomPermutation(8),  generateRandomPermutation(8)};
        int number = 0;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = new Card("A".concat(Integer.toString(numbers[row][number])));
                number += 1;
            }
            number = 0;
        }
    }

    public boolean gameOn() {
        return game_on;
    }

    public Card getCard(int row, int col) {
        return board[row][col];
    }

    public void createCardGameBoard() {
        int[][] numbers = new int[][]{generateRandomPermutation(8),  generateRandomPermutation(8)};
        int number = 0;
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = new Card("A".concat(Integer.toString(numbers[row][number])));
                number += 1;
            }
            number = 0;
        }
        game_on = true;
        // temp
        for (int i=0; i<2; i++) {
            for (int j=0; j<8; j++) {
                System.out.println(board[i][j].getFaceValue());
            }
        }
    }

    private int[] generateRandomPermutation(int n) {
        Random random = new Random();
        int[] permutation = new int[n];
        for (int i = 0; i < n; i++) {
            int d = random.nextInt(i+1);
            permutation[i] = permutation[d];
            permutation[d] = i;
        }
        return permutation;
    }

    // 재작성 필요
    public boolean gameOver() {
        return true;
    }

    /** found - board[row][col]에 퍼즐 조각 v가 있는지 확인  */
    private boolean found(String value, int row, int col) {
        if (row >= 0 && row <= 3 && col >= 0 && col <= 3)
            return Objects.equals(board[row][col].getFaceValue(), value);
        else
            return false;
    }

    public boolean saveRowCol(int row, int col) {
        boolean result;
        if (first == null) {
            first = new int[]{row, col};
            return true;
        } else {
            second = new int[] {row, col};
            result = compare(first, second);
            return result;
        }
    }

    public boolean compare(int[] fir, int[]sec) {
        if (!board[fir[0]][fir[1]].getFaceValue().equals(board[sec[0]][sec[1]].getFaceValue())) {

            return false;
        }
        return true;
    }
    /*
    public boolean compare(int[] fir, int[]sec) {
        return board[fir[0]][fir[1]].getFaceValue().equals(board[sec[0]][sec[1]].getFaceValue());
    }*/
    
    public void reset() {
        /*try {
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }*/
        //wait(500);
    	first = null;
    	second = null;
    }
    
    
    public int[] getFirst() {
        int[] a = new int[] {first[0], first[1]};
        return a;
    }
    
    public boolean secondCheck() {
        return second != null;
    }
}
