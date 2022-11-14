
package net.hasco.nei.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.hasco.nei.init.NeiModTabs;
import net.hasco.nei.init.NeiModItems;

public abstract class CorruptedAmuletItem extends ArmorItem {
	public CorruptedAmuletItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 50;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{0, 0, 100, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 50;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(NeiModItems.PARTICLES.get()));
			}

			@Override
			public String getName() {
				return "corrupted_amulet";
			}

			@Override
			public float getToughness() {
				return 3.6999999999999997f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Chestplate extends CorruptedAmuletItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(NeiModTabs.TAB_NEI).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "nei:textures/entities/corrupted_amulet.png";
		}
	}
}
