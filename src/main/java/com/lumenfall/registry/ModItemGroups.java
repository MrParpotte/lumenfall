package com.lumenfall.registry;

import com.lumenfall.Lumenfall;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;

public final class ModItemGroups {
    public static final RegistryKey<ItemGroup> LUMENFALL =
            RegistryKey.of(RegistryKeys.ITEM_GROUP, Lumenfall.id("lumenfall"));

    public static void init() {
        Registry.register(Registries.ITEM_GROUP, LUMENFALL, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.ECLAT))
                .displayName(Text.translatable("itemGroup.lumenfall"))
                .entries((context, entries) -> {
                    entries.add(ModItems.ECLAT);
                    entries.add(ModBlocks.ECLAT_ORE);
                    entries.add(ModBlocks.ECLATITE_BLOCK);
                }).build());
    }
}
