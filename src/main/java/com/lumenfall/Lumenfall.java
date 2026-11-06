package com.lumenfall;

import com.lumenfall.registry.ModBlocks;
import com.lumenfall.registry.ModItemGroups;
import com.lumenfall.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lumenfall implements ModInitializer {
    public static final String MOD_ID = "lumenfall";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        ModItems.init();
        ModBlocks.init();
        ModItemGroups.init();

        // Le minerai d'Éclat apparaît dans les profondeurs de l'Overworld
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(RegistryKeys.PLACED_FEATURE, id("eclat_ore")));

        LOGGER.info("Lumenfall chargé : la lumière descend.");
    }
}
