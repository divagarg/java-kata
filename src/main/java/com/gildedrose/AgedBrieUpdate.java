package com.gildedrose;

public class AgedBrieUpdate implements ItemUpdateInterface {
    @Override
    public void updateItem(Item item) {
        //update quality
        increaseQuality(item);

        //update sell in
        item.sellIn = item.sellIn - 1;

        //update expiry
        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
