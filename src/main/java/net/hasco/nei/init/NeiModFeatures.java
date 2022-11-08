
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hasco.nei.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.hasco.nei.world.features.plants.StarFlowerFeature;
import net.hasco.nei.world.features.plants.ImperfectStarFlowerFeature;
import net.hasco.nei.world.features.plants.GoldenFlowerFeature;
import net.hasco.nei.NeiMod;

@Mod.EventBusSubscriber
public class NeiModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, NeiMod.MODID);
	public static final RegistryObject<Feature<?>> STAR_FLOWER = REGISTRY.register("star_flower", StarFlowerFeature::feature);
	public static final RegistryObject<Feature<?>> GOLDEN_FLOWER = REGISTRY.register("golden_flower", GoldenFlowerFeature::feature);
	public static final RegistryObject<Feature<?>> IMPERFECT_STAR_FLOWER = REGISTRY.register("imperfect_star_flower",
			ImperfectStarFlowerFeature::feature);
}
