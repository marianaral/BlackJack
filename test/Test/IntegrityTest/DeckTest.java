package Test.IntegrityTest;

import Model.Cards.Ace;
import Model.Cards.Card;
import Model.Cards.Deck.Deck;
import Model.Cards.Face;
import Model.Cards.Pip;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DeckTest {
    @Test
    public void addOnePip() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Deck deck = new Deck();
        deck.addCard(new Pip(7));
        assertEquals(deck.getCards().get(0), new Pip(7));
    }
    
    public void addTwoPip() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Deck deck = new Deck();
        deck.addCard(new Pip(7));
        deck.addCard(new Pip(9));
        List<Card> expected = new ArrayList<>();
        expected.add(new Pip(7));
        expected.add(new Pip(9));
        for (int i = 0; i < 2; i++) {
            assertEquals(deck.getCards().get(i), expected.get(i));
        }
    }
        
        @Test
    public void deckWithOneAce(){
        Deck deck = new Deck();
        deck.addCard(new Ace());
        assertEquals(deck.getCards().get(0), new Ace());
        
    }
    
    @Test
    public void deckWithTwoAces(){
        Deck deck = new Deck();
        deck.addCard(new Ace());
        deck.addCard(new Ace());
        List<Card> expected = new ArrayList<>();
        expected.add(new Ace());
        expected.add(new Ace());
        for (int i = 0; i < 2; i++) {
            assertEquals(deck.getCards().get(i), expected.get(i));
        }
        
    }
    
    @Test void deckWithOneFace(){
        Deck deck = new Deck();
        deck.addCard(new Face());
        assertEquals(deck.getCards().get(0), new Face());
    }

    @Test
    public void deckWithTwoFaces(){
        Deck deck = new Deck();
        deck.addCard(new Face());
        deck.addCard(new Face());
        List<Card> expected = new ArrayList<>();
        expected.add(new Face());
        expected.add(new Face());
        for (int i = 0; i < 2; i++) {
            assertEquals(deck.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void deckWithOnePipAndOneAce() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Deck deck = new Deck();
        deck.addCard(new Pip(8));
        deck.addCard(new Ace());
        List<Card> expected = new ArrayList<>();
        expected.add(new Pip(8));
        expected.add(new Ace());
        for (int i = 0; i < 2; i++) {
            assertEquals(deck.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void deckWithOnePipAndOneFace() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Deck deck = new Deck();
        deck.addCard(new Pip(5));
        deck.addCard(new Face());
        List<Card> expected = new ArrayList<>();
        expected.add(new Pip(5));
        expected.add(new Face());
        for (int i = 0; i < 2; i++) {
            assertEquals(deck.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void deckWithOneAceAndOneFace(){
        Deck deck = new Deck();
        deck.addCard(new Ace());
        deck.addCard(new Face());
        List<Card> expected = new ArrayList<>();
        expected.add(new Ace());
        expected.add(new Face());
        for (int i = 0; i < 2; i++) {
            assertEquals(deck.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void deckWithOnePipOneAceAndOneFace() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Deck deck = new Deck();
        deck.addCard(new Pip(3));
        deck.addCard(new Ace());
        deck.addCard(new Face());
        List<Card> expected = new ArrayList<>();
        expected.add(new Pip(3));
        expected.add(new Ace());
        expected.add(new Face());
        for (int i = 0; i < 3; i++) {
            assertEquals(deck.getCards().get(i), expected.get(i));
        }
    }
    
}
