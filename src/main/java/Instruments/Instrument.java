package Instruments;


import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {
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

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColour(){
        return colour;
    }

    public InstrumentType getInstrumentType(){
        return instrumentType;
    }

    public double getBuyingPrice(){
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice){
        this.buyingPrice = buyingPrice;
    }

    public double getSalePrice(){
        return salePrice;
    }

    public void setSalePrice(double salePrice){
        this.salePrice = salePrice;
    }

    public double calculateMarkup(double buyingPrice, double salePrice) {
        return salePrice - buyingPrice;
    }


}
