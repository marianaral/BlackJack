package Test.UnitTest;

import Model.Cards.Ace;
import Model.Cards.Card;
import Model.Cards.Face;
import Model.Cards.Pip;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CardTest {
    @Test
    public void pipValue() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException {
        for (int i = 2; i < 11; i++){
            Card pip = new Pip(i);
            assertEquals(i, pip.getValue());
        }
    }
    
    @Test
    public void faceValue() {
        Card face =  new Face();
        assertEquals(10, face.getValue());
    }
    
    @Test
    public void aceValue(){
        Card ace = new Ace();
        assertEquals(11, ace.getValue());
    }
    
    @Test
    public void pipValueLowerThanExpected() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        for(int i = -5; i <= 5; i++){
            Pip pip = new Pip(i);
        }
    }
    @Test
    public void pipValueHigherThanExpected() throws Pip.ValueLowerThanExpectedException, Pip.ValueHigherThanExpectedException{
        for(int i = 11; i <= 21; i++){
            Pip pip = new Pip(i);
        }
    }
    
}
