package net.pitan76.techhammers.tr;

import net.pitan76.techhammers.TRItems;

import static net.pitan76.techhammers.TechHammersMod.id;
import static net.pitan76.techhammers.TechHammersMod.registry;

public class TRAddon {
    public static void register() {
        registry.registerItem(id("basic_electric_hammer"), () -> TRItems.BASIC_ELECTRIC_HAMMER);
        registry.registerItem(id("advanced_electric_hammer"), () -> TRItems.ADVANCED_ELECTRIC_HAMMER);
        registry.registerItem(id("basic_electric_excavator"), () -> TRItems.BASIC_ELECTRIC_EXCAVATOR);
        registry.registerItem(id("advanced_electric_excavator"), () -> TRItems.ADVANCED_ELECTRIC_EXCAVATOR);
    }
}
