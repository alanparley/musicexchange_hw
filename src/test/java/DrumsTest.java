import Instruments.Drums;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Pearl", "DR200", "Silver", InstrumentType.PERCUSSION, 5);
    }

    @Test
    public void canGetMake(){
        assertEquals("Pearl", drums.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("DR200", drums.getModel());
    }

    @Test
    public void canGetColour(){
        assertEquals("Silver", drums.getColour());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, drums.getInstrumentType());
    }

   @Test
    public void canGetNumberOfDrums(){
        assertEquals(5, drums.getNumberOfDrums());
   }

   @Test
    public void canGetBuyingPrice(){
        assertEquals(0.00, drums.getBuyingPrice(), 0.00);
   }

   @Test
    public void canSetBuyingPrice(){
        drums.setBuyingPrice(800.00);
        assertEquals(800, drums.getBuyingPrice(), 0.00);
   }

    @Test
    public void canPlayInstrument(){
        assertEquals("Drums go: Doof", drums.play("Doof"));
    }

    @Test
    public void canCalculateMarkup(){
        drums.setBuyingPrice(800.00);
        drums.setSalePrice(1040.00);
        assertEquals(240, drums.calculateMarkup(800.00, 1040.00), 0.01);

    }
}
