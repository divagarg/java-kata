package com.gildedrose;

public class SulfurasUpdate implements ItemUpdateInterface{

    static final int QUALITY = 80;
    static final int SELL_IN = 0;
    @Override
    public void updateItem(Item item) {
            item.quality = QUALITY;
            item.sellIn = SELL_IN;
    }
}
