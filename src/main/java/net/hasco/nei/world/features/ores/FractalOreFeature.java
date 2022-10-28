
package net.hasco.nei.world.features.ores;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.hasco.nei.init.NeiModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class FractalOreFeature extends OreFeature {
	public static FractalOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new FractalOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("nei:fractal_ore", FEATURE,
				new OreConfiguration(FractalOreFeatureRuleTest.INSTANCE, NeiModBlocks.FRACTAL_ORE.get().defaultBlockState(), 2));
		PLACED_FEATURE = PlacementUtils.register("nei:fractal_ore", CONFIGURED_FEATURE, List.of(CountPlacement.of(3), InSquarePlacement.spread(),
				HeightRangePlacement.uniform(VerticalAnchor.absolute(-10), VerticalAnchor.absolute(20)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("warm_ocean"), new ResourceLocation("mushroom_fields"),
			new ResourceLocation("end_midlands"), new ResourceLocation("flower_forest"), new ResourceLocation("lush_caves"),
			new ResourceLocation("cold_ocean"), new ResourceLocation("the_end"), new ResourceLocation("lukewarm_ocean"),
			new ResourceLocation("dark_forest"), new ResourceLocation("savanna"), new ResourceLocation("stony_peaks"),
			new ResourceLocation("savanna_plateau"), new ResourceLocation("dripstone_caves"), new ResourceLocation("jagged_peaks"),
			new ResourceLocation("eroded_badlands"), new ResourceLocation("badlands"), new ResourceLocation("windswept_hills"),
			new ResourceLocation("ocean"), new ResourceLocation("wooded_badlands"), new ResourceLocation("windswept_savanna"),
			new ResourceLocation("jungle"), new ResourceLocation("warped_forest"), new ResourceLocation("forest"),
			new ResourceLocation("stony_shore"), new ResourceLocation("sparse_jungle"), new ResourceLocation("birch_forest"),
			new ResourceLocation("deep_lukewarm_ocean"), new ResourceLocation("deep_ocean"), new ResourceLocation("deep_frozen_ocean"),
			new ResourceLocation("nether_wastes"), new ResourceLocation("bamboo_jungle"), new ResourceLocation("soul_sand_valley"),
			new ResourceLocation("small_end_islands"), new ResourceLocation("plains"), new ResourceLocation("end_highlands"),
			new ResourceLocation("meadow"), new ResourceLocation("end_barrens"), new ResourceLocation("basalt_deltas"), new ResourceLocation("taiga"),
			new ResourceLocation("crimson_forest"), new ResourceLocation("swamp"), new ResourceLocation("deep_cold_ocean"),
			new ResourceLocation("grove"), new ResourceLocation("beach"), new ResourceLocation("the_void"), new ResourceLocation("windswept_forest"),
			new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("river"), new ResourceLocation("desert"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD,
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("nei:astral_plain")));

	public FractalOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class FractalOreFeatureRuleTest extends RuleTest {
		static final FractalOreFeatureRuleTest INSTANCE = new FractalOreFeatureRuleTest();
		private static final com.mojang.serialization.Codec<FractalOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<FractalOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("nei:fractal_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE);
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
