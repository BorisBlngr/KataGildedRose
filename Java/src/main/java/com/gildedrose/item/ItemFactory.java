package com.gildedrose.item;

import com.gildedrose.Item;

public class ItemFactory {

    public static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_BRIE = "Aged Brie";

    static WrappedItem buildFrom(Item item) {
        final String itemName = item.name;
        if (itemName.equals(CONJURED_MANA_CAKE)) {
            return new Conjured(item);
        }

        if (itemName.equals(SULFURAS_HAND_OF_RAGNAROS)) {
            return new Legendary(item);
        }

        if (itemName.equals(AGED_BRIE)) {
            return new AgedBrie(item);
        }

        if (itemName.equals(BACKSTAGE_PASSES)) {
            return new BackstagePass(item);
        }

        return new Common(item);
    }
}
