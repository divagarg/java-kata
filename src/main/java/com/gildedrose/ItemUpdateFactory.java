package com.gildedrose;

public class ItemUpdateFactory {

    public ItemUpdateInterface getItemType(Item item) {
        String itemName = item.name;
        ItemUpdateInterface itemUpdate;
        switch (itemName){
            case "Aged Brie":
                itemUpdate= new AgedBrieUpdate();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                itemUpdate= new BackstageUpdate();
                break;
            case "Sulfuras, Hand of Ragnaros":
                itemUpdate= new SulfurasUpdate();
                break;
            case "Conjured Mana Cake":
                itemUpdate= new ConjuredUpdate();
                break;
            default:
                itemUpdate = new PrimaryUpdate();
                break;
        }
        return itemUpdate;
    }
}
