public class Dealer {
    private Player p1;
    private Player p2;
    private GameBoard b;
    private Registrar r;
    private Dice d;
    private int p1_sum;
    private int p2_sum;


    /**
     * Dealer    - 객체 초기
     * @param p1 - 플레이어 1
     * @param p2 - 플레이어 2
     * @param b  - 화면 표시
     * @param r  - 플레이어 가입
     */
    public Dealer(Player player1, Player p2, GameBoard b, Registrar r) {
    }
    public void dealDiceGame() {
        // 주사위 굴리기
        if (p1.rolled().sum() <= p2.rolled().sum() || p1.points() + p2.points() == 0) {
            p1.play(d);
            p1_sum = p1.rolled().sum();
            p2.play(d);
            p2_sum = p2.rolled().sum();
        }
        else {
            p2.play(d);
            p2_sum = p2.rolled().sum();
            p1.play(d);
            p1_sum = p1.rolled().sum();
        }
        // 승패 판정 - 모두 쌍둥이
        if ((p1.rolled().face1() == p1.rolled().face2())
                && (p2.rolled().face1() == p2.rolled().face2())) {
            if (p1.rolled().sum() > p2.rolled().sum()){
                p1.receivePoint();
            }
            else if (p1.rolled().sum() < p2.rolled().sum()) {
                p2.receivePoint();
            }
            else {
                // 비겼을 때 내용 추가
            }
        }
        // 쌍둥이 하나
        else if (p1.rolled().face1() == p1.rolled().face2()) {
            p1.receivePoint();
        }
        else if (p2.rolled().face1() == p2.rolled().face2()) {
            p2.receivePoint();
        }
        // 합으로 비교
        else if (p1.rolled().sum() > p2.rolled().sum()) {
            p1.receivePoint();
        }
        else if (p1.rolled().sum() < p2.rolled().sum()) {
            p2.receivePoint();
        }
        // 합이 같을 경우 차이로 비교
        else if (p1.rolled().difference() < p2.rolled().difference()) {
            p1.receivePoint();
        }
        else if (p1.rolled().difference() > p2.rolled().difference()) {
            p2.receivePoint();
        }
        else {
            //비긴 내용 추가
        }
        b.repaint();
        if (r.wantToContnue() == 0){
            this.dealDiceGame(p1, p2, b, r);
        }
        else {
            System.exit(0);
        }
    }
}
