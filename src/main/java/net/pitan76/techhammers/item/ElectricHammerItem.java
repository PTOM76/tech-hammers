package net.pitan76.techhammers.item;

import ml.pkom.mcpitanlibarch.api.item.CompatibleItemSettings;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import reborncore.common.powerSystem.RcEnergyItem;
import reborncore.common.powerSystem.RcEnergyTier;
import reborncore.common.util.ItemUtils;

public class ElectricHammerItem extends GemHammerItem implements RcEnergyItem {
    public final int energyCapacity;
    public final RcEnergyTier tier;
    public final int cost;
    public final float poweredSpeed;
    public final float unpoweredSpeed;

    public ElectricHammerItem(ToolMaterial toolMaterial, CompatibleItemSettings settings, int energyCapacity, RcEnergyTier tier, int cost, float poweredSpeed, float unpoweredSpeed) {
        super(toolMaterial, settings);
        this.energyCapacity = energyCapacity;
        this.tier = tier;
        this.cost = cost;
        this.poweredSpeed = poweredSpeed;
        this.unpoweredSpeed = unpoweredSpeed;
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if (this.getStoredEnergy(stack) >= this.cost) {
            return stack.getItem().isSuitableFor(state) ? this.poweredSpeed : Math.min(this.unpoweredSpeed * 10.0F, this.poweredSpeed);
        } else {
            return this.unpoweredSpeed;
        }
    }

    @Override
    public long getEnergyCapacity() {
        return energyCapacity;
    }

    @Override
    public RcEnergyTier getTier() {
        return tier;
    }

    @Override
    public int getItemBarStep(ItemStack stack) {
        return ItemUtils.getPowerForDurabilityBar(stack);
    }

    @Override
    public boolean isItemBarVisible(ItemStack stack) {
        return true;
    }

    @Override
    public int getItemBarColor(ItemStack stack) {
        return ItemUtils.getColorForDurabilityBar(stack);
    }

    @Override
    public long getEnergyMaxOutput() {
        return 0L;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return false;
    }

    @Override
    public boolean isDamageable() {
        return false;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        if (state == null) {
            return false;
        } else if (Items.DIAMOND_PICKAXE.isSuitableFor(state)) {
            return true;
        } else {
            return Items.DIAMOND_PICKAXE.getMiningSpeedMultiplier(new ItemStack(Items.DIAMOND_PICKAXE), state) > 1.0F;
        }
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (world.random.nextInt(EnchantmentHelper.getLevel(Enchantments.UNBREAKING, stack) + 1) == 0) {
            this.tryUseEnergy(stack, this.cost);
        }

        return true;
    }
}
