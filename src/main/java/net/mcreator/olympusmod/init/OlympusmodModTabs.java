
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.olympusmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OlympusmodModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(OlympusmodModItems.FIRE_SWORD.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(OlympusmodModItems.FIRE_STONE.get());
		}

		if (tabData.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(OlympusmodModItems.PICAGODS.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("olympusmod", "olympus"),
				builder -> builder.title(Component.translatable("item_group.olympusmod.olympus")).icon(() -> new ItemStack(OlympusmodModItems.FIRE_STONE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(OlympusmodModBlocks.FIRE_STONE_ORE.get().asItem());
					tabData.accept(OlympusmodModBlocks.DEEP_SLATE_FIRE_STONE_ORE.get().asItem());
					tabData.accept(OlympusmodModItems.RAY_GUN.get());
				}).withSearchBar());
	}
}
