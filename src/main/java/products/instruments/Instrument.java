package products.instruments;

import products.Brand;
import products.Product;
import products.ProductCondition;


public abstract class Instrument extends Product {

    private InstrumentType instrumentType;
    private String material;
    private String colour;
    private ProductCondition productCondition;

    public Instrument(String name, Double costPrice, Double salePrice, Brand brand, InstrumentType instrumentType, String material, String colour, ProductCondition productCondition) {
        super(name, costPrice, salePrice, brand);
        this.instrumentType = instrumentType;
        this.material = material;
        this.colour = colour;
        this.productCondition = productCondition;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public ProductCondition getProductCondition() {
        return productCondition;
    }


}
