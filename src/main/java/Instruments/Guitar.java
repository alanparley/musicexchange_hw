package Instruments;

import Interfaces.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(String make, String model, String colour, InstrumentType instrumentType, int numberOfStrings) {
        super(make, model, colour, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public String play(String sound){
        return "Guitar goes: " + sound;
    }
}
