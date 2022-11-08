package net.hasco.nei.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.hasco.nei.init.NeiModItems;

public class StarFlowerHarvestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(new BlockPos(x, y, z), false);
		if (world instanceof Level _level && !_level.isClientSide()) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(NeiModItems.STAR_SILK.get()));
			entityToSpawn.setPickUpDelay(7);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
