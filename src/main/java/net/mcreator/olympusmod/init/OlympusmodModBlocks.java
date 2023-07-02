
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.olympusmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.olympusmod.block.FireBlockBlock;
import net.mcreator.olympusmod.OlympusmodMod;

public class OlympusmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OlympusmodMod.MODID);
	public static final RegistryObject<Block> FIRE_BLOCK = REGISTRY.register("fire_block", () -> new FireBlockBlock());
}