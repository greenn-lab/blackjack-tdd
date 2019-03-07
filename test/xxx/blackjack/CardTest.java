package xxx.blackjack;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

    @Test
    public void _01_create_card() {
        final String denomination = "A";

        Card card = new Card(Card.SPADE, "A");

        assertThat(card.getPattern()).isEqualTo(Card.SPADE);
        assertThat(card.getDenomination()).isEqualTo(denomination);
    }
}
