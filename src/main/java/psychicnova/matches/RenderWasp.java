package psychicnova.matches;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderWasp extends RenderLiving {
    private static final ResourceLocation textureLocation
           = new ResourceLocation(MatchesMod.MODID + ":" + "textures/models/wasp.png");

    public RenderWasp() {
        super(new ModelWasp(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity wasp) {
        return textureLocation;
    }
}
