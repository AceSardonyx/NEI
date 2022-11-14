
package net.hasco.nei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.hasco.nei.init.NeiModTabs;

public class SlimePowderItem extends Item {
	public SlimePowderItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(0.1f)

						.build()));
	}
}
