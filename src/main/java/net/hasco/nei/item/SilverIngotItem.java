
package net.hasco.nei.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class SilverIngotItem extends Item {

	public SilverIngotItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}

}
