package products;

public abstract class Product {

    private String name;
    private Double costPrice;
    private Double salePrice;
    private Brand brand;


    public Product(String name, Double costPrice, Double salePrice, Brand brand) {
        this.name = name;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
        this.brand = brand;

    }

    public String getName() {
        return name;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public Brand getBrand() {
        return brand;
    }


}
