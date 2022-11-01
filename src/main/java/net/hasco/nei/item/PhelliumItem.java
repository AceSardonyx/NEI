
package net.hasco.nei.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.hasco.nei.init.NeiModTabs;
import net.hasco.nei.init.NeiModFluids;

public class PhelliumItem extends BucketItem {
	public PhelliumItem() {
		super(NeiModFluids.PHELLIUM, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(NeiModTabs.TAB_NEI));
	}
}
