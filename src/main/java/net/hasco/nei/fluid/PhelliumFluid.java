
package net.hasco.nei.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.hasco.nei.init.NeiModItems;
import net.hasco.nei.init.NeiModFluids;
import net.hasco.nei.init.NeiModBlocks;

public abstract class PhelliumFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(NeiModFluids.PHELLIUM,
			NeiModFluids.FLOWING_PHELLIUM,
			FluidAttributes.builder(new ResourceLocation("nei:blocks/water"), new ResourceLocation("nei:blocks/water")).luminosity(1)

					.temperature(200)

					.rarity(Rarity.UNCOMMON))
			.explosionResistance(317f)

			.tickRate(7)

			.bucket(NeiModItems.PHELLIUM_BUCKET).block(() -> (LiquidBlock) NeiModBlocks.PHELLIUM.get());

	private PhelliumFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.TOTEM_OF_UNDYING;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(1.7000000000000002);
	}

	public static class Source extends PhelliumFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PhelliumFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
