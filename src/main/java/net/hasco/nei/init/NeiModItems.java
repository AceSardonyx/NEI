
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.hasco.nei.item.StardustItem;
import net.hasco.nei.item.StarSilkItem;
import net.hasco.nei.item.StarFractalSilkItem;
import net.hasco.nei.item.StarClusterItem;
import net.hasco.nei.item.PhelliumItem;
import net.hasco.nei.item.NEIIconItem;
import net.hasco.nei.item.FractalItem;
import net.hasco.nei.item.AstralTomeItem;
import net.hasco.nei.item.AstralSwordBetaItem;
import net.hasco.nei.item.AstralPlainItem;
import net.hasco.nei.item.AncientLotusItem;
import net.hasco.nei.item.AmuletOfFlightItem;
import net.hasco.nei.NeiMod;

public class NeiModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NeiMod.MODID);
	public static final RegistryObject<Item> STAR_SILK = REGISTRY.register("star_silk", () -> new StarSilkItem());
	public static final RegistryObject<Item> STAR_FLOWER = block(NeiModBlocks.STAR_FLOWER, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> NEI_ICON = REGISTRY.register("nei_icon", () -> new NEIIconItem());
	public static final RegistryObject<Item> ANCIENT_WOOD = block(NeiModBlocks.ANCIENT_WOOD, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> ANCIENT_LOG = block(NeiModBlocks.ANCIENT_LOG, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> ANCIENT_PLANKS = block(NeiModBlocks.ANCIENT_PLANKS, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> ANCIENT_LEAVES = block(NeiModBlocks.ANCIENT_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ANCIENT_STAIRS = block(NeiModBlocks.ANCIENT_STAIRS, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> ANCIENT_SLAB = block(NeiModBlocks.ANCIENT_SLAB, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> ANCIENT_FENCE = block(NeiModBlocks.ANCIENT_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ANCIENT_FENCE_GATE = block(NeiModBlocks.ANCIENT_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ANCIENT_PRESSURE_PLATE = block(NeiModBlocks.ANCIENT_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ANCIENT_BUTTON = block(NeiModBlocks.ANCIENT_BUTTON, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> FRACTAL = REGISTRY.register("fractal", () -> new FractalItem());
	public static final RegistryObject<Item> PHELLIUM_BUCKET = REGISTRY.register("phellium_bucket", () -> new PhelliumItem());
	public static final RegistryObject<Item> FRACTAL_ORE = block(NeiModBlocks.FRACTAL_ORE, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> FRACTAL_BLOCK = block(NeiModBlocks.FRACTAL_BLOCK, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> ANCIENT_PORTAL_FRAME = block(NeiModBlocks.ANCIENT_PORTAL_FRAME, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> ASTRAL_PLAIN = REGISTRY.register("astral_plain", () -> new AstralPlainItem());
	public static final RegistryObject<Item> ASTRAL_BLOCK = block(NeiModBlocks.ASTRAL_BLOCK, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> ASTRAL_SWORD_BETA = REGISTRY.register("astral_sword_beta", () -> new AstralSwordBetaItem());
	public static final RegistryObject<Item> GOLDEN_FLOWER = block(NeiModBlocks.GOLDEN_FLOWER, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> ANCIENT_LOTUS = REGISTRY.register("ancient_lotus", () -> new AncientLotusItem());
	public static final RegistryObject<Item> STARDUST = REGISTRY.register("stardust", () -> new StardustItem());
	public static final RegistryObject<Item> IMPERFECT_STAR_FLOWER = block(NeiModBlocks.IMPERFECT_STAR_FLOWER, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> STAR_CLUSTER = REGISTRY.register("star_cluster", () -> new StarClusterItem());
	public static final RegistryObject<Item> STAR_FRACTAL_SILK = REGISTRY.register("star_fractal_silk", () -> new StarFractalSilkItem());
	public static final RegistryObject<Item> ASTRAL_TOME = REGISTRY.register("astral_tome", () -> new AstralTomeItem());
	public static final RegistryObject<Item> AMULET_OF_FLIGHT_CHESTPLATE = REGISTRY.register("amulet_of_flight_chestplate",
			() -> new AmuletOfFlightItem.Chestplate());
	public static final RegistryObject<Item> ANCIENT_PORTAL_FRAME_CASE = block(NeiModBlocks.ANCIENT_PORTAL_FRAME_CASE, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> TEST_DOG_1 = block(NeiModBlocks.TEST_DOG_1, NeiModTabs.TAB_NEI);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
