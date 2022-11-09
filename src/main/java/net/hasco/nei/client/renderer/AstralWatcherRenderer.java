
package net.hasco.nei.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.hasco.nei.entity.AstralWatcherEntity;

public class AstralWatcherRenderer extends HumanoidMobRenderer<AstralWatcherEntity, HumanoidModel<AstralWatcherEntity>> {
	public AstralWatcherRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 1.7000000000000002f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new EyesLayer<AstralWatcherEntity, HumanoidModel<AstralWatcherEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("nei:textures/entities/astral_god.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AstralWatcherEntity entity) {
		return new ResourceLocation("nei:textures/entities/astral_watcher.png");
	}
}
