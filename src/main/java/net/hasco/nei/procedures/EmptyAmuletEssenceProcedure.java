package net.hasco.nei.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Random;
import java.util.Iterator;

public class EmptyAmuletEssenceProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.giveExperienceLevels(1);
		if (entity instanceof Player _player)
			_player.causeFoodExhaustion((float) 0.1);
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("nei:peace_on_earth"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				Iterator _iterator = _ap.getRemainingCriteria().iterator();
				while (_iterator.hasNext())
					_player.getAdvancements().award(_adv, (String) _iterator.next());
			}
		}
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("nei:a_little_place_called_home"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				Iterator _iterator = _ap.getRemainingCriteria().iterator();
				while (_iterator.hasNext())
					_player.getAdvancements().award(_adv, (String) _iterator.next());
			}
		}
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt((int) Mth.nextDouble(new Random(), 1, 10), new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
