
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.hasco.nei.block.StarFlowerBlock;
import net.hasco.nei.block.SoulGemBlockBlock;
import net.hasco.nei.block.ImperfectStarFlowerBlock;
import net.hasco.nei.block.GoldenFlowerBlock;
import net.hasco.nei.block.FractalGemOreBlock;
import net.hasco.nei.block.FractalGemBlockBlock;
import net.hasco.nei.block.AstralBlockBlock;
import net.hasco.nei.block.AncientWoodBlock;
import net.hasco.nei.block.AncientStairsBlock;
import net.hasco.nei.block.AncientSlabBlock;
import net.hasco.nei.block.AncientPressurePlateBlock;
import net.hasco.nei.block.AncientPlanksBlock;
import net.hasco.nei.block.AncientLogBlock;
import net.hasco.nei.block.AncientLeavesBlock;
import net.hasco.nei.block.AncientFenceGateBlock;
import net.hasco.nei.block.AncientFenceBlock;
import net.hasco.nei.block.AncientButtonBlock;
import net.hasco.nei.NeiMod;

public class NeiModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NeiMod.MODID);
	public static final RegistryObject<Block> STAR_FLOWER = REGISTRY.register("star_flower", () -> new StarFlowerBlock());
	public static final RegistryObject<Block> ANCIENT_WOOD = REGISTRY.register("ancient_wood", () -> new AncientWoodBlock());
	public static final RegistryObject<Block> ANCIENT_LOG = REGISTRY.register("ancient_log", () -> new AncientLogBlock());
	public static final RegistryObject<Block> ANCIENT_PLANKS = REGISTRY.register("ancient_planks", () -> new AncientPlanksBlock());
	public static final RegistryObject<Block> ANCIENT_LEAVES = REGISTRY.register("ancient_leaves", () -> new AncientLeavesBlock());
	public static final RegistryObject<Block> ANCIENT_STAIRS = REGISTRY.register("ancient_stairs", () -> new AncientStairsBlock());
	public static final RegistryObject<Block> ANCIENT_SLAB = REGISTRY.register("ancient_slab", () -> new AncientSlabBlock());
	public static final RegistryObject<Block> ANCIENT_FENCE = REGISTRY.register("ancient_fence", () -> new AncientFenceBlock());
	public static final RegistryObject<Block> ANCIENT_FENCE_GATE = REGISTRY.register("ancient_fence_gate", () -> new AncientFenceGateBlock());
	public static final RegistryObject<Block> ANCIENT_PRESSURE_PLATE = REGISTRY.register("ancient_pressure_plate",
			() -> new AncientPressurePlateBlock());
	public static final RegistryObject<Block> ANCIENT_BUTTON = REGISTRY.register("ancient_button", () -> new AncientButtonBlock());
	public static final RegistryObject<Block> FRACTAL_GEM_ORE = REGISTRY.register("fractal_gem_ore", () -> new FractalGemOreBlock());
	public static final RegistryObject<Block> FRACTAL_GEM_BLOCK = REGISTRY.register("fractal_gem_block", () -> new FractalGemBlockBlock());
	public static final RegistryObject<Block> GOLDEN_FLOWER = REGISTRY.register("golden_flower", () -> new GoldenFlowerBlock());
	public static final RegistryObject<Block> IMPERFECT_STAR_FLOWER = REGISTRY.register("imperfect_star_flower",
			() -> new ImperfectStarFlowerBlock());
	public static final RegistryObject<Block> ASTRAL_BLOCK = REGISTRY.register("astral_block", () -> new AstralBlockBlock());
	public static final RegistryObject<Block> SOUL_GEM_BLOCK = REGISTRY.register("soul_gem_block", () -> new SoulGemBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			StarFlowerBlock.blockColorLoad(event);
			ImperfectStarFlowerBlock.blockColorLoad(event);
			SoulGemBlockBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			StarFlowerBlock.itemColorLoad(event);
		}
	}
}
