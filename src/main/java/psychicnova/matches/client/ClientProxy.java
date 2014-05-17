package psychicnova.matches.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import psychicnova.matches.*;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(WaspEntity.class, new RenderWasp());
        RenderingRegistry.registerEntityRenderingHandler(MNovaEntity.class, new RenderMNova());
        RenderingRegistry.registerEntityRenderingHandler(HeroBossEntity.class, new RenderHeroBoss());
        RenderingRegistry.registerEntityRenderingHandler(ZebraEntity.class, new RenderZebra());
    }
}
