package net.pitan76.techhammers.item;

import draylar.magna.item.ExcavatorItem;
import draylar.magna.item.HammerItem;
import ml.pkom.mcpitanlibarch.api.item.CompatibleItemSettings;
import net.minecraft.item.ToolMaterial;

public class GemExcavatorItem extends ExcavatorItem {
    public GemExcavatorItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings, int breakRadius) {
        super(toolMaterial, attackDamage, attackSpeed, settings, breakRadius);
    }

    public GemExcavatorItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public GemExcavatorItem(ToolMaterial toolMaterial, CompatibleItemSettings settings) {
        this(toolMaterial, (int) 2.5F, -3.0F, settings.build());
    }
}
