import org.junit.Before;
import org.junit.Test;
import products.Brand;
import products.ProductCondition;
import products.instruments.InstrumentType;
import products.instruments.Piano;
import products.instruments.PianoType;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano grandPiano;

    @Before
    public void before(){
        grandPiano = new Piano("Grand Piano",1000.00,3000.00, Brand.STEINWAY, InstrumentType.PIANO,
                                "Mahogany","brown", ProductCondition.NEW, PianoType.GRAND,88);
    }

    @Test
    public void hasName(){
        assertEquals("Grand Piano", grandPiano.getName());
    }

    @Test
    public void hasType(){
        assertEquals(PianoType.GRAND, grandPiano.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("plink plink plink", grandPiano.play("plink plink plink"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2400.00, grandPiano.calculateMarkup(),0.01);
    }

    @Test
    public void canSetSalePrice(){
        Double targetSalePrice = grandPiano.calculateMarkup();
        grandPiano.setSalePrice(targetSalePrice);
        assertEquals(2400.00, grandPiano.getSalePrice(), 0.01);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(1400.00, grandPiano.calculateProfit(), 0.01);
    }
}

