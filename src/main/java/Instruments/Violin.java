package Instruments;

import Interfaces.IPlay;

public class Violin extends Instrument implements IPlay {

    private int numberOfStrings;

    public Violin(String make, String model, String colour, InstrumentType instrumentType, int numberOfStrings) {
        super(make, model, colour, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }

    public String play(String sound){
        return "Violin goes: " + sound;
    }
}
