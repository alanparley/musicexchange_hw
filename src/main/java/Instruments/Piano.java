package Instruments;

import Interfaces.IPlay;

public class Piano extends Instrument implements IPlay {

    private int numberOfKeys;

    public Piano(String make, String model, String colour, InstrumentType instrumentType, int numberOfKeys) {
        super(make, model, colour, instrumentType);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys(){
        return this.numberOfKeys;
    }

    public String play(String sound){
        return "Piano goes: " + sound;
    }
}
