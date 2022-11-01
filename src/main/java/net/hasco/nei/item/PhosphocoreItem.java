
package net.hasco.nei.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class PhosphocoreItem extends Item {

	public PhosphocoreItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI).stacksTo(16).rarity(Rarity.UNCOMMON));
	}

}
