package psychicnova.matches;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderMNova extends RenderBiped {
    private static final ResourceLocation textureLocation
           = new ResourceLocation(MatchesMod.MODID + ":" + "textures/models/MNova.png");

    public RenderMNova() {
        super(new ModelBiped(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity MNova) {
        return textureLocation;
    }
}

