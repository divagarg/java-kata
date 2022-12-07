package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimaryUpdateTest {

    @Test
    void updatePrimary_normalDayInRangeQuality() {
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", 15, 20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(19, app.items[0].quality);
        assertEquals(14, app.items[0].sellIn);
    }

    @Test
    void updatePrimary_normalDayInRangeQuality2() {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 10, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(29, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void updatePrimary_normalDayMaxQuality() {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(49, app.items[0].quality);
        assertEquals(4, app.items[0].sellIn);
    }

    @Test
    void updatePrimary_expiryDayInRangeQuality() {
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", 0, 35)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(33, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void updatePrimary_expiryDayMinQuality() {
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", 0, 1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

}
