
package net.hasco.nei.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.hasco.nei.procedures.EnlightenmentActiveTickConditionProcedure;

public class EnlightenmentMobEffect extends MobEffect {
	public EnlightenmentMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3355393);
	}

	@Override
	public String getDescriptionId() {
		return "effect.nei.enlightenment";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnlightenmentActiveTickConditionProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
