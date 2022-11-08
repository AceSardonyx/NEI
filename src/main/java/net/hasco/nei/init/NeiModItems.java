
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

import net.hasco.nei.item.UnshapedParticlesItem;
import net.hasco.nei.item.StardustItem;
import net.hasco.nei.item.StarSilkItem;
import net.hasco.nei.item.StarFractalSilkItem;
import net.hasco.nei.item.StarClusterItem;
import net.hasco.nei.item.SoulGemItem;
import net.hasco.nei.item.NEIIconItem;
import net.hasco.nei.item.FractalGemItem;
import net.hasco.nei.item.AstralTomeItem;
import net.hasco.nei.item.AstralSwordItem;
import net.hasco.nei.item.AncientLotusItem;
import net.hasco.nei.item.AmuletOfFlightItem;
import net.hasco.nei.NeiMod;

public class NeiModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NeiMod.MODID);
	public static final RegistryObject<Item> NEI_ICON = REGISTRY.register("nei_icon", () -> new NEIIconItem());
	public static final RegistryObject<Item> ASTRAL_SWORD = REGISTRY.register("astral_sword", () -> new AstralSwordItem());
	public static final RegistryObject<Item> AMULET_OF_FLIGHT_CHESTPLATE = REGISTRY.register("amulet_of_flight_chestplate",
			() -> new AmuletOfFlightItem.Chestplate());
	public static final RegistryObject<Item> STAR_FLOWER = block(NeiModBlocks.STAR_FLOWER, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> ANCIENT_WOOD = block(NeiModBlocks.ANCIENT_WOOD, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> ANCIENT_LOG = block(NeiModBlocks.ANCIENT_LOG, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> ANCIENT_PLANKS = block(NeiModBlocks.ANCIENT_PLANKS, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> ANCIENT_LEAVES = block(NeiModBlocks.ANCIENT_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ANCIENT_STAIRS = block(NeiModBlocks.ANCIENT_STAIRS, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> ANCIENT_SLAB = block(NeiModBlocks.ANCIENT_SLAB, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> ANCIENT_FENCE = block(NeiModBlocks.ANCIENT_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ANCIENT_FENCE_GATE = block(NeiModBlocks.ANCIENT_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ANCIENT_PRESSURE_PLATE = block(NeiModBlocks.ANCIENT_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ANCIENT_BUTTON = block(NeiModBlocks.ANCIENT_BUTTON, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> FRACTAL_GEM = REGISTRY.register("fractal_gem", () -> new FractalGemItem());
	public static final RegistryObject<Item> FRACTAL_GEM_ORE = block(NeiModBlocks.FRACTAL_GEM_ORE, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> FRACTAL_GEM_BLOCK = block(NeiModBlocks.FRACTAL_GEM_BLOCK, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> GOLDEN_FLOWER = block(NeiModBlocks.GOLDEN_FLOWER, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> IMPERFECT_STAR_FLOWER = block(NeiModBlocks.IMPERFECT_STAR_FLOWER, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> UNSHAPED_PARTICLES = REGISTRY.register("unshaped_particles", () -> new UnshapedParticlesItem());
	public static final RegistryObject<Item> ASTRAL_BLOCK = block(NeiModBlocks.ASTRAL_BLOCK, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> SOUL_GEM = REGISTRY.register("soul_gem", () -> new SoulGemItem());
	public static final RegistryObject<Item> SOUL_GEM_BLOCK = block(NeiModBlocks.SOUL_GEM_BLOCK, NeiModTabs.TAB_NEI_CREATIVE);
	public static final RegistryObject<Item> STARDUST = REGISTRY.register("stardust", () -> new StardustItem());
	public static final RegistryObject<Item> STAR_CLUSTER = REGISTRY.register("star_cluster", () -> new StarClusterItem());
	public static final RegistryObject<Item> ASTRAL_TOME = REGISTRY.register("astral_tome", () -> new AstralTomeItem());
	public static final RegistryObject<Item> ANCIENT_LOTUS = REGISTRY.register("ancient_lotus", () -> new AncientLotusItem());
	public static final RegistryObject<Item> STAR_SILK = REGISTRY.register("star_silk", () -> new StarSilkItem());
	public static final RegistryObject<Item> STAR_FRACTAL_SILK = REGISTRY.register("star_fractal_silk", () -> new StarFractalSilkItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
