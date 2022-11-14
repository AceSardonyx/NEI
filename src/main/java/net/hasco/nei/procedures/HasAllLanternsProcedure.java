package net.hasco.nei.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.hasco.nei.init.NeiModBlocks;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class HasAllLanternsProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(NeiModBlocks.PAPER_LANTERN.get()))
				: false) {
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(NeiModBlocks.OAK_LANTERN.get()))
					: false) {
				if (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(NeiModBlocks.BIRCH_LANTERN.get()))
						: false) {
					if (entity instanceof Player _playerHasItem
							? _playerHasItem.getInventory().contains(new ItemStack(NeiModBlocks.SPRUCE_LANTERN.get()))
							: false) {
						if (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(NeiModBlocks.JUNGLE_LANTERN.get()))
								: false) {
							if (entity instanceof Player _playerHasItem
									? _playerHasItem.getInventory().contains(new ItemStack(NeiModBlocks.ACACIA_LANTERN.get()))
									: false) {
								if (entity instanceof Player _playerHasItem
										? _playerHasItem.getInventory().contains(new ItemStack(NeiModBlocks.DARK_OAK_LANTERN.get()))
										: false) {
									if (entity instanceof Player _playerHasItem
											? _playerHasItem.getInventory().contains(new ItemStack(NeiModBlocks.ANCIENT_LANTERN.get()))
											: false) {
										if (entity instanceof ServerPlayer _player) {
											Advancement _adv = _player.server.getAdvancements()
													.getAdvancement(new ResourceLocation("nei:make_light"));
											AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
											if (!_ap.isDone()) {
												Iterator _iterator = _ap.getRemainingCriteria().iterator();
												while (_iterator.hasNext())
													_player.getAdvancements().award(_adv, (String) _iterator.next());
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
