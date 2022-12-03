package com.gildedrose;

public class BackstageUpdate implements ItemUpdateInterface{
    @Override
    public void updateItem(Item item) {
        // update quality
        increaseQuality(item);

        if (item.sellIn < 11) {
            increaseQuality(item);
        }

        if (item.sellIn < 6) {
            increaseQuality(item);
        }

        // update sell in
        item.sellIn = item.sellIn - 1;

        //update expiry
        if (item.sellIn < 0) {
            item.quality =0;
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
