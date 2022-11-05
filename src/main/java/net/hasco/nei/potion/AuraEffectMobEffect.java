
package net.hasco.nei.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.hasco.nei.procedures.AuraEffectOnEffectActiveTickProcedure;

public class AuraEffectMobEffect extends MobEffect {
	public AuraEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -41121);
	}

	@Override
	public String getDescriptionId() {
		return "effect.nei.aura_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		AuraEffectOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
