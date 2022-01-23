package Model.Players;

import Model.Cards.Card;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Card> cards = new ArrayList<>();

    public void addCardToBet(Card card){
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    
}
