
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.hasco.nei.NeiMod;

public class NeiModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, NeiMod.MODID);
	public static final RegistryObject<SimpleParticleType> ASTRAL_FLOWER_PARTICLE = REGISTRY.register("astral_flower_particle",
			() -> new SimpleParticleType(false));
}
