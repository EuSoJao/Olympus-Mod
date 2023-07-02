
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.olympusmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.olympusmod.item.FireSwordItem;
import net.mcreator.olympusmod.item.FireStoneItem;
import net.mcreator.olympusmod.OlympusmodMod;

public class OlympusmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OlympusmodMod.MODID);
	public static final RegistryObject<Item> FIRE_STONE = REGISTRY.register("fire_stone", () -> new FireStoneItem());
	public static final RegistryObject<Item> FIRE_SWORD = REGISTRY.register("fire_sword", () -> new FireSwordItem());
}
