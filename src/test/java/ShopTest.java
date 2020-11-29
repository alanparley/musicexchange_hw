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

    @Test
    public void canGetStockcount(){
        assertEquals(0, shop.getStockcount().size());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addToStock(drums);
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.addToStock(violin);
        assertEquals(4, shop.getStockcount().size());
    }

    @Test
    public void canRemoveItemsFromStock(){
        shop.addToStock(drums);
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.addToStock(violin);
        shop.removeFromStock(drums);
        shop.removeFromStock(guitar);
        assertEquals(2, shop.getStockcount().size());

    }

}
