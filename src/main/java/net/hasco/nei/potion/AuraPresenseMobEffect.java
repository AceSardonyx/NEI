
package net.hasco.nei.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.hasco.nei.procedures.AuraEffectProcedure;

public class AuraPresenseMobEffect extends MobEffect {
	public AuraPresenseMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -41121);
	}

	@Override
	public String getDescriptionId() {
		return "effect.nei.aura_presense";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		AuraEffectProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
