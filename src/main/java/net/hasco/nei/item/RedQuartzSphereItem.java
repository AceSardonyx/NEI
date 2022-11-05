
package net.hasco.nei.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.hasco.nei.procedures.RedQuartzSphereRightclickedProcedure;
import net.hasco.nei.init.NeiModTabs;

import java.util.List;

public class RedQuartzSphereItem extends Item {
	public RedQuartzSphereItem() {
		super(new Item.Properties().tab(NeiModTabs.TAB_NEI).stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("An Omnicient Glowing Orb..."));
		list.add(new TextComponent("You can see through it"));
		list.add(new TextComponent("but it looks like there is something inside too."));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		RedQuartzSphereRightclickedProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
