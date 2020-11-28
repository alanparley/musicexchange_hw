import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Stratocaster", "Black", InstrumentType.STRINGS, 6);
    }

    @Test
    public void canGetMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void canGetColour(){
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.STRINGS, guitar.getInstrumentType());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(0.00, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void canSetBuyingPrice(){
        guitar.SetBuyingPrice(500.00);
        assertEquals(500.00, guitar.getBuyingPrice(), 0.00);

    }

    @Test
    public void canPlayInstrument(){
        assertEquals("KERRANNG!", guitar.play());
    }
}
