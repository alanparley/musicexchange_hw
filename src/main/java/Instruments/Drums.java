package Instruments;

public class Drums extends Instrument {

    public int numberOfDrums;

    public Drums(String make, String model, String colour, InstrumentType instrumentType, int numberOfDrums) {
        super(make, model, colour, instrumentType);
    }

    public int getNumberOfDrums(){
        return numberOfDrums;
    }

    public String play(){
        return "Doof";
    }
}


