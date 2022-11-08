
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.hasco.nei.network.InterestKeyMessage;
import net.hasco.nei.NeiMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class NeiModKeyMappings {
	public static final KeyMapping INTEREST_KEY = new KeyMapping("key.nei.interest_key", GLFW.GLFW_KEY_I, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				NeiMod.PACKET_HANDLER.sendToServer(new InterestKeyMessage(0, 0));
				InterestKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(INTEREST_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				INTEREST_KEY.consumeClick();
			}
		}
	}
}
