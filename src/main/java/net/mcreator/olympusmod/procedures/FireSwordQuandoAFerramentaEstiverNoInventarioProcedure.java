package net.mcreator.olympusmod.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class FireSwordQuandoAFerramentaEstiverNoInventarioProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getEnchantmentLevel(Enchantments.FIRE_ASPECT) == 0) {
			itemstack.enchant(Enchantments.FIRE_ASPECT, 10);
		}
	}
}
