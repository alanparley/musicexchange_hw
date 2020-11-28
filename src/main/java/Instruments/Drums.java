package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Drums extends Instrument implements IPlay, ISell {

    private int numberOfDrums;

    public Drums(String make, String model, String colour, InstrumentType instrumentType, int numberOfDrums) {
        super(make, model, colour, instrumentType);
        this.numberOfDrums = numberOfDrums;
    }

    public int getNumberOfDrums(){
        return this.numberOfDrums;
    }


    public String play(String sound){
        return "Drums go: " + sound;
    }


}


