import Instruments.InstrumentType;
import Instruments.Piano;
import Interfaces.IPlay;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Yamaha", "P1000", "White", InstrumentType.KEYS, 88);
    }

    @Test
    public void canGetMake() {
        assertEquals("Yamaha", piano.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("P1000", piano.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("White", piano.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.KEYS, piano.getInstrumentType());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(0.00, piano.getBuyingPrice(), 0.00);
    }

    @Test
    public void canSetBuyingPrice() {
        piano.setBuyingPrice(1000.00);
        assertEquals(1000.00, piano.getBuyingPrice(), 0.00);
    }


    @Test
    public void canPlayInstrument(){
        assertEquals("Piano goes: tinkle tinkle", piano.play("tinkle tinkle"));
    }

    @Test
    public void canCalculateMarkup() {
        piano.setBuyingPrice(1000.00);
        piano.setSalePrice(1450.00);
        assertEquals(450.00, piano.calculateMarkup(1000, 1450.00), 0.01);
    }

}
