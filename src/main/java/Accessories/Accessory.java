package Accessories;

import Interfaces.ISell;

public abstract class Accessory implements ISell {
    private String make;
    private String description;
    private double buyingPrice;
    private double salePrice;

    public Accessory(String make, String description, double buyingPrice, double salePrice) {
       this.make = make;
       this.description = description;
       this.buyingPrice = 0;
       this.salePrice = 0;
    }

    public double calculateMarkup(double buyingPrice, double salePrice) {
        return salePrice - buyingPrice;
    }

    public String getMake(){
        return make;
    }

    public String getDescription(){
        return description;
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
}

