package psychicnova.matches;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelHorse;
import net.minecraft.client.renderer.entity.RenderHorse;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class RenderZebra extends RenderHorse{
    private static final ResourceLocation textureLocation
            = new ResourceLocation(MatchesMod.MODID + ":" + "textures/models/Zebra.png");

    public RenderZebra() {
        super(new ModelHorse(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity zebra) {
        return textureLocation;
    }
}


