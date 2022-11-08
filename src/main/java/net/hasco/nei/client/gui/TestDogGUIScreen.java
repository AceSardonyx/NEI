
package net.hasco.nei.client.gui;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.Minecraft;

import net.hasco.nei.world.inventory.TestDogGUIMenu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TestDogGUIScreen extends AbstractContainerScreen<TestDogGUIMenu> {
	private final static HashMap<String, Object> guistate = TestDogGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox dog;
	EditBox test;

	public TestDogGUIScreen(TestDogGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 151;
		this.imageHeight = 143;
	}

	private static final ResourceLocation texture = new ResourceLocation("nei:textures/screens/test_dog_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		test.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (test.isFocused())
			return test.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		test.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "" + (new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z))) + " test", 40, 11, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		dog = new Checkbox(this.leftPos + 61, this.topPos + 59, 20, 20, Component.literal("do it?"), false);
		guistate.put("checkbox:dog", dog);
		this.addRenderableWidget(dog);
		test = new EditBox(this.font, this.leftPos + 14, this.topPos + 29, 120, 20, Component.literal("test")) {
			{
				setSuggestion("test");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("test");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("test");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:test", test);
		test.setMaxLength(32767);
		this.addWidget(this.test);
	}
}
