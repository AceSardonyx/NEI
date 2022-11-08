package net.hasco.nei.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.hasco.nei.init.NeiModItems;
import net.hasco.nei.init.NeiModBlocks;

import java.util.Map;
import java.util.Iterator;

public class ImperfectConversionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(NeiModItems.UNSHAPED_PARTICLES.get()))
				: false) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == NeiModBlocks.IMPERFECT_STAR_FLOWER.get()) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(NeiModItems.UNSHAPED_PARTICLES.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.flowering_azalea.break")), SoundSource.BLOCKS, 3,
								(float) 0.9);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.flowering_azalea.break")),
								SoundSource.BLOCKS, 3, (float) 0.9, false);
					}
				}
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = Blocks.WITHER_ROSE.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("nei:fruit_and_granny"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("nei:granny_fraulax"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You Feel A Slight Breeze..."), (true));
			}
		}
	}
}
