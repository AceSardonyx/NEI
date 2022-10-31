
package net.hasco.nei.client.gui;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.hasco.nei.world.inventory.TestDogGUIMenu;
import net.hasco.nei.network.TestDogGUIButtonMessage;
import net.hasco.nei.NeiMod;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TestDogGUIScreen extends AbstractContainerScreen<TestDogGUIMenu> {
	private final static HashMap<String, Object> guistate = TestDogGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox what;
	Checkbox huh;
	Checkbox wtf;
	EditBox realsadshit;

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
		realsadshit.render(ms, mouseX, mouseY, partialTicks);
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
		if (realsadshit.isFocused())
			return realsadshit.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		realsadshit.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "" + (new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z))) + " test", 39, 4, -52429);
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
		this.addRenderableWidget(new Button(this.leftPos + 30, this.topPos + 49, 92, 20, new TextComponent("NEI Info Pane"), e -> {
			if (true) {
				NeiMod.PACKET_HANDLER.sendToServer(new TestDogGUIButtonMessage(0, x, y, z));
				TestDogGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		what = new Checkbox(this.leftPos + 12, this.topPos + 76, 20, 20, new TextComponent("the fuck?"), false);
		guistate.put("checkbox:what", what);
		this.addRenderableWidget(what);
		huh = new Checkbox(this.leftPos + 93, this.topPos + 76, 20, 20, new TextComponent("ass!?"), false);
		guistate.put("checkbox:huh", huh);
		this.addRenderableWidget(huh);
		wtf = new Checkbox(this.leftPos + 12, this.topPos + 103, 20, 20, new TextComponent("kromer!?"), false);
		guistate.put("checkbox:wtf", wtf);
		this.addRenderableWidget(wtf);
		realsadshit = new EditBox(this.font, this.leftPos + 12, this.topPos + 22, 120, 20, new TextComponent("kill yourself")) {
			{
				setSuggestion("kill yourself");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("kill yourself");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("kill yourself");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:realsadshit", realsadshit);
		realsadshit.setMaxLength(32767);
		this.addWidget(this.realsadshit);
	}
}
