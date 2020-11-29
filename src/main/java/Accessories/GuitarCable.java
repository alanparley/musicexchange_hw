package Accessories;

import Interfaces.ISell;

public class GuitarCable extends Accessory implements ISell {
    public GuitarCable(String make, String description, double buyingPrice, double salePrice) {
        super(make, description, buyingPrice, salePrice);
    }

    public double calculateMarkup(double buyingPrice, double salePrice) {
        return salePrice - buyingPrice;
    }
}
