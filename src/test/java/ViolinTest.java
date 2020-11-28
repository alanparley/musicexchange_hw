import Instruments.InstrumentType;
import Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin("Fiddlerman", "FID1000", "Brown", InstrumentType.STRINGS, 4);
    }

    @Test
    public void canGetMake() {
        assertEquals("Fiddlerman", violin.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("FID1000", violin.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("Brown", violin.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRINGS, violin.getInstrumentType());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(0.00, violin.getBuyingPrice(), 0.00);
    }

    @Test
    public void canSetBuyingPrice() {
        violin.setBuyingPrice(400.00);
        assertEquals(400.00, violin.getBuyingPrice(), 0.00);
    }

    @Test
    public void canSetSalePrice(){
        violin.setSalePrice(540.00);
        assertEquals(540.00, violin.getSalePrice(), 0.00);
    }

    @Test
    public void canPlayInstrument() {
        assertEquals("Violin goes: Screeetch", violin.play("Screeetch"));
    }

    @Test
    public void canCalculateMarkup() {
        violin.setBuyingPrice(400.00);
        violin.setSalePrice(540.00);
        assertEquals(140.00, violin.calculateMarkup(violin.getBuyingPrice(), violin.getSalePrice()), 0.01);
    }

}
