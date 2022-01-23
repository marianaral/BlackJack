
package blackjack;

import Model.Cards.Ace;
import Model.Cards.Card;
import java.util.ArrayList;
import java.util.List;

public class BlackJack {
    public static List<String> getWinners(List<Card> player1Cards, List<Card> player2Cards, List<Card> player3Cards, List<Card> croupierCards, List<Card> deck){
        List<String> winners = new ArrayList<>();
        List<Card>[] players = new ArrayList[3];
        players[0] = player1Cards;
        players[1] = player2Cards;
        players[3] = player3Cards;
        List<Card> croupierBet = croupierBet(croupierCards, deck);
        if(isBlackJack(croupierBet)){
            winners.add("Croupier wins");
            return winners;
        } else if (calculatePoints(croupierBet) > 21){
            for (int i = 0; i < players.length ; i++) {
                if(calculatePoints(players[i]) <= 21){
                    winners.add("Player" + (i + 1) + " wins" );
                }
            }
        } else {
            for(int i = 0; i < players.length ; i++){
                if((calculatePoints(players[i]) <= 21 && calculatePoints(croupierBet) < calculatePoints(players[i])) || isBlackJack(players[i])) {
                    winners.add("Player" + (i + 1) + " wins");
                }
            }
            if (winners.isEmpty()){
                winners.add("Croupier wins");
            }
        }
        
        return winners;
    }
    
    public static int calculatePoints(List<Card> bet) {
        int total = 0;
        int aceCounter = 0;
        for (Card card : bet) {
            if (card instanceof Ace) {
                aceCounter++;
            }
            total += card.getValue();
        }
        while(total >= 22 && aceCounter >= 1){
            total -= 10;
            aceCounter--;
        }
        return total;
    }
    
    public static boolean isBlackJack(List<Card> bet){
        return calculatePoints(bet) == 21 && bet.size() == 2;
    }
    
    public static List<Card> croupierBet(List<Card> croupierBet, List<Card> deck) {
        while(calculatePoints(croupierBet) < 17 && deck.size() > 0){
            croupierBet.add(deck.remove(0));
        }
        return croupierBet;
    }
    
}
