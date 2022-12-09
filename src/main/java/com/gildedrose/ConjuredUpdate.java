package com.gildedrose;

/**
 * "Conjured" items degrade in Quality twice as fast as normal items
 *
 */
public class ConjuredUpdate implements ItemUpdateInterface{
    /**
     * update item quality & sell-in
     * @param item conjured item
     */
    @Override
    public void updateItem(Item item) {
        //update quality
        decreaseQuality(item);
        decreaseQuality(item);

        //update sell in
        item.sellIn = item.sellIn - 1;

        //update expiry
        if (item.sellIn < 0) {
            decreaseQuality(item);
            decreaseQuality(item);
        }
    }
    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
