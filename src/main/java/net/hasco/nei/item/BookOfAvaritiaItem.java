
package net.hasco.nei.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.hasco.nei.init.NeiModTabs;

public class BookOfAvaritiaItem extends Item {
	public BookOfAvaritiaItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 1.1F;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
