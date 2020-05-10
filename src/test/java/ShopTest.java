import org.junit.Before;
import org.junit.Test;
import products.Brand;
import products.ProductCondition;
import products.instruments.*;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;

    @Before
    public void before(){
        shop = new Shop("Lightning Music");

        guitar = new Guitar("Fender Guitar",50.00,0.00, Brand.FENDER, InstrumentType.GUITAR,
                "Swamp Ash w/ Flamed Maple Top","purple", ProductCondition.NEW, GuitarType.ELECTRIC,7);
        piano = new Piano("Grand Piano",1000.00,0.00, Brand.STEINWAY, InstrumentType.PIANO,
                "Mahogany","brown", ProductCondition.NEW, PianoType.GRAND,88);
    }

    @Test
    public void hasName(){
        assertEquals("Lightning Music", shop.getName());
    }

    @Test
    public void inventoryStartsEmpty(){
        assertEquals(0, shop.getInventoryCount());
    }

    @Test
    public void canAddStock(){
        shop.addItem(guitar);
        assertEquals(1, shop.getInventoryCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.getInventoryCount());
    }



    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addItem(guitar);
        shop.addItem(piano);
        assertEquals(1470.00, shop.getTotalProfit(),0.01);
    }
}
