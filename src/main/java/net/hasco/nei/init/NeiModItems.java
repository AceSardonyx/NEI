
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.hasco.nei.item.SteelNuggetItem;
import net.hasco.nei.item.SteelIngotItem;
import net.hasco.nei.item.StardustItem;
import net.hasco.nei.item.StarSilkItem;
import net.hasco.nei.item.StarFractalSilkItem;
import net.hasco.nei.item.StarClusterItem;
import net.hasco.nei.item.SoulGemItem;
import net.hasco.nei.item.SlimePowderItem;
import net.hasco.nei.item.SilverNuggetItem;
import net.hasco.nei.item.SilverIngotItem;
import net.hasco.nei.item.RedQuartzSphereItem;
import net.hasco.nei.item.PhosphocoreItem;
import net.hasco.nei.item.PhelliumItem;
import net.hasco.nei.item.ParticlesItem;
import net.hasco.nei.item.NitrophosphateItem;
import net.hasco.nei.item.NEIIconItem;
import net.hasco.nei.item.FractalItem;
import net.hasco.nei.item.EyeFrameItem;
import net.hasco.nei.item.EmptyAmuletItem;
import net.hasco.nei.item.CrystalLatexAdhesiveItem;
import net.hasco.nei.item.CorruptedAmuletItem;
import net.hasco.nei.item.ContainedAuraItem;
import net.hasco.nei.item.BookOfAvaritiaItem;
import net.hasco.nei.item.AstralTomeItem;
import net.hasco.nei.item.AstralSwordBetaItem;
import net.hasco.nei.item.AstralPlainItem;
import net.hasco.nei.item.AncientLotusItem;
import net.hasco.nei.item.AmuletPieceItem;
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
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> SILVER_ORE = block(NeiModBlocks.SILVER_ORE, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> SILVER_BLOCK = block(NeiModBlocks.SILVER_BLOCK, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> DEEPSLATE_SILVER_ORE = block(NeiModBlocks.DEEPSLATE_SILVER_ORE, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", () -> new SilverNuggetItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> STEEL_ORE = block(NeiModBlocks.STEEL_ORE, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> STEEL_BLOCK = block(NeiModBlocks.STEEL_BLOCK, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> STEEL_NUGGET = REGISTRY.register("steel_nugget", () -> new SteelNuggetItem());
	public static final RegistryObject<Item> DEEPSLATE_STEEL_ORE = block(NeiModBlocks.DEEPSLATE_STEEL_ORE, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> PHOSPHOCORE = REGISTRY.register("phosphocore", () -> new PhosphocoreItem());
	public static final RegistryObject<Item> RED_QUARTZ_SPHERE = REGISTRY.register("red_quartz_sphere", () -> new RedQuartzSphereItem());
	public static final RegistryObject<Item> NITROPHOSPHATE = REGISTRY.register("nitrophosphate", () -> new NitrophosphateItem());
	public static final RegistryObject<Item> CONTAINED_AURA = REGISTRY.register("contained_aura", () -> new ContainedAuraItem());
	public static final RegistryObject<Item> SOUL_GEM = REGISTRY.register("soul_gem", () -> new SoulGemItem());
	public static final RegistryObject<Item> SOUL_GEM_BLOCK = block(NeiModBlocks.SOUL_GEM_BLOCK, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> BOOK_OF_AVARITIA = REGISTRY.register("book_of_avaritia", () -> new BookOfAvaritiaItem());
	public static final RegistryObject<Item> PAPER_LANTERN = block(NeiModBlocks.PAPER_LANTERN, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> OAK_LANTERN = block(NeiModBlocks.OAK_LANTERN, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> PARTICLES = REGISTRY.register("particles", () -> new ParticlesItem());
	public static final RegistryObject<Item> EMPTY_AMULET = REGISTRY.register("empty_amulet", () -> new EmptyAmuletItem());
	public static final RegistryObject<Item> AMULET_PIECE = REGISTRY.register("amulet_piece", () -> new AmuletPieceItem());
	public static final RegistryObject<Item> ASTRAL_WATCHER = REGISTRY.register("astral_watcher_spawn_egg",
			() -> new ForgeSpawnEggItem(NeiModEntities.ASTRAL_WATCHER, -13104545, -4738049, new Item.Properties().tab(NeiModTabs.TAB_NEI)));
	public static final RegistryObject<Item> BIRCH_LANTERN = block(NeiModBlocks.BIRCH_LANTERN, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> SPRUCE_LANTERN = block(NeiModBlocks.SPRUCE_LANTERN, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> JUNGLE_LANTERN = block(NeiModBlocks.JUNGLE_LANTERN, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> CORRUPTED_AMULET_CHESTPLATE = REGISTRY.register("corrupted_amulet_chestplate",
			() -> new CorruptedAmuletItem.Chestplate());
	public static final RegistryObject<Item> EYE_FRAME = REGISTRY.register("eye_frame", () -> new EyeFrameItem());
	public static final RegistryObject<Item> SLIME_POWDER = REGISTRY.register("slime_powder", () -> new SlimePowderItem());
	public static final RegistryObject<Item> CRYSTAL_LATEX_ADHESIVE = REGISTRY.register("crystal_latex_adhesive",
			() -> new CrystalLatexAdhesiveItem());
	public static final RegistryObject<Item> ACACIA_LANTERN = block(NeiModBlocks.ACACIA_LANTERN, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> DARK_OAK_LANTERN = block(NeiModBlocks.DARK_OAK_LANTERN, NeiModTabs.TAB_NEI);
	public static final RegistryObject<Item> ANCIENT_LANTERN = block(NeiModBlocks.ANCIENT_LANTERN, NeiModTabs.TAB_NEI);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
