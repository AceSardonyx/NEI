
package net.hasco.nei.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.hasco.nei.procedures.AmuletOfFlightBodyTickEventProcedure;
import net.hasco.nei.init.NeiModTabs;

public abstract class AmuletOfFlightItem extends ArmorItem {
	public AmuletOfFlightItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{0, 0, 10, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 32;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.RAW_GOLD), new ItemStack(Items.GOLD_INGOT));
			}

			@Override
			public String getName() {
				return "amulet_of_flight";
			}

			@Override
			public float getToughness() {
				return 4.2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Chestplate extends AmuletOfFlightItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(NeiModTabs.TAB_NEI_CREATIVE).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "nei:textures/models/armor/amuletbluearmor__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			AmuletOfFlightBodyTickEventProcedure.execute(entity);
		}
	}
}
