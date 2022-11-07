package net.hasco.nei.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.hasco.nei.init.NeiModItems;

import java.util.Iterator;

public class RedQuartzSphereRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player)
			_player.setGameMode(GameType.SURVIVAL);
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(NeiModItems.RED_QUARTZ_SPHERE.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.TINTED_GLASS.defaultBlockState()));
		class RedQuartzSphereRightclickedWait9 {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				this.world = world;
				MinecraftForge.EVENT_BUS.register(RedQuartzSphereRightclickedWait9.this);
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					RedQuartzSphereRightclickedWait9.this.ticks += 1;
					if (RedQuartzSphereRightclickedWait9.this.ticks >= RedQuartzSphereRightclickedWait9.this.waitTicks)
						run();
				}
			}

			private void run() {
				MinecraftForge.EVENT_BUS.unregister(RedQuartzSphereRightclickedWait9.this);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")),
								SoundSource.BLOCKS, 1, 1, false);
					}
				}
				class RedQuartzSphereRightclickedWait8 {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						this.world = world;
						MinecraftForge.EVENT_BUS.register(RedQuartzSphereRightclickedWait8.this);
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							RedQuartzSphereRightclickedWait8.this.ticks += 1;
							if (RedQuartzSphereRightclickedWait8.this.ticks >= RedQuartzSphereRightclickedWait8.this.waitTicks)
								run();
						}
					}

					private void run() {
						MinecraftForge.EVENT_BUS.unregister(RedQuartzSphereRightclickedWait8.this);
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("Something Seems Off..."), (true));
						class RedQuartzSphereRightclickedWait7 {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								this.world = world;
								MinecraftForge.EVENT_BUS.register(RedQuartzSphereRightclickedWait7.this);
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									RedQuartzSphereRightclickedWait7.this.ticks += 1;
									if (RedQuartzSphereRightclickedWait7.this.ticks >= RedQuartzSphereRightclickedWait7.this.waitTicks)
										run();
								}
							}

							private void run() {
								MinecraftForge.EVENT_BUS.unregister(RedQuartzSphereRightclickedWait7.this);
								if (world instanceof ServerLevel _level) {
									LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
									entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
									entityToSpawn.setVisualOnly(false);
									_level.addFreshEntity(entityToSpawn);
								}
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("nei:im_dangerous"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemainingCriteria().iterator();
										while (_iterator.hasNext())
											_player.getAdvancements().award(_adv, (String) _iterator.next());
									}
								}
							}
						}
						new RedQuartzSphereRightclickedWait7().start(world, 600);
					}
				}
				new RedQuartzSphereRightclickedWait8().start(world, 60);
			}
		}
		new RedQuartzSphereRightclickedWait9().start(world, 30);
	}
}
