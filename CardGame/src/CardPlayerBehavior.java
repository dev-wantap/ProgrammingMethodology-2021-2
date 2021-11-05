public interface CardPlayerBehavior {

    /**
     * wantsACard - 카드 한 장을 받겠는지 답한다.
     * @return - 받고 싶으면 true, 아니면 false
     */
    public boolean wantsACard();

    /**
     * receiveCard - 카드를 한장 받는다. 한도(Hand크기 고려)
     * @param c - 받을 카드
     * @return - 수령 성공 true, 실패 false
     */
    public boolean receiveCard(Card c);
}
