package net.hasco.nei.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.hasco.nei.NeiMod;

public class EnlightenmentEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		NeiMod.queueServerWork(20, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel(20);
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation(20);
		});
	}
}
