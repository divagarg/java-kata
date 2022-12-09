package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        ItemUpdateFactory updateFactory = new ItemUpdateFactory();
        for (Item item : items) {
            ItemUpdateInterface typedItem = updateFactory.getItemType(item);
            typedItem.updateItem(item);
        }
    }
}
