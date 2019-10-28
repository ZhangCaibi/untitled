package SecondLv2andLv3;

public class Game {
    public static void main(String[] args) {
        String[] yourcards = new String[17];
        String[] rivalscards = new String[17];
        Fapai you = new Fapai();
        Fapai rival = new Fapai();
        yourcards=you.yours();
        rivalscards=rival.rivals();
        System.out.println("一共有这些牌:");
        Pai allcard = new Pai();
        allcard.Allcard();
        System.out.println("\n你的手牌:");
        for (String yourcard:yourcards) {
            System.out.println(yourcard);
        }
        System.out.println("\n你对手的牌:");
        for (String rivalscard:rivalscards) {
            System.out.println(rivalscard);
        }
        Rule.rule(yourcards,rivalscards);
    }
}
