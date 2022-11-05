package net.hasco.nei.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.hasco.nei.init.NeiModMobEffects;

public class ContainedAuraPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(NeiModMobEffects.ENLIGHTENMENT.get(), 1000, 0, (false), (false)));
	}
}
