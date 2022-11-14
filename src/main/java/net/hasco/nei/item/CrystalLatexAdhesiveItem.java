
package net.hasco.nei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.hasco.nei.procedures.EatingGlueProcedure;
import net.hasco.nei.init.NeiModTabs;

public class CrystalLatexAdhesiveItem extends Item {
	public CrystalLatexAdhesiveItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI).stacksTo(16).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EatingGlueProcedure.execute(entity);
		return retval;
	}
}
