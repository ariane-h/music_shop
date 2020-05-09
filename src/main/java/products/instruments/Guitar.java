package products.instruments;


import products.Brand;
import products.ISell;
import products.ProductCondition;

public class Guitar extends Instrument implements IPlay, ISell {

    private GuitarType type;
    private Integer numberOfStrings;

    public Guitar(String name, Double costPrice, Double salePrice, Brand brand, InstrumentType instrumentType, String material, String colour, ProductCondition productCondition, GuitarType type, Integer numberOfStrings) {
        super(name, costPrice, salePrice, brand, instrumentType, material, colour, productCondition);
        this.type = type;
        this.numberOfStrings = numberOfStrings;
    }

    public GuitarType getType() {
        return type;
    }

    public Integer getNumberOfStrings() {
        return numberOfStrings;
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
