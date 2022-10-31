
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NeiModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("nei", "nuke_go_boom"), new SoundEvent(new ResourceLocation("nei", "nuke_go_boom")));
		REGISTRY.put(new ResourceLocation("nei", "sunkist_death"), new SoundEvent(new ResourceLocation("nei", "sunkist_death")));
		REGISTRY.put(new ResourceLocation("nei", "sunkist_idle"), new SoundEvent(new ResourceLocation("nei", "sunkist_idle")));
		REGISTRY.put(new ResourceLocation("nei", "sunkist_hurt"), new SoundEvent(new ResourceLocation("nei", "sunkist_hurt")));
		REGISTRY.put(new ResourceLocation("nei", "bird"), new SoundEvent(new ResourceLocation("nei", "bird")));
		REGISTRY.put(new ResourceLocation("nei", "decayed_zombie"), new SoundEvent(new ResourceLocation("nei", "decayed_zombie")));
		REGISTRY.put(new ResourceLocation("nei", "duck"), new SoundEvent(new ResourceLocation("nei", "duck")));
		REGISTRY.put(new ResourceLocation("nei", "ambient.dragonfly"), new SoundEvent(new ResourceLocation("nei", "ambient.dragonfly")));
		REGISTRY.put(new ResourceLocation("nei", "frog"), new SoundEvent(new ResourceLocation("nei", "frog")));
		REGISTRY.put(new ResourceLocation("nei", "mummy"), new SoundEvent(new ResourceLocation("nei", "mummy")));
		REGISTRY.put(new ResourceLocation("nei", "mood.astral1"), new SoundEvent(new ResourceLocation("nei", "mood.astral1")));
		REGISTRY.put(new ResourceLocation("nei", "mood.astral2"), new SoundEvent(new ResourceLocation("nei", "mood.astral2")));
		REGISTRY.put(new ResourceLocation("nei", "random.astral.splash"), new SoundEvent(new ResourceLocation("nei", "random.astral.splash")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
