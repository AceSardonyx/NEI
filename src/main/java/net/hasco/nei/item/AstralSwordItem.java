
package net.hasco.nei.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.hasco.nei.init.NeiModTabs;

import java.util.List;

public class AstralSwordItem extends SwordItem {
	public AstralSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 91100;
			}

			public float getSpeed() {
				return 12.5f;
			}

			public float getAttackDamageBonus() {
				return 39.5f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.BEDROCK));
			}
		}, 3, -2.2f, new Item.Properties().tab(NeiModTabs.TAB_NEI_CREATIVE).fireResistant());
	}

	@Override
	public boolean hasCraftingRemainingItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Beta"));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
