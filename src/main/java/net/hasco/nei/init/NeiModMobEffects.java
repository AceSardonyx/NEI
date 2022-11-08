
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.hasco.nei.potion.EnlightenmentMobEffect;
import net.hasco.nei.potion.AuraPresenseMobEffect;
import net.hasco.nei.NeiMod;

public class NeiModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, NeiMod.MODID);
	public static final RegistryObject<MobEffect> ENLIGHTENMENT = REGISTRY.register("enlightenment", () -> new EnlightenmentMobEffect());
	public static final RegistryObject<MobEffect> AURA_PRESENSE = REGISTRY.register("aura_presense", () -> new AuraPresenseMobEffect());
}
