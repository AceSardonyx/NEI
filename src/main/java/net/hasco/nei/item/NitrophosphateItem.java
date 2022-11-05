
package net.hasco.nei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.hasco.nei.procedures.NitrophosphatePlayerFinishesUsingItemProcedure;
import net.hasco.nei.init.NeiModTabs;

public class NitrophosphateItem extends Item {
	public NitrophosphateItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(17).saturationMod(7.2f).alwaysEat()

						.build()));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(Items.GLOWSTONE_DUST);
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(Items.GLASS_BOTTLE);
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		NitrophosphatePlayerFinishesUsingItemProcedure.execute(entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
