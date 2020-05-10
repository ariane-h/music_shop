import org.junit.Before;
import org.junit.Test;
import products.Brand;
import products.ProductCondition;
import products.instruments.DrumType;
import products.instruments.Drums;
import products.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Junior Drum Kit",50.00,100.00, Brand.ROLAND, InstrumentType.DRUMS,
                        "double mesh","wine red", ProductCondition.NEW, DrumType.ACOUSTIC,3);
    }

    @Test
    public void hasName(){
        assertEquals("Junior Drum Kit", drums.getName());
    }

    @Test
    public void canPlay(){
        assertEquals("rum pum pum", drums.play("rum pum pum"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(120.00,drums.calculateMarkup(),0.01);
    }

    @Test
    public void canSetSalePrice(){
        Double targetSalePrice = drums.calculateMarkup();
        drums.setSalePrice(targetSalePrice);
        assertEquals(120.00, drums.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(70.00, drums.calculateProfit(), 0.01);
    }
}
