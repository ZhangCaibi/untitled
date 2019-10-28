package SecondLv2andLv3;
import java.util.Random;

public class Fapai {
    private String[] handcard = new String[17];
    void fapai() {
        String[] pai = new String[54];
        createCard card = new createCard();
        Random rand = new Random();
        pai = card.Card();
        int num;
        for (int i = 0; i < 17; i++) {
            num = rand.nextInt(54);
            handcard[i] = pai[num];
        }
    }
    String[] yours() {
        fapai();
        return handcard;
    }

    String[] rivals() {
        fapai();
        return handcard;
    }
}
