package SecondLv2andLv3;

class createCard {
    private String[] cards = new String[54];
    private String[] king = {"大王", "小王"};
    private String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private String[] cardColor = {"黑桃♠", "方块♦", "红桃♥", "梅花♣"};
    String[] Card() {

        for (int i = 0; i < cardColor.length; i++) {
            for (int j = 0; j < number.length; j++) {
                cards[i * 13 + j] = cardColor[i] + number[j];
            }
        }
        cards[52] = king[0];
        cards[53] = king[1];
        return cards;
    }
}

