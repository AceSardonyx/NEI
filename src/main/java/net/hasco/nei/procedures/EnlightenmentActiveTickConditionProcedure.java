package net.hasco.nei.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class EnlightenmentActiveTickConditionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		class EnlightenmentActiveTickConditionWait4 {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				this.world = world;
				MinecraftForge.EVENT_BUS.register(EnlightenmentActiveTickConditionWait4.this);
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					EnlightenmentActiveTickConditionWait4.this.ticks += 1;
					if (EnlightenmentActiveTickConditionWait4.this.ticks >= EnlightenmentActiveTickConditionWait4.this.waitTicks)
						run();
				}
			}

			private void run() {
				MinecraftForge.EVENT_BUS.unregister(EnlightenmentActiveTickConditionWait4.this);
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel(20);
				if (entity instanceof Player _player)
					_player.getFoodData().setSaturation(20);
			}
		}
		new EnlightenmentActiveTickConditionWait4().start(world, 20);
	}
}
