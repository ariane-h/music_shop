import org.junit.Before;
import org.junit.Test;
import products.Brand;
import products.ProductCondition;
import products.instruments.Guitar;
import products.instruments.GuitarType;
import products.instruments.InstrumentType;


import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender Guitar",50.00,100.00, Brand.FENDER, InstrumentType.GUITAR,
                            "Swamp Ash w/ Flamed Maple Top","purple", ProductCondition.NEW, GuitarType.ELECTRIC,7);
    }

    @Test
    public void hasProductName(){
        assertEquals("Fender Guitar", guitar.getName());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(50.00, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void hasBrand(){
        assertEquals(Brand.FENDER,guitar.getBrand());
    }

    @Test
    public void canPlay(){
        assertEquals("strum strum strum", guitar.play("strum strum strum"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(120.00, guitar.calculateMarkup(), 0.01);
    }
}
