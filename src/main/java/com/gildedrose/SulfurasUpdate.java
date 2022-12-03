package com.gildedrose;

public class SulfurasUpdate implements ItemUpdateInterface{
    @Override
    public void updateItem(Item item) {
            item.quality = 80;
            item.sellIn = 0;
    }
}
