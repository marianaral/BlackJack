package Model.Cards;

public class Pip implements Card{
    private final int value;

    public Pip(int value) throws ValueLowerThanExpectedException, ValueHigherThanExpectedException {
        if (value <= 1){
            throw new ValueLowerThanExpectedException();
        } else if (value >= 11) {
            throw new ValueHigherThanExpectedException();
        } else {
            this.value = value;
        }
    }
    
    @Override
    public int getValue() {
        return value;
    }

    public static class ValueLowerThanExpectedException extends Exception {

        public ValueLowerThanExpectedException() {
            super("Expected Value was higher or equals 2");
        }
    }

    public static class ValueHigherThanExpectedException extends Exception {

        public ValueHigherThanExpectedException() {
                        super("Expected Value was lower or equals 10");
        }
    }
    
}
