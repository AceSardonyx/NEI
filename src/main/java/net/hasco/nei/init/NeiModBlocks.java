
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.hasco.nei.block.TestDog1Block;
import net.hasco.nei.block.SteelOreBlock;
import net.hasco.nei.block.SteelBlockBlock;
import net.hasco.nei.block.StarFlowerBlock;
import net.hasco.nei.block.SoulGemBlockBlock;
import net.hasco.nei.block.SilverOreBlock;
import net.hasco.nei.block.SilverBlockBlock;
import net.hasco.nei.block.PhelliumBlock;
import net.hasco.nei.block.PaperLanternBlock;
import net.hasco.nei.block.OakLanternBlock;
import net.hasco.nei.block.ImperfectStarFlowerBlock;
import net.hasco.nei.block.GoldenFlowerBlock;
import net.hasco.nei.block.FractalOreBlock;
import net.hasco.nei.block.FractalBlockBlock;
import net.hasco.nei.block.DeepslateSteelOreBlock;
import net.hasco.nei.block.DeepslateSilverOreBlock;
import net.hasco.nei.block.AstralPlainPortalBlock;
import net.hasco.nei.block.AstralBlockBlock;
import net.hasco.nei.block.AncientWoodBlock;
import net.hasco.nei.block.AncientStairsBlock;
import net.hasco.nei.block.AncientSlabBlock;
import net.hasco.nei.block.AncientPressurePlateBlock;
import net.hasco.nei.block.AncientPortalFrameCaseBlock;
import net.hasco.nei.block.AncientPortalFrameBlock;
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
	public static final RegistryObject<Block> PHELLIUM = REGISTRY.register("phellium", () -> new PhelliumBlock());
	public static final RegistryObject<Block> FRACTAL_ORE = REGISTRY.register("fractal_ore", () -> new FractalOreBlock());
	public static final RegistryObject<Block> FRACTAL_BLOCK = REGISTRY.register("fractal_block", () -> new FractalBlockBlock());
	public static final RegistryObject<Block> ANCIENT_PORTAL_FRAME = REGISTRY.register("ancient_portal_frame", () -> new AncientPortalFrameBlock());
	public static final RegistryObject<Block> ASTRAL_PLAIN_PORTAL = REGISTRY.register("astral_plain_portal", () -> new AstralPlainPortalBlock());
	public static final RegistryObject<Block> ASTRAL_BLOCK = REGISTRY.register("astral_block", () -> new AstralBlockBlock());
	public static final RegistryObject<Block> GOLDEN_FLOWER = REGISTRY.register("golden_flower", () -> new GoldenFlowerBlock());
	public static final RegistryObject<Block> IMPERFECT_STAR_FLOWER = REGISTRY.register("imperfect_star_flower",
			() -> new ImperfectStarFlowerBlock());
	public static final RegistryObject<Block> ANCIENT_PORTAL_FRAME_CASE = REGISTRY.register("ancient_portal_frame_case",
			() -> new AncientPortalFrameCaseBlock());
	public static final RegistryObject<Block> TEST_DOG_1 = REGISTRY.register("test_dog_1", () -> new TestDog1Block());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());
	public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = REGISTRY.register("deepslate_silver_ore", () -> new DeepslateSilverOreBlock());
	public static final RegistryObject<Block> STEEL_ORE = REGISTRY.register("steel_ore", () -> new SteelOreBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> DEEPSLATE_STEEL_ORE = REGISTRY.register("deepslate_steel_ore", () -> new DeepslateSteelOreBlock());
	public static final RegistryObject<Block> SOUL_GEM_BLOCK = REGISTRY.register("soul_gem_block", () -> new SoulGemBlockBlock());
	public static final RegistryObject<Block> PAPER_LANTERN = REGISTRY.register("paper_lantern", () -> new PaperLanternBlock());
	public static final RegistryObject<Block> OAK_LANTERN = REGISTRY.register("oak_lantern", () -> new OakLanternBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			StarFlowerBlock.registerRenderLayer();
			AstralPlainPortalBlock.registerRenderLayer();
			GoldenFlowerBlock.registerRenderLayer();
			ImperfectStarFlowerBlock.registerRenderLayer();
			AncientPortalFrameCaseBlock.registerRenderLayer();
			TestDog1Block.registerRenderLayer();
			PaperLanternBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			StarFlowerBlock.blockColorLoad(event);
			ImperfectStarFlowerBlock.blockColorLoad(event);
			TestDog1Block.blockColorLoad(event);
			SoulGemBlockBlock.blockColorLoad(event);
			PaperLanternBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			StarFlowerBlock.itemColorLoad(event);
			TestDog1Block.itemColorLoad(event);
		}
	}
}
