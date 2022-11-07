
package net.hasco.nei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.hasco.nei.init.NeiModTabs;

public class SoulGemItem extends Item {
	public SoulGemItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
