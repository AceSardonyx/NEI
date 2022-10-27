
package net.hasco.nei.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.hasco.nei.init.NeiModFluids;

public class PhelliumBlock extends LiquidBlock {
	public PhelliumBlock() {
		super(() -> (FlowingFluid) NeiModFluids.PHELLIUM.get(), BlockBehaviour.Properties.of(Material.WATER, MaterialColor.ICE).strength(317f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 1));
	}
}
