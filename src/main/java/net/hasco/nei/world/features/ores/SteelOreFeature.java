
package net.hasco.nei.world.features.ores;

public class SteelOreFeature extends OreFeature {

	public static SteelOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SteelOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("nei:steel_ore", FEATURE,
				new OreConfiguration(SteelOreFeatureRuleTest.INSTANCE, NeiModBlocks.STEEL_ORE.get().defaultBlockState(), 6));
		PLACED_FEATURE = PlacementUtils.register("nei:steel_ore", CONFIGURED_FEATURE, List.of(CountPlacement.of(7), InSquarePlacement.spread(),
				HeightRangePlacement.triangle(VerticalAnchor.absolute(1), VerticalAnchor.absolute(18)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("badlands"), new ResourceLocation("grove"),
			new ResourceLocation("sunflower_plains"), new ResourceLocation("wooded_badlands"), new ResourceLocation("lush_caves"),
			new ResourceLocation("swamp"), new ResourceLocation("nei:astral_field"), new ResourceLocation("meadow"));

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public SteelOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class SteelOreFeatureRuleTest extends RuleTest {

		static final SteelOreFeatureRuleTest INSTANCE = new SteelOreFeatureRuleTest();

		private static final com.mojang.serialization.Codec<SteelOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<SteelOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("nei:steel_ore_match"), CUSTOM_MATCH);
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
