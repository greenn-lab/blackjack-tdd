package xxx.blackjack;

public class Card {
    public static final String SPADE = "spade";
    public static final String HEART = "heart";
    public static final String DIAMOND = "diamond";
    public static final String CLUB = "club";

    private String pattern;
    private String denomination;

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String numberToDenomination(int i) {
        if (i == 1)
            return "A";

        if (i == 11)
            return "J";

        if (i == 12)
            return "Q";

        if (i == 13)
            return "K";

        return Integer.toString(i);
    }
}
