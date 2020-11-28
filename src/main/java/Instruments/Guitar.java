package Instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String make, String model, String colour, InstrumentType instrumentType, int numberOfStrings) {
        super(make, model, colour, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfString(){
        return numberOfStrings;
    }

    public String play(){
        return "KERRANNG!";
    }
}
