package net.hasco.nei.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.hasco.nei.init.NeiModItems;
import net.hasco.nei.init.NeiModBlocks;
import net.hasco.nei.NeiMod;

import java.util.Iterator;

public class IsStarSilkGrowingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWaterRainOrBubble()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")),
							SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.BREAK);
			if (!entity.level.isClientSide())
				entity.discard();
			NeiMod.queueServerWork(30, () -> {
				world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(NeiModBlocks.ASTRAL_BLOCK.get().defaultBlockState()));
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(NeiModItems.STAR_FRACTAL_SILK.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("nei:fractal_from_seeds"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("It Grows..."), (true));
				if (entity.isInWaterRainOrBubble()) {
					NeiMod.queueServerWork(1000, () -> {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Bigger It Goes..."), (true));
						NeiMod.queueServerWork(300, () -> {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("Who Knows..."), (true));
							NeiMod.queueServerWork(300, () -> {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("You Notice The Fractal Sparking From The Water..."), (true));
								NeiMod.queueServerWork(200, () -> {
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
										entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
										entityToSpawn.setVisualOnly(true);
										_level.addFreshEntity(entityToSpawn);
									}
									if (world instanceof Level _level && !_level.isClientSide())
										_level.explode(null, x, y, z, 10, Explosion.BlockInteraction.BREAK);
								});
							});
						});
					});
				}
			});
		} else if (!entity.isInWaterRainOrBubble()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x, y, z, 5, 3, 3, 3, 1);
		}
	}
}
