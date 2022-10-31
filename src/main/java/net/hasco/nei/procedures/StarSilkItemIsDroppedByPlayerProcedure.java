package net.hasco.nei.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.hasco.nei.init.NeiModItems;
import net.hasco.nei.init.NeiModBlocks;

public class StarSilkItemIsDroppedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWaterRainOrBubble()) {
			for (int index0 = 0; index0 < (int) (1); index0++) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")), SoundSource.AMBIENT, 5, 2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.ambient")),
								SoundSource.AMBIENT, 5, 2, false);
					}
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(NeiModItems.STAR_FRACTAL_SILK.get()));
					entityToSpawn.setPickUpDelay(0);
					_level.addFreshEntity(entityToSpawn);
				}
				world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(NeiModBlocks.ASTRAL_BLOCK.get().defaultBlockState()));
			}
		} else {
			world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0, 1, 0);
			world.addParticle(ParticleTypes.ENCHANTED_HIT, x, y, z, 0, 1, 0);
		}
	}
}
