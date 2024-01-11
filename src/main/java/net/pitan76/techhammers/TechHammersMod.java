package net.pitan76.techhammers;

import ml.pkom.mcpitanlibarch.api.item.CreativeTabBuilder;
import ml.pkom.mcpitanlibarch.api.registry.ArchRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class TechHammersMod implements ModInitializer {
    public static String MOD_NAME = "Tech Hammers & Excavators";
    public static String MOD_ID = "techhammers";

    ArchRegistry registry = ArchRegistry.createRegistry(MOD_ID);

    public static ItemGroup GEM_HAMMERS = CreativeTabBuilder.create(id("hammers")).setIcon(() -> new ItemStack(GHItems.RUBY_HAMMER, 1)).build();

    @Override
    public void onInitialize() {
        registry.registerItemGroup(id("hammers"), () -> GEM_HAMMERS);

        registry.registerItem(id("ruby_hammer"), () -> GHItems.RUBY_HAMMER);
        registry.registerItem(id("sapphire_hammer"), () -> GHItems.SAPPHIRE_HAMMER);
        registry.registerItem(id("peridot_hammer"), () -> GHItems.PERIDOT_HAMMER);
        registry.registerItem(id("bronze_hammer"), () -> GHItems.BRONZE_HAMMER);

        registry.registerItem(id("ruby_excavator"), () -> GHItems.RUBY_EXCAVATOR);
        registry.registerItem(id("sapphire_excavator"), () -> GHItems.SAPPHIRE_EXCAVATOR);
        registry.registerItem(id("peridot_excavator"), () -> GHItems.PERIDOT_EXCAVATOR);
        registry.registerItem(id("bronze_excavator"), () -> GHItems.BRONZE_EXCAVATOR);

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.registerItem(id("basic_electric_hammer"), () -> TRItems.BASIC_ELECTRIC_HAMMER);
            registry.registerItem(id("advanced_electric_hammer"), () -> TRItems.ADVANCED_ELECTRIC_HAMMER);
            registry.registerItem(id("basic_electric_excavator"), () -> TRItems.BASIC_ELECTRIC_EXCAVATOR);
            registry.registerItem(id("advanced_electric_excavator"), () -> TRItems.ADVANCED_ELECTRIC_EXCAVATOR);
        }

        registry.allRegister();
    }

    public static Identifier id(String id) {
        return new Identifier(MOD_ID, id);
    }
}
