
package net.hasco.nei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.hasco.nei.init.NeiModTabs;

public class PhosphocoreItem extends Item {
	public PhosphocoreItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI).stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
