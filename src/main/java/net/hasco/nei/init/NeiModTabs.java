
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class NeiModTabs {
	public static CreativeModeTab TAB_NEI;

	public static void load() {
		TAB_NEI = new CreativeModeTab("tabnei") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(NeiModItems.NEI_ICON.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
