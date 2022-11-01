
package net.hasco.nei.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class SilverNuggetItem extends Item {

	public SilverNuggetItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI).stacksTo(64).rarity(Rarity.COMMON));
	}

}
