package net.hasco.nei.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.hasco.nei.NeiMod;

public class AuraEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		NeiMod.queueServerWork(20, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1, 0, (true), (false)));
		});
	}
}
