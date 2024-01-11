package net.pitan76.techhammers;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public enum GemMaterials implements ToolMaterial {
    BRONZE(2, 375, 7.0F, 2.25F, 6, Ingredient.fromTag(TagKey.of(Registry.ITEM_KEY, new Identifier("c:bronze_ingots")))),
    RUBY(2, 750, 6.0F, 1.5F, 10, Ingredient.fromTag(TagKey.of(Registry.ITEM_KEY, new Identifier("c:rubies")))),
    SAPPHIRE(3, 1000, 7.0F, 1.5F, 12, Ingredient.fromTag(TagKey.of(Registry.ITEM_KEY, new Identifier("c:sapphires")))),
    PERIDOT(2, 750, 7.0F, 1.5F, 12, Ingredient.fromTag(TagKey.of(Registry.ITEM_KEY, new Identifier("c:peridots"))));

    final int durability;
    final float miningSpeedMultiplier;
    final float attackDamage;
    final int miningLevel;
    final int enchantability;
    final Ingredient repairIngredient;

    GemMaterials(int miningLevel, int durability, float miningSpeedMultiplier, float attackDamage, int enchantability, Ingredient repairIngredient) {
        this.miningLevel = miningLevel;
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient;
    }
}
