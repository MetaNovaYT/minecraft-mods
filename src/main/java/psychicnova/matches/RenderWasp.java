package psychicnova.matches;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderWasp extends RenderBiped {
    private static final ResourceLocation textureLocation
           = new ResourceLocation(MatchesMod.MODID + ":" + "textures/models/wasp.png");

    public RenderWasp() {
        super(new ModelBiped(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityLiving par1EntityLiving) {
        return textureLocation;
    }
}
