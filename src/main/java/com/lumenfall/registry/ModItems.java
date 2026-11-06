package com.lumenfall.registry;

import com.lumenfall.Lumenfall;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public final class ModItems {
    /** Ressource de base du mod : un fragment de lumière cristallisée. */
    public static final Item ECLAT = register("eclat", new Item(new Item.Settings()));

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Lumenfall.id(name), item);
    }

    public static void init() {}
}
