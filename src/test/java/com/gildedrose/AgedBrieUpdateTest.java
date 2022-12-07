package com.gildedrose;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieUpdateTest {
    @Test
    @DisplayName("updateAgedBrie_normalDayInRangeQuality")
    void updateAgedBrie_normalDayInRangeQuality() {
        Item[] items = new Item[] { new Item("Aged Brie", 15, 20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(21, app.items[0].quality);
        assertEquals(14, app.items[0].sellIn);
    }

    @Test
    void updateAgedBrie_normalDayMaxQuality() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void updateAgedBrie_afterExpiryInRangeQuality() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(42, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void updateAgedBrie_afterExpiryMaxQuality() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }


}
