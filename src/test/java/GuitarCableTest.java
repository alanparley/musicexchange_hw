import Accessories.GuitarCable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarCableTest {

    GuitarCable guitarCable;

    @Before
    public void before(){
        guitarCable = new GuitarCable("Wirey", "3ft mono", 10, 15);

    }

    @Test
    public void canGetMake(){
        assertEquals("Wirey", guitarCable.getMake());
    }

    @Test
    public void canGetDescription(){
        assertEquals("3ft mono", guitarCable.getDescription());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(0.00, guitarCable.getBuyingPrice(), 0.01);
    }

    @Test
    public void canSetBuyingPrice(){
        guitarCable.setBuyingPrice(10.00);
        assertEquals(10.00, guitarCable.getBuyingPrice(), 0.00);

    }

    @Test
    public void canCalculateMarkup(){
        guitarCable.setBuyingPrice(10.00);
        guitarCable.setSalePrice(15.00);
        assertEquals(5, guitarCable.calculateMarkup(guitarCable.getBuyingPrice(), guitarCable.getSalePrice()), 0.01);

    }
}
