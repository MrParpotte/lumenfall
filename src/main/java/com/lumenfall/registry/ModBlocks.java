package com.lumenfall.registry;

import com.lumenfall.Lumenfall;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public final class ModBlocks {
    /** Minerai d'Éclat : lumineux, niveau 7, apparaît dans la deepslate. */
    public static final Block ECLAT_ORE = register("eclat_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE).luminance(state -> 7)));

    /** Bloc d'Éclatite : 9 Éclats, source de lumière maximale. */
    public static final Block ECLATITE_BLOCK = register("eclatite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).luminance(state -> 15)));

    private static Block register(String name, Block block) {
        Identifier id = Lumenfall.id(name);
        Registry.register(Registries.ITEM, id, new BlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void init() {}
}
