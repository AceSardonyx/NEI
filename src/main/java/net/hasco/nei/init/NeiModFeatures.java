
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.hasco.nei.world.features.plants.StarFlowerFeature;
import net.hasco.nei.world.features.plants.ImperfectStarFlowerFeature;
import net.hasco.nei.world.features.plants.GoldenFlowerFeature;
import net.hasco.nei.world.features.ores.SteelOreFeature;
import net.hasco.nei.world.features.ores.SilverOreFeature;
import net.hasco.nei.world.features.ores.FractalOreFeature;
import net.hasco.nei.world.features.ores.DeepslateSteelOreFeature;
import net.hasco.nei.world.features.ores.DeepslateSilverOreFeature;
import net.hasco.nei.world.features.lakes.PhelliumFeature;
import net.hasco.nei.NeiMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class NeiModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, NeiMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> STAR_FLOWER = register("star_flower", StarFlowerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, StarFlowerFeature.GENERATE_BIOMES, StarFlowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PHELLIUM = register("phellium", PhelliumFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, PhelliumFeature.GENERATE_BIOMES, PhelliumFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FRACTAL_ORE = register("fractal_ore", FractalOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, FractalOreFeature.GENERATE_BIOMES, FractalOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GOLDEN_FLOWER = register("golden_flower", GoldenFlowerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, GoldenFlowerFeature.GENERATE_BIOMES, GoldenFlowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> IMPERFECT_STAR_FLOWER = register("imperfect_star_flower", ImperfectStarFlowerFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ImperfectStarFlowerFeature.GENERATE_BIOMES,
					ImperfectStarFlowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SILVER_ORE = register("silver_ore", SilverOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES, SilverOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore", DeepslateSilverOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateSilverOreFeature.GENERATE_BIOMES,
					DeepslateSilverOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STEEL_ORE = register("steel_ore", SteelOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SteelOreFeature.GENERATE_BIOMES, SteelOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_STEEL_ORE = register("deepslate_steel_ore", DeepslateSteelOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateSteelOreFeature.GENERATE_BIOMES,
					DeepslateSteelOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
