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
}
