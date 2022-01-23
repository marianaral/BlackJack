package Test.IntegrityTest;

import Model.Cards.Ace;
import Model.Cards.Card;
import Model.Cards.Face;
import Model.Cards.Pip;
import Model.Players.Croupier;
import Model.Players.Player;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {
    
    @Test
    public void playerWithOnePipCard() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException {
        Player player = new Player();
        player.addCardToBet(new Pip(2));
        
        assertEquals(player.getCards().get(0), new Pip(6));
    }
    
    @Test
    public void playerWithTwoPipCards() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Player player = new Player();
        player.addCardToBet(new Pip(2));
        player.addCardToBet(new Pip(10));
        
        List<Card> expected = new ArrayList<>();
        expected.add(new Pip(2));
        expected.add(new Pip(10));
        for (int i = 0; i < 2; i++) {
            assertEquals(player.getCards().get(i), expected.get(i));
        } 
    }
    
    @Test
    public void playerWithOneAce(){
        Player player = new Player();
        player.addCardToBet(new Ace());
        assertEquals(player.getCards().get(0), new Ace());
        
    }
    
    @Test
    public void playerWithTwoAces(){
        Player player = new Player();
        player.addCardToBet(new Ace());
        player.addCardToBet(new Ace());
        List<Card> expected = new ArrayList<>();
        expected.add(new Ace());
        expected.add(new Ace());
        for (int i = 0; i < 2; i++) {
            assertEquals(player.getCards().get(i), expected.get(i));
        }
        
    }
    
    @Test void playerWithOneFace(){
        Player player = new Player();
        player.addCardToBet(new Face());
        assertEquals(player.getCards().get(0), new Face());
    }

    @Test
    public void playerWithTwoFaces(){
        Player player = new Player();
        player.addCardToBet(new Face());
        player.addCardToBet(new Face());
        List<Card> expected = new ArrayList<>();
        expected.add(new Face());
        expected.add(new Face());
        for (int i = 0; i < 2; i++) {
            assertEquals(player.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void playerWithOnePipAndOneAce() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Player player = new Player();
        player.addCardToBet(new Pip(8));
        player.addCardToBet(new Ace());
        List<Card> expected = new ArrayList<>();
        expected.add(new Pip(8));
        expected.add(new Ace());
        for (int i = 0; i < 2; i++) {
            assertEquals(player.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void playerWithOnePipAndOneFace() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Player player = new Player();
        player.addCardToBet(new Pip(5));
        player.addCardToBet(new Face());
        List<Card> expected = new ArrayList<>();
        expected.add(new Pip(5));
        expected.add(new Face());
        for (int i = 0; i < 2; i++) {
            assertEquals(player.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void playerWithOneAceAndOneFace(){
        Player player = new Player();
        player.addCardToBet(new Ace());
        player.addCardToBet(new Face());
        List<Card> expected = new ArrayList<>();
        expected.add(new Ace());
        expected.add(new Face());
        for (int i = 0; i < 2; i++) {
            assertEquals(player.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void playerWithOnePipOneAceAndOneFace() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Player player = new Player();
        player.addCardToBet(new Pip(3));
        player.addCardToBet(new Ace());
        player.addCardToBet(new Face());
        List<Card> expected = new ArrayList<>();
        expected.add(new Pip(3));
        expected.add(new Ace());
        expected.add(new Face());
        for (int i = 0; i < 3; i++) {
            assertEquals(player.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void croupierWithOnePipCard() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException {
        Player croupier = new Player();
        croupier.addCardToBet(new Pip(2));
        
        assertEquals(croupier.getCards().get(0), new Pip(6));
    }
    
    @Test
    public void croupierWithTwoPipCards() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Croupier croupier = new Croupier();
        croupier.addCardToBet(new Pip(2));
        croupier.addCardToBet(new Pip(10));
        
        List<Card> expected = new ArrayList<>();
        expected.add(new Pip(2));
        expected.add(new Pip(10));
        for (int i = 0; i < 2; i++) {
            assertEquals(croupier.getCards().get(i), expected.get(i));
        } 
    }
    
    @Test
    public void croupierWithOneAce(){
        Croupier croupier = new Croupier();
        croupier.addCardToBet(new Ace());
        assertEquals(croupier.getCards().get(0), new Ace());
        
    }
    
    @Test
    public void croupierWithTwoAces(){
        Croupier croupier = new Croupier();
        croupier.addCardToBet(new Ace());
        croupier.addCardToBet(new Ace());
        List<Card> expected = new ArrayList<>();
        expected.add(new Ace());
        expected.add(new Ace());
        for (int i = 0; i < 2; i++) {
            assertEquals(croupier.getCards().get(i), expected.get(i));
        }
        
    }
    
    @Test void croupierWithOneFace(){
        Croupier croupier = new Croupier();
        croupier.addCardToBet(new Face());
        assertEquals(croupier.getCards().get(0), new Face());
    }

    @Test
    public void croupierWithTwoFaces(){
        Croupier croupier = new Croupier();
        croupier.addCardToBet(new Face());
        croupier.addCardToBet(new Face());
        List<Card> expected = new ArrayList<>();
        expected.add(new Face());
        expected.add(new Face());
        for (int i = 0; i < 2; i++) {
            assertEquals(croupier.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void croupierWithOnePipAndOneAce() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Croupier croupier = new Croupier();
        croupier.addCardToBet(new Pip(8));
        croupier.addCardToBet(new Ace());
        List<Card> expected = new ArrayList<>();
        expected.add(new Pip(8));
        expected.add(new Ace());
        for (int i = 0; i < 2; i++) {
            assertEquals(croupier.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void croupierWithOnePipAndOneFace() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Croupier croupier = new Croupier();
        croupier.addCardToBet(new Pip(5));
        croupier.addCardToBet(new Face());
        List<Card> expected = new ArrayList<>();
        expected.add(new Pip(5));
        expected.add(new Face());
        for (int i = 0; i < 2; i++) {
            assertEquals(croupier.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void croupierWithOneAceAndOneFace(){
        Croupier croupier = new Croupier();
        croupier.addCardToBet(new Ace());
        croupier.addCardToBet(new Face());
        List<Card> expected = new ArrayList<>();
        expected.add(new Ace());
        expected.add(new Face());
        for (int i = 0; i < 2; i++) {
            assertEquals(croupier.getCards().get(i), expected.get(i));
        }
    }
    
    @Test
    public void croupierWithOnePipOneAceAndOneFace() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        Croupier croupier = new Croupier();
        croupier.addCardToBet(new Pip(3));
        croupier.addCardToBet(new Ace());
        croupier.addCardToBet(new Face());
        List<Card> expected = new ArrayList<>();
        expected.add(new Pip(3));
        expected.add(new Ace());
        expected.add(new Face());
        for (int i = 0; i < 3; i++) {
            assertEquals(croupier.getCards().get(i), expected.get(i));
        }
    }
    
}
