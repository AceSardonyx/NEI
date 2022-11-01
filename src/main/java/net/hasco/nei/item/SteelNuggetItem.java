
package net.hasco.nei.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class SteelNuggetItem extends Item {

	public SteelNuggetItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

}
