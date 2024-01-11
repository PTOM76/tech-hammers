package net.pitan76.techhammers;

import ml.pkom.mcpitanlibarch.api.item.CompatibleItemSettings;
import net.pitan76.techhammers.item.GemExcavatorItem;
import net.pitan76.techhammers.item.GemHammerItem;

public class GHItems {
    public static GemHammerItem RUBY_HAMMER = new GemHammerItem(GemMaterials.RUBY, new CompatibleItemSettings().addGroup(TechHammersMod.GEM_HAMMERS, TechHammersMod.id("hammers")));
    public static GemHammerItem SAPPHIRE_HAMMER = new GemHammerItem(GemMaterials.SAPPHIRE, new CompatibleItemSettings().addGroup(TechHammersMod.GEM_HAMMERS, TechHammersMod.id("hammers")));
    public static GemHammerItem PERIDOT_HAMMER = new GemHammerItem(GemMaterials.PERIDOT, new CompatibleItemSettings().addGroup(TechHammersMod.GEM_HAMMERS, TechHammersMod.id("hammers")));
    public static GemHammerItem BRONZE_HAMMER = new GemHammerItem(GemMaterials.BRONZE, new CompatibleItemSettings().addGroup(TechHammersMod.GEM_HAMMERS, TechHammersMod.id("hammers")));

    public static GemExcavatorItem RUBY_EXCAVATOR = new GemExcavatorItem(GemMaterials.RUBY, new CompatibleItemSettings().addGroup(TechHammersMod.GEM_HAMMERS, TechHammersMod.id("hammers")));
    public static GemExcavatorItem SAPPHIRE_EXCAVATOR = new GemExcavatorItem(GemMaterials.SAPPHIRE, new CompatibleItemSettings().addGroup(TechHammersMod.GEM_HAMMERS, TechHammersMod.id("hammers")));
    public static GemExcavatorItem PERIDOT_EXCAVATOR = new GemExcavatorItem(GemMaterials.PERIDOT, new CompatibleItemSettings().addGroup(TechHammersMod.GEM_HAMMERS, TechHammersMod.id("hammers")));
    public static GemExcavatorItem BRONZE_EXCAVATOR = new GemExcavatorItem(GemMaterials.BRONZE, new CompatibleItemSettings().addGroup(TechHammersMod.GEM_HAMMERS, TechHammersMod.id("hammers")));
}
