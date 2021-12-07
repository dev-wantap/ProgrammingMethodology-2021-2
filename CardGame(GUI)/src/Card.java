public class Card {
    String faceValue;

    /**
     * Constructor  - Card 카드 조각 만들기
     * @param value - 퍼즐 조각의 값
     */
    public Card(String value) {
        faceValue = value;
    }

    /**
     * faceValue
     * @return - 카드의 값 리턴
     */
    public String getFaceValue() {
        return faceValue;
    }

}
