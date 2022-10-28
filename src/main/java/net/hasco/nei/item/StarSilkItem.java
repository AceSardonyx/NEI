
package net.hasco.nei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;

import net.hasco.nei.procedures.StarSilkItemIsDroppedByPlayerProcedure;

public class StarSilkItem extends Item {
	public StarSilkItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).fireResistant().rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(-2).saturationMod(-0.1f)

						.build()));
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		StarSilkItemIsDroppedByPlayerProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return true;
	}
}
