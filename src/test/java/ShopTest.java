import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Drums drums;
    private Guitar guitar;
    private Piano piano;
    private Violin violin;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        drums = new Drums("Pearl", "DR001", "Black", InstrumentType.PERCUSSION, 5);
        guitar = new Guitar("Fender", "Stratocaster", "Black", InstrumentType.STRINGS, 6);
        piano = new Piano("Yamaha", "P1000", "White", InstrumentType.KEYS, 88);
        violin = new Violin("Fiddlerman", "FID1000", "Brown", InstrumentType.STRINGS, 4);

    }

    @Test
    public void canGetName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

}
