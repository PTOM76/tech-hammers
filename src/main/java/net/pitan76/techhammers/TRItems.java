package net.pitan76.techhammers;

import net.pitan76.mcpitanlib.api.item.CompatibleItemSettings;
import net.pitan76.techhammers.item.ElectricExcavatorItem;
import net.pitan76.techhammers.item.ElectricHammerItem;
import reborncore.common.powerSystem.RcEnergyTier;
import techreborn.config.TechRebornConfig;
import techreborn.init.TRToolMaterials;

// Electric TR Hammers
public class TRItems {
    public static ElectricHammerItem BASIC_ELECTRIC_HAMMER = new ElectricHammerItem(TRToolMaterials.BASIC_DRILL, new CompatibleItemSettings().addGroup(TechHammersMod.GEM_HAMMERS, TechHammersMod.id("hammers")), TechRebornConfig.basicDrillCharge, RcEnergyTier.MEDIUM, TechRebornConfig.basicDrillCost, 6.0F, -0.5F);
    public static ElectricHammerItem ADVANCED_ELECTRIC_HAMMER = new ElectricHammerItem(TRToolMaterials.ADVANCED_DRILL, new CompatibleItemSettings().addGroup(TechHammersMod.GEM_HAMMERS, TechHammersMod.id("hammers")), TechRebornConfig.advancedDrillCharge, RcEnergyTier.EXTREME, TechRebornConfig.advancedDrillCost, 12.0F, 0.2F);

    public static ElectricExcavatorItem BASIC_ELECTRIC_EXCAVATOR = new ElectricExcavatorItem(TRToolMaterials.BASIC_DRILL, new CompatibleItemSettings().addGroup(TechHammersMod.GEM_HAMMERS, TechHammersMod.id("hammers")), TechRebornConfig.basicDrillCharge, RcEnergyTier.MEDIUM, TechRebornConfig.basicDrillCost, 6.0F, -0.5F);
    public static ElectricExcavatorItem ADVANCED_ELECTRIC_EXCAVATOR = new ElectricExcavatorItem(TRToolMaterials.ADVANCED_DRILL, new CompatibleItemSettings().addGroup(TechHammersMod.GEM_HAMMERS, TechHammersMod.id("hammers")), TechRebornConfig.advancedDrillCharge, RcEnergyTier.EXTREME, TechRebornConfig.advancedDrillCost, 12.0F, 0.2F);
}
