package Instruments;

public class Drums extends Instrument {

    private int numberOfDrums;

    public Drums(String make, String model, String colour, InstrumentType instrumentType, int numberOfDrums) {
        super(make, model, colour, instrumentType);
        this.numberOfDrums = numberOfDrums;
    }

    public int getNumberOfDrums(){
        return this.numberOfDrums;
    }


    public String play(){
        return "Doof";
    }
}


