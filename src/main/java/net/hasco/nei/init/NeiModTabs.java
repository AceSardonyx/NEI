
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class NeiModTabs {
	public static CreativeModeTab TAB_NEI_CREATIVE;

	public static void load() {
		TAB_NEI_CREATIVE = new CreativeModeTab("tabnei_creative") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(NeiModItems.NEI_ICON.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
