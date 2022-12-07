package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConjuredUpdateTest {

    @Test
    void updateConjured_normalDayInRangeQuality() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 15, 20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(18, app.items[0].quality);
        assertEquals(14, app.items[0].sellIn);
    }

    @Test
    void updateConjured_normalDayInRangeQuality2() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 10, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(28, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void updateConjured_expiryDayInRangeQuality() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 0, 40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(36, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void updateConjured_expiryDayMinQuality() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 0, 1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void updateConjured_expiryDayMinQuality2() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 0, 3)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

}
