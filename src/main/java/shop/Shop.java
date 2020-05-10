package shop;

import products.ISell;


import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getInventoryCount() {
        return stock.size();
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }


    public double getTotalProfit() {
        double totalProfit = 0;
        for (ISell item: stock){
            double itemProfit = item.calculateProfit();
            totalProfit += itemProfit;
        } return totalProfit;
    }
}
