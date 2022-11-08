
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.hasco.nei.NeiMod;

public class NeiModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NeiMod.MODID);
	public static final RegistryObject<SoundEvent> NUKE_GO_BOOM = REGISTRY.register("nuke_go_boom",
			() -> new SoundEvent(new ResourceLocation("nei", "nuke_go_boom")));
	public static final RegistryObject<SoundEvent> SUNKIST_DEATH = REGISTRY.register("sunkist_death",
			() -> new SoundEvent(new ResourceLocation("nei", "sunkist_death")));
	public static final RegistryObject<SoundEvent> SUNKIST_IDLE = REGISTRY.register("sunkist_idle",
			() -> new SoundEvent(new ResourceLocation("nei", "sunkist_idle")));
	public static final RegistryObject<SoundEvent> SUNKIST_HURT = REGISTRY.register("sunkist_hurt",
			() -> new SoundEvent(new ResourceLocation("nei", "sunkist_hurt")));
	public static final RegistryObject<SoundEvent> BIRD = REGISTRY.register("bird", () -> new SoundEvent(new ResourceLocation("nei", "bird")));
	public static final RegistryObject<SoundEvent> DECAYED_ZOMBIE = REGISTRY.register("decayed_zombie",
			() -> new SoundEvent(new ResourceLocation("nei", "decayed_zombie")));
	public static final RegistryObject<SoundEvent> DUCK = REGISTRY.register("duck", () -> new SoundEvent(new ResourceLocation("nei", "duck")));
	public static final RegistryObject<SoundEvent> AMBIENT_DRAGONFLY = REGISTRY.register("ambient.dragonfly",
			() -> new SoundEvent(new ResourceLocation("nei", "ambient.dragonfly")));
	public static final RegistryObject<SoundEvent> FROG = REGISTRY.register("frog", () -> new SoundEvent(new ResourceLocation("nei", "frog")));
	public static final RegistryObject<SoundEvent> MUMMY = REGISTRY.register("mummy", () -> new SoundEvent(new ResourceLocation("nei", "mummy")));
	public static final RegistryObject<SoundEvent> MOOD_ASTRAL1 = REGISTRY.register("mood.astral1",
			() -> new SoundEvent(new ResourceLocation("nei", "mood.astral1")));
	public static final RegistryObject<SoundEvent> MOOD_ASTRAL2 = REGISTRY.register("mood.astral2",
			() -> new SoundEvent(new ResourceLocation("nei", "mood.astral2")));
	public static final RegistryObject<SoundEvent> RANDOM_ASTRAL_SPLASH = REGISTRY.register("random.astral.splash",
			() -> new SoundEvent(new ResourceLocation("nei", "random.astral.splash")));
}
