
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.olympusmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.olympusmod.world.features.ores.FireBlockFeature;
import net.mcreator.olympusmod.OlympusmodMod;

@Mod.EventBusSubscriber
public class OlympusmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, OlympusmodMod.MODID);
	public static final RegistryObject<Feature<?>> FIRE_BLOCK = REGISTRY.register("fire_block", FireBlockFeature::new);
}
