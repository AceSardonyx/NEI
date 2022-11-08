
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class NeiModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == NeiModItems.STAR_SILK.get())
			event.setBurnTime(300);
	}
}
