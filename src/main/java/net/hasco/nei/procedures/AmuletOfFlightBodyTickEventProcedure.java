package net.hasco.nei.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class AmuletOfFlightBodyTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			_player.getAbilities().flying = (true);
			_player.onUpdateAbilities();
		}
	}
}
