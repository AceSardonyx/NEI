
package net.hasco.nei.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.hasco.nei.procedures.StarFractalSilkItemInHandTickProcedure;
import net.hasco.nei.init.NeiModTabs;

public class StarFractalSilkItem extends Item {
	public StarFractalSilkItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			StarFractalSilkItemInHandTickProcedure.execute(entity);
	}
}
