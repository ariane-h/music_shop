package products.instruments;

import products.Brand;
import products.ISell;
import products.ProductCondition;

public class Piano extends Instrument implements IPlay, ISell {

    private PianoType type;
    private Integer numberOfKeys;

    public Piano(String name, Double costPrice, Double salePrice, Brand brand, InstrumentType instrumentType, String material, String colour, ProductCondition productCondition, PianoType type, Integer numberOfKeys) {
        super(name, costPrice, salePrice, brand, instrumentType, material, colour, productCondition);
        this.type = type;
        this.numberOfKeys = numberOfKeys;
    }

    public PianoType getType() {
        return type;
    }

    public Integer getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(String sound) {
        return sound;
    }

    public double calculateMarkup() {
        if (getProductCondition() == ProductCondition.PREOWNED){
            return this.getCostPrice() * 1.8;
        } return this.getCostPrice() * 2.4;
    }

    public double calculateProfit() {
        double targetSalePrice = this.calculateMarkup();
        double costPrice = this.getCostPrice();
        return targetSalePrice - costPrice;
    }
}
