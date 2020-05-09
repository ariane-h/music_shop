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

}
