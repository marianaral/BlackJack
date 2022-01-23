package Model.Cards.Deck;

import Model.Cards.Card;
import java.util.ArrayList;
import java.util.List;

public class Deck {
    final private List<Card> cards = new ArrayList<>();

    public List<Card> getCards() {
        return cards;
    }
    
    public void addCard(Card card) {
        cards.add(card);
    }
}
