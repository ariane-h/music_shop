package products.instruments;

import products.Brand;
import products.ISell;
import products.ProductCondition;

public class Drums extends Instrument implements IPlay, ISell {

    private DrumType type;
    private Integer numberOfDrums;

    public Drums(String name, Double costPrice, Double salePrice, Brand brand, InstrumentType instrumentType, String material, String colour, ProductCondition productCondition, DrumType type, Integer numberOfDrums) {
        super(name, costPrice, salePrice, brand, instrumentType, material, colour, productCondition);
        this.type = type;
        this.numberOfDrums = numberOfDrums;
    }

    public DrumType getType() {
        return type;
    }

    public Integer getNumberOfDrums() {
        return numberOfDrums;
    }

    public String play(String sound) {
        return sound;
    }

    public double calculateMarkup() {
        if (getProductCondition() == ProductCondition.PREOWNED){
            return this.getCostPrice() * 1.8;
        } return this.getCostPrice() * 2.4;
    }
}
