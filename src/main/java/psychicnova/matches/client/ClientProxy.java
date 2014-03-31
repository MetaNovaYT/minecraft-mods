package psychicnova.matches.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import psychicnova.matches.CommonProxy;
import psychicnova.matches.RenderWasp;
import psychicnova.matches.WaspEntity;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(WaspEntity.class, new RenderWasp());
    }
}
