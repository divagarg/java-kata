package com.gildedrose;

public class PrimaryItemUpdate implements ItemUpdateInterface {

    @Override
    public void updateItem(Item item) {
        //update quality
        decreaseQuality(item);

        //update sell in
        item.sellIn = item.sellIn - 1;

        //update expiry
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
