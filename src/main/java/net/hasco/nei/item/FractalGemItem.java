
package net.hasco.nei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.hasco.nei.init.NeiModTabs;

public class FractalGemItem extends Item {
	public FractalGemItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI_CREATIVE).stacksTo(64).rarity(Rarity.COMMON));
	}
}
