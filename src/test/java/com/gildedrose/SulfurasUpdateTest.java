package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SulfurasUpdateTest {

    @Test
    void updateSulfuras_normalDayMaxQuality() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void updateSulfuras_expiryDayMaxQuality() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void updateSulfuras_normalDayInRangeQuality() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

}
