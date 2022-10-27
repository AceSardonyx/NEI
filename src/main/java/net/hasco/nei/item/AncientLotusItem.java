
package net.hasco.nei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.hasco.nei.procedures.AncientLotusPlayerFinishesUsingItemProcedure;

public class AncientLotusItem extends Item {
	public AncientLotusItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).fireResistant().rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(-1).saturationMod(0.1f).alwaysEat()

						.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AncientLotusPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
