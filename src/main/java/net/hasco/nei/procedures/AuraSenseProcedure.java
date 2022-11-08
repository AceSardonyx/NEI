package net.hasco.nei.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.hasco.nei.init.NeiModMobEffects;

public class AuraSenseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(NeiModMobEffects.AURA_PRESENSE.get(), 10, 0, (true), (false)));
	}
}
