package net.pitan76.techhammers;

import net.pitan76.mcpitanlib.api.item.CreativeTabBuilder;
import net.pitan76.mcpitanlib.api.registry.CompatRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.pitan76.techhammers.tr.TRAddon;

public class TechHammersMod implements ModInitializer {
    public static String MOD_NAME = "Tech Hammers & Excavators";
    public static String MOD_ID = "techhammers";

    public static CompatRegistry registry = CompatRegistry.createRegistry(MOD_ID);

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
            TRAddon.register();
        }

        registry.allRegister();
    }

    public static Identifier id(String id) {
        return new Identifier(MOD_ID, id);
    }
}
