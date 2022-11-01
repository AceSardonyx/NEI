
package net.hasco.nei.world.features.ores;

public class DeepslateSilverOreFeature extends OreFeature {

	public static DeepslateSilverOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new DeepslateSilverOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("nei:deepslate_silver_ore", FEATURE,
				new OreConfiguration(DeepslateSilverOreFeatureRuleTest.INSTANCE, NeiModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState(), 5));
		PLACED_FEATURE = PlacementUtils.register("nei:deepslate_silver_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(8), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(-10)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("frozen_ocean"), new ResourceLocation("frozen_river"),
			new ResourceLocation("snowy_plains"), new ResourceLocation("birch_forest"), new ResourceLocation("snowy_slopes"),
			new ResourceLocation("cold_ocean"), new ResourceLocation("jagged_peaks"), new ResourceLocation("snowy_taiga"),
			new ResourceLocation("deep_frozen_ocean"), new ResourceLocation("deep_cold_ocean"), new ResourceLocation("grove"),
			new ResourceLocation("ice_spikes"), new ResourceLocation("windswept_hills"), new ResourceLocation("stony_peaks"),
			new ResourceLocation("windswept_savanna"), new ResourceLocation("windswept_forest"), new ResourceLocation("frozen_peaks"),
			new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("old_growth_spruce_taiga"), new ResourceLocation("snowy_beach"));

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public DeepslateSilverOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class DeepslateSilverOreFeatureRuleTest extends RuleTest {

		static final DeepslateSilverOreFeatureRuleTest INSTANCE = new DeepslateSilverOreFeatureRuleTest();

		private static final com.mojang.serialization.Codec<DeepslateSilverOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<DeepslateSilverOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("nei:deepslate_silver_ore_match"), CUSTOM_MATCH);
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
