package com.imrepublic;

import org.junit.Test;
import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void foo() {
      String name = "Aged Brie";
      Item[] items = new Item[] { new Item(name, 10, 2) };
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(name, app.items[0].name);
      assertEquals(3, app.items[0].quality);
    }

}
