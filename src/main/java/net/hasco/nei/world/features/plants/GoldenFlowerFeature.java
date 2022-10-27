
package net.hasco.nei.world.features.plants;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
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
import java.util.List;

public class GoldenFlowerFeature extends RandomPatchFeature {
	public static GoldenFlowerFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new GoldenFlowerFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("nei:golden_flower", FEATURE, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
				new SimpleBlockConfiguration(BlockStateProvider.simple(NeiModBlocks.GOLDEN_FLOWER.get().defaultBlockState())), List.of(), 64));
		PLACED_FEATURE = PlacementUtils.register("nei:golden_flower", CONFIGURED_FEATURE, List.of(CountPlacement.of(5),
				RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("warm_ocean"), new ResourceLocation("mushroom_fields"),
			new ResourceLocation("sunflower_plains"), new ResourceLocation("end_midlands"), new ResourceLocation("flower_forest"),
			new ResourceLocation("lush_caves"), new ResourceLocation("cold_ocean"), new ResourceLocation("the_end"),
			new ResourceLocation("ice_spikes"), new ResourceLocation("lukewarm_ocean"), new ResourceLocation("dark_forest"),
			new ResourceLocation("savanna"), new ResourceLocation("stony_peaks"), new ResourceLocation("snowy_beach"),
			new ResourceLocation("frozen_ocean"), new ResourceLocation("savanna_plateau"), new ResourceLocation("dripstone_caves"),
			new ResourceLocation("snowy_plains"), new ResourceLocation("jagged_peaks"), new ResourceLocation("eroded_badlands"),
			new ResourceLocation("badlands"), new ResourceLocation("windswept_hills"), new ResourceLocation("ocean"),
			new ResourceLocation("wooded_badlands"), new ResourceLocation("windswept_savanna"), new ResourceLocation("jungle"),
			new ResourceLocation("warped_forest"), new ResourceLocation("frozen_river"), new ResourceLocation("forest"),
			new ResourceLocation("stony_shore"), new ResourceLocation("sparse_jungle"), new ResourceLocation("birch_forest"),
			new ResourceLocation("deep_lukewarm_ocean"), new ResourceLocation("snowy_slopes"), new ResourceLocation("deep_ocean"),
			new ResourceLocation("deep_frozen_ocean"), new ResourceLocation("nether_wastes"), new ResourceLocation("bamboo_jungle"),
			new ResourceLocation("soul_sand_valley"), new ResourceLocation("small_end_islands"), new ResourceLocation("plains"),
			new ResourceLocation("frozen_peaks"), new ResourceLocation("end_highlands"), new ResourceLocation("meadow"),
			new ResourceLocation("end_barrens"), new ResourceLocation("old_growth_spruce_taiga"), new ResourceLocation("basalt_deltas"),
			new ResourceLocation("taiga"), new ResourceLocation("crimson_forest"), new ResourceLocation("snowy_taiga"), new ResourceLocation("swamp"),
			new ResourceLocation("deep_cold_ocean"), new ResourceLocation("old_growth_birch_forest"), new ResourceLocation("grove"),
			new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("beach"), new ResourceLocation("the_void"),
			new ResourceLocation("windswept_forest"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("river"),
			new ResourceLocation("desert"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("nei:astral_plain")), Level.OVERWORLD);

	public GoldenFlowerFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
