package Instruments;


import Interfaces.IPlay;

public abstract class Instrument implements IPlay {
    private String make;
    private String model;
    private String colour;
    private InstrumentType instrumentType;
    private double buyingPrice;
    private double salePrice;

    public Instrument(String make, String model, String colour, InstrumentType instrumentType){
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.buyingPrice = 0;
        this.salePrice = 0;
    }
}
