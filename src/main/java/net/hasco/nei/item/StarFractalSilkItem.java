
package net.hasco.nei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.hasco.nei.init.NeiModTabs;

public class StarFractalSilkItem extends Item {
	public StarFractalSilkItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI_CREATIVE).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
