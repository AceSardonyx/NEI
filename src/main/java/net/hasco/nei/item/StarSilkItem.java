
package net.hasco.nei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;

import net.hasco.nei.procedures.IsStarSilkGrowingProcedure;
import net.hasco.nei.init.NeiModTabs;

public class StarSilkItem extends Item {
	public StarSilkItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI_CREATIVE).stacksTo(64).fireResistant().rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.1f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 15;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		IsStarSilkGrowingProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return true;
	}
}
