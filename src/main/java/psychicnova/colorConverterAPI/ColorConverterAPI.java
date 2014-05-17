package psychicnova.colorConverterAPI;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod.EventHandler;


@Mod(modid = ColorConverterAPI.MODID, version = ColorConverterAPI.VERSION)
public class ColorConverterAPI {
    public static final String MODID = "colrConvAPI";
    public static final String VERSION = "Pre-Alpha-0.0.1";

    // The instance of your mod that Forge uses.
    @Mod.Instance(value = ColorConverterAPI.MODID)
    public static ColorConverterAPI instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="psychicnova.colorConverterAPI.client.ClientProxy", serverSide="psychicnova.colorConverterAPI.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event) {
        proxy.registerRenderers();
        System.out.println("preInit on the ColorConverterAPI mod!");
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event) {
        System.out.println("load on the ColorConverterAPI mod!");
        proxy.registerRenderers();
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("postInit on the ColorConverterAPI mod!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Welcome to the ColorConverterAPI mod!");
    }
}

