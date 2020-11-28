package Instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String make, String model, String colour, InstrumentType instrumentType, int numberOfKeys) {
        super(make, model, colour, instrumentType);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys(){
        return this.numberOfKeys;
    }

    public String play(){
        return"tinkle tinkle";
    }
}
