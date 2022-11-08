
package net.hasco.nei.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.hasco.nei.procedures.ConsumedAncientLotusProcedure;
import net.hasco.nei.init.NeiModTabs;

public class AncientLotusItem extends Item {
	public AncientLotusItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI_CREATIVE).stacksTo(64).fireResistant().rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(-1).saturationMod(0.1f).alwaysEat()

						.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(Blocks.SMALL_AMETHYST_BUD);
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ConsumedAncientLotusProcedure.execute(entity);
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
