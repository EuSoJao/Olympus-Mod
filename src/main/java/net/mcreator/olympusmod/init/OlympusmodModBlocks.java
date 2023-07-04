
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.olympusmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.olympusmod.block.FirestoneBlockBlock;
import net.mcreator.olympusmod.block.FireStoneOreBlock;
import net.mcreator.olympusmod.block.DeepSlateFireStoneOreBlock;
import net.mcreator.olympusmod.OlympusmodMod;

public class OlympusmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OlympusmodMod.MODID);
	public static final RegistryObject<Block> FIRE_STONE_ORE = REGISTRY.register("fire_stone_ore", () -> new FireStoneOreBlock());
	public static final RegistryObject<Block> DEEP_SLATE_FIRE_STONE_ORE = REGISTRY.register("deep_slate_fire_stone_ore", () -> new DeepSlateFireStoneOreBlock());
	public static final RegistryObject<Block> FIRESTONE_BLOCK = REGISTRY.register("firestone_block", () -> new FirestoneBlockBlock());
}
