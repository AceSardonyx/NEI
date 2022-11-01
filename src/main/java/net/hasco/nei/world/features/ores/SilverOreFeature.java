
package net.hasco.nei.world.features.ores;

public class SilverOreFeature extends OreFeature {

	public static SilverOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SilverOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("nei:silver_ore", FEATURE,
				new OreConfiguration(SilverOreFeatureRuleTest.INSTANCE, NeiModBlocks.SILVER_ORE.get().defaultBlockState(), 8));
		PLACED_FEATURE = PlacementUtils.register("nei:silver_ore", CONFIGURED_FEATURE, List.of(CountPlacement.of(10), InSquarePlacement.spread(),
				HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(20)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("frozen_ocean"), new ResourceLocation("frozen_river"),
			new ResourceLocation("snowy_plains"), new ResourceLocation("snowy_slopes"), new ResourceLocation("cold_ocean"),
			new ResourceLocation("snowy_taiga"), new ResourceLocation("deep_frozen_ocean"), new ResourceLocation("deep_cold_ocean"),
			new ResourceLocation("ice_spikes"), new ResourceLocation("windswept_hills"), new ResourceLocation("frozen_peaks"),
			new ResourceLocation("old_growth_spruce_taiga"), new ResourceLocation("snowy_beach"));

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD,
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("nei:astral_plain")));

	public SilverOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class SilverOreFeatureRuleTest extends RuleTest {

		static final SilverOreFeatureRuleTest INSTANCE = new SilverOreFeatureRuleTest();

		private static final com.mojang.serialization.Codec<SilverOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<SilverOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("nei:silver_ore_match"), CUSTOM_MATCH);
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
