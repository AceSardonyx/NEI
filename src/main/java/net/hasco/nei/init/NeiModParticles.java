
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.hasco.nei.client.particle.AstralFlowerParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NeiModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(NeiModParticleTypes.ASTRAL_FLOWER_PARTICLE.get(), AstralFlowerParticleParticle::provider);
	}
}
